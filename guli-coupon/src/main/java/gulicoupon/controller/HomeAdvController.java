package gulicoupon.controller;

import java.util.List;
import java.util.Map;

import gulicoupon.entity.HomeAdvEntity;
import gulicoupon.service.HomeAdvService;
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
 * 首页轮播广告
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-06 22:06:16
 */
@RestController
@RequestMapping("homeadv")
public class HomeAdvController {
	@Autowired
	private HomeAdvService homeAdvService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("homeadv:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<HomeAdvEntity> homeAdvList = homeAdvService.queryList(query);
		int total = homeAdvService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(homeAdvList, total, query.getLimit(), query.getCurrPage());
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("homeadv:info")
	public R info(@PathVariable("id") Long id){
		HomeAdvEntity homeAdv = homeAdvService.queryObject(id);
		
		return R.ok().put("homeAdv", homeAdv);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("homeadv:save")
	public R save(@RequestBody HomeAdvEntity homeAdv){
		homeAdvService.save(homeAdv);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("homeadv:update")
	public R update(@RequestBody HomeAdvEntity homeAdv){
		homeAdvService.update(homeAdv);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("homeadv:delete")
	public R delete(@RequestBody Long[] ids){
		homeAdvService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
