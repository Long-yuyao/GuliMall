package gulicoupon.controller;

import java.util.List;
import java.util.Map;

import gulicoupon.entity.HomeSubjectSpuEntity;
import gulicoupon.service.HomeSubjectSpuService;
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
 * 专题商品
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-06 22:06:16
 */
@RestController
@RequestMapping("homesubjectspu")
public class HomeSubjectSpuController {
	@Autowired
	private HomeSubjectSpuService homeSubjectSpuService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("homesubjectspu:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<HomeSubjectSpuEntity> homeSubjectSpuList = homeSubjectSpuService.queryList(query);
		int total = homeSubjectSpuService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(homeSubjectSpuList, total, query.getLimit(), query.getCurrPage());
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("homesubjectspu:info")
	public R info(@PathVariable("id") Long id){
		HomeSubjectSpuEntity homeSubjectSpu = homeSubjectSpuService.queryObject(id);
		
		return R.ok().put("homeSubjectSpu", homeSubjectSpu);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("homesubjectspu:save")
	public R save(@RequestBody HomeSubjectSpuEntity homeSubjectSpu){
		homeSubjectSpuService.save(homeSubjectSpu);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("homesubjectspu:update")
	public R update(@RequestBody HomeSubjectSpuEntity homeSubjectSpu){
		homeSubjectSpuService.update(homeSubjectSpu);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("homesubjectspu:delete")
	public R delete(@RequestBody Long[] ids){
		homeSubjectSpuService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
