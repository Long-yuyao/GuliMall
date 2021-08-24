package gulicoupon.controller;

import gulicoupon.entity.CouponEntity;
import gulicoupon.service.CouponService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;
import io.renren.common.utils.R;
import lombok.Getter;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


/**
 * 优惠券信息
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-06 22:06:16
 */
@Component
@RefreshScope
@RestController
@RequestMapping("/coupon")
public class CouponController {
	@Autowired
	private CouponService couponService;
	
	/**
	 * 列表
	 */
	@Value("${coupon.user.name}")
	@Autowired
	private String name;
	@Value("${coupon.user.age}")
	@Autowired
	private Integer age;

	@RefreshScope
	@RequestMapping("/test")
	public R test()
	{
		return R.ok().put("name", name).put("age", age);
	}
	@RequestMapping("/list")
	@RequiresPermissions("coupon:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<CouponEntity> couponList = couponService.queryList(query);
		int total = couponService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(couponList, total, query.getLimit(), query.getCurrPage());
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("coupon:info")
	public R info(@PathVariable("id") Long id){
		CouponEntity coupon = couponService.queryObject(id);
		
		return R.ok().put("coupon", coupon);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("coupon:save")
	public R save(@RequestBody CouponEntity coupon){
		couponService.save(coupon);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("coupon:update")
	public R update(@RequestBody CouponEntity coupon){
		couponService.update(coupon);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("coupon:delete")
	public R delete(@RequestBody Long[] ids){
		couponService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
