package gulicoupon.controller;

import java.util.List;
import java.util.Map;

import gulicoupon.entity.CouponSpuEntity;
import gulicoupon.service.CouponSpuService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;
import io.renren.common.utils.R;




/**
 * 优惠券与产品关联
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-06 22:06:16
 */
@RestController
@RequestMapping("couponspu")
public class CouponSpuController {
	@Autowired
	private CouponSpuService couponSpuService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("couponspu:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<CouponSpuEntity> couponSpuList = couponSpuService.queryList(query);
		int total = couponSpuService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(couponSpuList, total, query.getLimit(), query.getCurrPage());
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("couponspu:info")
	public R info(@PathVariable("id") Long id){
		CouponSpuEntity couponSpu = couponSpuService.queryObject(id);
		
		return R.ok().put("couponSpu", couponSpu);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("couponspu:save")
	public R save(@RequestBody CouponSpuEntity couponSpu){
		couponSpuService.save(couponSpu);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("couponspu:update")
	public R update(@RequestBody CouponSpuEntity couponSpu){
		couponSpuService.update(couponSpu);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("couponspu:delete")
	public R delete(@RequestBody Long[] ids){
		couponSpuService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
