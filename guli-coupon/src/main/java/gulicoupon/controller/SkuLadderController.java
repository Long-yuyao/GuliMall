package gulicoupon.controller;

import java.util.List;
import java.util.Map;

import gulicoupon.entity.SkuLadderEntity;
import gulicoupon.service.SkuLadderService;
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
 * 商品阶梯价格
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-06 22:06:16
 */
@RestController
@RequestMapping("skuladder")
public class SkuLadderController {
	@Autowired
	private SkuLadderService skuLadderService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("skuladder:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<SkuLadderEntity> skuLadderList = skuLadderService.queryList(query);
		int total = skuLadderService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(skuLadderList, total, query.getLimit(), query.getCurrPage());
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("skuladder:info")
	public R info(@PathVariable("id") Long id){
		SkuLadderEntity skuLadder = skuLadderService.queryObject(id);
		
		return R.ok().put("skuLadder", skuLadder);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("skuladder:save")
	public R save(@RequestBody SkuLadderEntity skuLadder){
		skuLadderService.save(skuLadder);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("skuladder:update")
	public R update(@RequestBody SkuLadderEntity skuLadder){
		skuLadderService.update(skuLadder);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("skuladder:delete")
	public R delete(@RequestBody Long[] ids){
		skuLadderService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
