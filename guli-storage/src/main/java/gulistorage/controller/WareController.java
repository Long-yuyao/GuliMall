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

import gulistorage.entity.WareEntity;
import gulistorage.service.WareService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;
import io.renren.common.utils.R;




/**
 * 仓库信息
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-08 15:46:23
 */
@RestController
@RequestMapping("ware")
public class WareController {
	@Autowired
	private WareService wareService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("ware:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<WareEntity> wareList = wareService.queryList(query);
		int total = wareService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(wareList, total, query.getLimit(), query.getCurrPage());
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("ware:info")
	public R info(@PathVariable("id") Long id){
		WareEntity ware = wareService.queryObject(id);
		
		return R.ok().put("ware", ware);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("ware:save")
	public R save(@RequestBody WareEntity ware){
		wareService.save(ware);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("ware:update")
	public R update(@RequestBody WareEntity ware){
		wareService.update(ware);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("ware:delete")
	public R delete(@RequestBody Long[] ids){
		wareService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
