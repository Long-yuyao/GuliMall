package gulicoupon.controller;

import java.util.List;
import java.util.Map;

import gulicoupon.entity.CouponSpuCategoryEntity;
import gulicoupon.service.CouponSpuCategoryService;
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
 * 优惠券分类关联
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-06 22:06:16
 */
@RestController
@RequestMapping("couponspucategory")
public class CouponSpuCategoryController {
	@Autowired
	private CouponSpuCategoryService couponSpuCategoryService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("couponspucategory:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<CouponSpuCategoryEntity> couponSpuCategoryList = couponSpuCategoryService.queryList(query);
		int total = couponSpuCategoryService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(couponSpuCategoryList, total, query.getLimit(), query.getCurrPage());
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("couponspucategory:info")
	public R info(@PathVariable("id") Long id){
		CouponSpuCategoryEntity couponSpuCategory = couponSpuCategoryService.queryObject(id);
		
		return R.ok().put("couponSpuCategory", couponSpuCategory);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("couponspucategory:save")
	public R save(@RequestBody CouponSpuCategoryEntity couponSpuCategory){
		couponSpuCategoryService.save(couponSpuCategory);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("couponspucategory:update")
	public R update(@RequestBody CouponSpuCategoryEntity couponSpuCategory){
		couponSpuCategoryService.update(couponSpuCategory);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("couponspucategory:delete")
	public R delete(@RequestBody Long[] ids){
		couponSpuCategoryService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
