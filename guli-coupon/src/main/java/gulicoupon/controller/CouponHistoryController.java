package gulicoupon.controller;


import java.util.List;
import java.util.Map;

import gulicoupon.entity.CouponHistoryEntity;
import gulicoupon.service.CouponHistoryService;
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
 * 优惠券领取历史记录
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-06 22:06:16
 */
@RestController
@RequestMapping("couponhistory")
public class CouponHistoryController {
	@Autowired
	private CouponHistoryService couponHistoryService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("couponhistory:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<CouponHistoryEntity> couponHistoryList = couponHistoryService.queryList(query);
		int total = couponHistoryService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(couponHistoryList, total, query.getLimit(), query.getCurrPage());
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("couponhistory:info")
	public R info(@PathVariable("id") Long id){
		CouponHistoryEntity couponHistory = couponHistoryService.queryObject(id);
		
		return R.ok().put("couponHistory", couponHistory);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("couponhistory:save")
	public R save(@RequestBody CouponHistoryEntity couponHistory){
		couponHistoryService.save(couponHistory);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("couponhistory:update")
	public R update(@RequestBody CouponHistoryEntity couponHistory){
		couponHistoryService.update(couponHistory);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("couponhistory:delete")
	public R delete(@RequestBody Long[] ids){
		couponHistoryService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
