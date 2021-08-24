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

import guliorder.entity.OrderReturnApplyEntity;
import guliorder.service.OrderReturnApplyService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;
import io.renren.common.utils.R;




/**
 * 订单退货申请
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-08 15:13:17
 */
@RestController
@RequestMapping("orderreturnapply")
public class OrderReturnApplyController {
	@Autowired
	private OrderReturnApplyService orderReturnApplyService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("orderreturnapply:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<OrderReturnApplyEntity> orderReturnApplyList = orderReturnApplyService.queryList(query);
		int total = orderReturnApplyService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(orderReturnApplyList, total, query.getLimit(), query.getCurrPage());
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("orderreturnapply:info")
	public R info(@PathVariable("id") Long id){
		OrderReturnApplyEntity orderReturnApply = orderReturnApplyService.queryObject(id);
		
		return R.ok().put("orderReturnApply", orderReturnApply);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("orderreturnapply:save")
	public R save(@RequestBody OrderReturnApplyEntity orderReturnApply){
		orderReturnApplyService.save(orderReturnApply);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("orderreturnapply:update")
	public R update(@RequestBody OrderReturnApplyEntity orderReturnApply){
		orderReturnApplyService.update(orderReturnApply);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("orderreturnapply:delete")
	public R delete(@RequestBody Long[] ids){
		orderReturnApplyService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
