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

import guliorder.entity.OrderItemEntity;
import guliorder.service.OrderItemService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;
import io.renren.common.utils.R;




/**
 * 订单项信息
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-08 15:13:17
 */
@RestController
@RequestMapping("orderitem")
public class OrderItemController {
	@Autowired
	private OrderItemService orderItemService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("orderitem:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<OrderItemEntity> orderItemList = orderItemService.queryList(query);
		int total = orderItemService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(orderItemList, total, query.getLimit(), query.getCurrPage());
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("orderitem:info")
	public R info(@PathVariable("id") Long id){
		OrderItemEntity orderItem = orderItemService.queryObject(id);
		
		return R.ok().put("orderItem", orderItem);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("orderitem:save")
	public R save(@RequestBody OrderItemEntity orderItem){
		orderItemService.save(orderItem);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("orderitem:update")
	public R update(@RequestBody OrderItemEntity orderItem){
		orderItemService.update(orderItem);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("orderitem:delete")
	public R delete(@RequestBody Long[] ids){
		orderItemService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
