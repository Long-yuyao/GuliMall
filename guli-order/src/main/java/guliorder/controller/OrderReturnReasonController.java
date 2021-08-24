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

import guliorder.entity.OrderReturnReasonEntity;
import guliorder.service.OrderReturnReasonService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;
import io.renren.common.utils.R;




/**
 * 退货原因
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-08 15:13:17
 */
@RestController
@RequestMapping("orderreturnreason")
public class OrderReturnReasonController {
	@Autowired
	private OrderReturnReasonService orderReturnReasonService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("orderreturnreason:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<OrderReturnReasonEntity> orderReturnReasonList = orderReturnReasonService.queryList(query);
		int total = orderReturnReasonService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(orderReturnReasonList, total, query.getLimit(), query.getCurrPage());
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("orderreturnreason:info")
	public R info(@PathVariable("id") Long id){
		OrderReturnReasonEntity orderReturnReason = orderReturnReasonService.queryObject(id);
		
		return R.ok().put("orderReturnReason", orderReturnReason);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("orderreturnreason:save")
	public R save(@RequestBody OrderReturnReasonEntity orderReturnReason){
		orderReturnReasonService.save(orderReturnReason);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("orderreturnreason:update")
	public R update(@RequestBody OrderReturnReasonEntity orderReturnReason){
		orderReturnReasonService.update(orderReturnReason);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("orderreturnreason:delete")
	public R delete(@RequestBody Long[] ids){
		orderReturnReasonService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
