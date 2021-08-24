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

import guliorder.entity.RefundInfoEntity;
import guliorder.service.RefundInfoService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;
import io.renren.common.utils.R;




/**
 * 退款信息
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-08 15:13:17
 */
@RestController
@RequestMapping("refundinfo")
public class RefundInfoController {
	@Autowired
	private RefundInfoService refundInfoService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("refundinfo:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<RefundInfoEntity> refundInfoList = refundInfoService.queryList(query);
		int total = refundInfoService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(refundInfoList, total, query.getLimit(), query.getCurrPage());
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("refundinfo:info")
	public R info(@PathVariable("id") Long id){
		RefundInfoEntity refundInfo = refundInfoService.queryObject(id);
		
		return R.ok().put("refundInfo", refundInfo);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("refundinfo:save")
	public R save(@RequestBody RefundInfoEntity refundInfo){
		refundInfoService.save(refundInfo);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("refundinfo:update")
	public R update(@RequestBody RefundInfoEntity refundInfo){
		refundInfoService.update(refundInfo);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("refundinfo:delete")
	public R delete(@RequestBody Long[] ids){
		refundInfoService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
