package guliorder.controller;

import java.util.List;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import guliorder.entity.OrderSettingEntity;
import guliorder.service.OrderSettingService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;
import io.renren.common.utils.R;




/**
 * 订单配置信息
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-08 15:13:17
 */
@RestController
@RequestMapping("ordersetting")
public class OrderSettingController {
	@Autowired
	private OrderSettingService orderSettingService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("ordersetting:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<OrderSettingEntity> orderSettingList = orderSettingService.queryList(query);
		int total = orderSettingService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(orderSettingList, total, query.getLimit(), query.getCurrPage());
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("ordersetting:info")
	public R info(@PathVariable("id") Long id){
		OrderSettingEntity orderSetting = orderSettingService.queryObject(id);
		
		return R.ok().put("orderSetting", orderSetting);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("ordersetting:save")
	public R save(@RequestBody OrderSettingEntity orderSetting){
		orderSettingService.save(orderSetting);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("ordersetting:update")
	public R update(@RequestBody OrderSettingEntity orderSetting){
		orderSettingService.update(orderSetting);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("ordersetting:delete")
	public R delete(@RequestBody Long[] ids){
		orderSettingService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
