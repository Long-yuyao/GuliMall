package gulicoupon.controller;

import java.util.List;
import java.util.Map;

import gulicoupon.entity.SkuBoundsEntity;
import gulicoupon.service.SkuBoundsService;
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
 * 商品spu积分设置
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-06 22:06:16
 */
@RestController
@RequestMapping("skubounds")
public class SkuBoundsController {
	@Autowired
	private SkuBoundsService skuBoundsService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("skubounds:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<SkuBoundsEntity> skuBoundsList = skuBoundsService.queryList(query);
		int total = skuBoundsService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(skuBoundsList, total, query.getLimit(), query.getCurrPage());
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("skubounds:info")
	public R info(@PathVariable("id") Long id){
		SkuBoundsEntity skuBounds = skuBoundsService.queryObject(id);
		
		return R.ok().put("skuBounds", skuBounds);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("skubounds:save")
	public R save(@RequestBody SkuBoundsEntity skuBounds){
		skuBoundsService.save(skuBounds);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("skubounds:update")
	public R update(@RequestBody SkuBoundsEntity skuBounds){
		skuBoundsService.update(skuBounds);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("skubounds:delete")
	public R delete(@RequestBody Long[] ids){
		skuBoundsService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
