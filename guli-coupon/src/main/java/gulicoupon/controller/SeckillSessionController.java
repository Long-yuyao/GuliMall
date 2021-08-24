package gulicoupon.controller;

import java.util.List;
import java.util.Map;

import gulicoupon.entity.SeckillSessionEntity;
import gulicoupon.service.SeckillSessionService;
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
 * 秒杀活动场次
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-06 22:06:16
 */
@RestController
@RequestMapping("seckillsession")
public class SeckillSessionController {
	@Autowired
	private SeckillSessionService seckillSessionService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("seckillsession:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<SeckillSessionEntity> seckillSessionList = seckillSessionService.queryList(query);
		int total = seckillSessionService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(seckillSessionList, total, query.getLimit(), query.getCurrPage());
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("seckillsession:info")
	public R info(@PathVariable("id") Long id){
		SeckillSessionEntity seckillSession = seckillSessionService.queryObject(id);
		
		return R.ok().put("seckillSession", seckillSession);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("seckillsession:save")
	public R save(@RequestBody SeckillSessionEntity seckillSession){
		seckillSessionService.save(seckillSession);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("seckillsession:update")
	public R update(@RequestBody SeckillSessionEntity seckillSession){
		seckillSessionService.update(seckillSession);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("seckillsession:delete")
	public R delete(@RequestBody Long[] ids){
		seckillSessionService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
