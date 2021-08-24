package gulicoupon.controller;

import java.util.List;
import java.util.Map;

import gulicoupon.entity.HomeSubjectEntity;
import gulicoupon.service.HomeSubjectService;
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
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-06 22:06:16
 */
@RestController
@RequestMapping("homesubject")
public class HomeSubjectController {
	@Autowired
	private HomeSubjectService homeSubjectService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("homesubject:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<HomeSubjectEntity> homeSubjectList = homeSubjectService.queryList(query);
		int total = homeSubjectService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(homeSubjectList, total, query.getLimit(), query.getCurrPage());
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("homesubject:info")
	public R info(@PathVariable("id") Long id){
		HomeSubjectEntity homeSubject = homeSubjectService.queryObject(id);
		
		return R.ok().put("homeSubject", homeSubject);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("homesubject:save")
	public R save(@RequestBody HomeSubjectEntity homeSubject){
		homeSubjectService.save(homeSubject);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("homesubject:update")
	public R update(@RequestBody HomeSubjectEntity homeSubject){
		homeSubjectService.update(homeSubject);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("homesubject:delete")
	public R delete(@RequestBody Long[] ids){
		homeSubjectService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
