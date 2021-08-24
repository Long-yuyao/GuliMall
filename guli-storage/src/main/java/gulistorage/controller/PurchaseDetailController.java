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

import gulistorage.entity.PurchaseDetailEntity;
import gulistorage.service.PurchaseDetailService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;
import io.renren.common.utils.R;




/**
 * 
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-08 15:46:23
 */
@RestController
@RequestMapping("purchasedetail")
public class PurchaseDetailController {
	@Autowired
	private PurchaseDetailService purchaseDetailService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("purchasedetail:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<PurchaseDetailEntity> purchaseDetailList = purchaseDetailService.queryList(query);
		int total = purchaseDetailService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(purchaseDetailList, total, query.getLimit(), query.getCurrPage());
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("purchasedetail:info")
	public R info(@PathVariable("id") Long id){
		PurchaseDetailEntity purchaseDetail = purchaseDetailService.queryObject(id);
		
		return R.ok().put("purchaseDetail", purchaseDetail);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("purchasedetail:save")
	public R save(@RequestBody PurchaseDetailEntity purchaseDetail){
		purchaseDetailService.save(purchaseDetail);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("purchasedetail:update")
	public R update(@RequestBody PurchaseDetailEntity purchaseDetail){
		purchaseDetailService.update(purchaseDetail);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("purchasedetail:delete")
	public R delete(@RequestBody Long[] ids){
		purchaseDetailService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
