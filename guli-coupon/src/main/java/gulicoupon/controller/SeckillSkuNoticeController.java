package gulicoupon.controller;

import java.util.List;
import java.util.Map;

import gulicoupon.entity.SeckillSkuNoticeEntity;
import gulicoupon.service.SeckillSkuNoticeService;
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
 * 秒杀商品通知订阅
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-06 22:06:16
 */
@RestController
@RequestMapping("seckillskunotice")
public class SeckillSkuNoticeController {
	@Autowired
	private SeckillSkuNoticeService seckillSkuNoticeService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("seckillskunotice:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<SeckillSkuNoticeEntity> seckillSkuNoticeList = seckillSkuNoticeService.queryList(query);
		int total = seckillSkuNoticeService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(seckillSkuNoticeList, total, query.getLimit(), query.getCurrPage());
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("seckillskunotice:info")
	public R info(@PathVariable("id") Long id){
		SeckillSkuNoticeEntity seckillSkuNotice = seckillSkuNoticeService.queryObject(id);
		
		return R.ok().put("seckillSkuNotice", seckillSkuNotice);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("seckillskunotice:save")
	public R save(@RequestBody SeckillSkuNoticeEntity seckillSkuNotice){
		seckillSkuNoticeService.save(seckillSkuNotice);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("seckillskunotice:update")
	public R update(@RequestBody SeckillSkuNoticeEntity seckillSkuNotice){
		seckillSkuNoticeService.update(seckillSkuNotice);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("seckillskunotice:delete")
	public R delete(@RequestBody Long[] ids){
		seckillSkuNoticeService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
