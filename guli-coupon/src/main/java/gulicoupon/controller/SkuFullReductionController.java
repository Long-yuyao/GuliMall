package gulicoupon.controller;

import java.util.List;
import java.util.Map;

import gulicoupon.entity.SkuFullReductionEntity;
import gulicoupon.service.SkuFullReductionService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;
import io.renren.common.utils.R;




/**
 * 商品满减信息
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-06 22:06:16
 */
@RestController
@RequestMapping("skufullreduction")
public class SkuFullReductionController {
	@Autowired
	private SkuFullReductionService skuFullReductionService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("skufullreduction:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<SkuFullReductionEntity> skuFullReductionList = skuFullReductionService.queryList(query);
		int total = skuFullReductionService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(skuFullReductionList, total, query.getLimit(), query.getCurrPage());
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("skufullreduction:info")
	public R info(@PathVariable("id") Long id){
		SkuFullReductionEntity skuFullReduction = skuFullReductionService.queryObject(id);
		
		return R.ok().put("skuFullReduction", skuFullReduction);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("skufullreduction:save")
	public R save(@RequestBody SkuFullReductionEntity skuFullReduction){
		skuFullReductionService.save(skuFullReduction);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("skufullreduction:update")
	public R update(@RequestBody SkuFullReductionEntity skuFullReduction){
		skuFullReductionService.update(skuFullReduction);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("skufullreduction:delete")
	public R delete(@RequestBody Long[] ids){
		skuFullReductionService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
