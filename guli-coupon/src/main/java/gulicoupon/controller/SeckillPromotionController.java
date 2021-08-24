package gulicoupon.controller;

import java.util.List;
import java.util.Map;

import gulicoupon.entity.SeckillPromotionEntity;
import gulicoupon.service.SeckillPromotionService;
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
 * 秒杀活动
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-06 22:06:16
 */
@RestController
@RequestMapping("seckillpromotion")
public class SeckillPromotionController {
	@Autowired
	private SeckillPromotionService seckillPromotionService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("seckillpromotion:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<SeckillPromotionEntity> seckillPromotionList = seckillPromotionService.queryList(query);
		int total = seckillPromotionService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(seckillPromotionList, total, query.getLimit(), query.getCurrPage());
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("seckillpromotion:info")
	public R info(@PathVariable("id") Long id){
		SeckillPromotionEntity seckillPromotion = seckillPromotionService.queryObject(id);
		
		return R.ok().put("seckillPromotion", seckillPromotion);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("seckillpromotion:save")
	public R save(@RequestBody SeckillPromotionEntity seckillPromotion){
		seckillPromotionService.save(seckillPromotion);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("seckillpromotion:update")
	public R update(@RequestBody SeckillPromotionEntity seckillPromotion){
		seckillPromotionService.update(seckillPromotion);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("seckillpromotion:delete")
	public R delete(@RequestBody Long[] ids){
		seckillPromotionService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
