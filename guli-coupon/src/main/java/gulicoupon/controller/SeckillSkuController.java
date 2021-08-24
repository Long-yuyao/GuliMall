package gulicoupon.controller;

import java.util.List;
import java.util.Map;

import gulicoupon.entity.SeckillSkuEntity;
import gulicoupon.service.SeckillSkuService;
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
 * 秒杀活动商品关联
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-06 22:06:16
 */
@RestController
@RequestMapping("seckillsku")
public class SeckillSkuController {
	@Autowired
	private SeckillSkuService seckillSkuService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("seckillsku:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<SeckillSkuEntity> seckillSkuList = seckillSkuService.queryList(query);
		int total = seckillSkuService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(seckillSkuList, total, query.getLimit(), query.getCurrPage());
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("seckillsku:info")
	public R info(@PathVariable("id") Long id){
		SeckillSkuEntity seckillSku = seckillSkuService.queryObject(id);
		
		return R.ok().put("seckillSku", seckillSku);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("seckillsku:save")
	public R save(@RequestBody SeckillSkuEntity seckillSku){
		seckillSkuService.save(seckillSku);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("seckillsku:update")
	public R update(@RequestBody SeckillSkuEntity seckillSku){
		seckillSkuService.update(seckillSku);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("seckillsku:delete")
	public R delete(@RequestBody Long[] ids){
		seckillSkuService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
