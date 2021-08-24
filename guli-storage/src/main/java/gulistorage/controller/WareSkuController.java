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

import gulistorage.entity.WareSkuEntity;
import gulistorage.service.WareSkuService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;
import io.renren.common.utils.R;




/**
 * 商品库存
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-08 15:46:23
 */
@RestController
@RequestMapping("waresku")
public class WareSkuController {
	@Autowired
	private WareSkuService wareSkuService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("waresku:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<WareSkuEntity> wareSkuList = wareSkuService.queryList(query);
		int total = wareSkuService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(wareSkuList, total, query.getLimit(), query.getCurrPage());
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("waresku:info")
	public R info(@PathVariable("id") Long id){
		WareSkuEntity wareSku = wareSkuService.queryObject(id);
		
		return R.ok().put("wareSku", wareSku);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("waresku:save")
	public R save(@RequestBody WareSkuEntity wareSku){
		wareSkuService.save(wareSku);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("waresku:update")
	public R update(@RequestBody WareSkuEntity wareSku){
		wareSkuService.update(wareSku);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("waresku:delete")
	public R delete(@RequestBody Long[] ids){
		wareSkuService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
