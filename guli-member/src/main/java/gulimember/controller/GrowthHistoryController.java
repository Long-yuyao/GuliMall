package gulimember.controller;

import java.util.List;
import java.util.Map;

import gulimember.feign.CouponFeignService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import gulimember.entity.GrowthHistoryEntity;
import gulimember.service.GrowthHistoryService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;
import io.renren.common.utils.R;




/**
 * 成长积分记录表
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-08 15:42:59
 */
@RestController
@RequestMapping("growthhistory")
public class GrowthHistoryController {
	@Autowired
	private GrowthHistoryService growthHistoryService;
	@Autowired
	CouponFeignService couponFeignService;//@Autowired will automatically set value of variable
	
	/**
	 * 列表
	 */
	@RequestMapping("/coupon")
	public R coupon()
	{
		R list = couponFeignService.list();
		return R.ok().put("page",list.get("page"));
	}
	@RequestMapping("/list")
	@RequiresPermissions("growthhistory:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<GrowthHistoryEntity> growthHistoryList = growthHistoryService.queryList(query);
		int total = growthHistoryService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(growthHistoryList, total, query.getLimit(), query.getCurrPage());
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("growthhistory:info")
	public R info(@PathVariable("id") Long id){
		GrowthHistoryEntity growthHistory = growthHistoryService.queryObject(id);
		
		return R.ok().put("growthHistory", growthHistory);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("growthhistory:save")
	public R save(@RequestBody GrowthHistoryEntity growthHistory){
		growthHistoryService.save(growthHistory);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("growthhistory:update")
	public R update(@RequestBody GrowthHistoryEntity growthHistory){
		growthHistoryService.update(growthHistory);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("growthhistory:delete")
	public R delete(@RequestBody Long[] ids){
		growthHistoryService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
