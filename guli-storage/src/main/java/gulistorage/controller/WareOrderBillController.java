package gulistorage.controller;

import java.util.List;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import gulistorage.entity.WareOrderBillEntity;
import gulistorage.service.WareOrderBillService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;
import io.renren.common.utils.R;




/**
 * 库存工作单
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-08 15:46:23
 */
@RestController
@RequestMapping("wareorderbill")
public class WareOrderBillController {
	@Autowired
	private WareOrderBillService wareOrderBillService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("wareorderbill:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<WareOrderBillEntity> wareOrderBillList = wareOrderBillService.queryList(query);
		int total = wareOrderBillService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(wareOrderBillList, total, query.getLimit(), query.getCurrPage());
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("wareorderbill:info")
	public R info(@PathVariable("id") Long id){
		WareOrderBillEntity wareOrderBill = wareOrderBillService.queryObject(id);
		
		return R.ok().put("wareOrderBill", wareOrderBill);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("wareorderbill:save")
	public R save(@RequestBody WareOrderBillEntity wareOrderBill){
		wareOrderBillService.save(wareOrderBill);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("wareorderbill:update")
	public R update(@RequestBody WareOrderBillEntity wareOrderBill){
		wareOrderBillService.update(wareOrderBill);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("wareorderbill:delete")
	public R delete(@RequestBody Long[] ids){
		wareOrderBillService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
