package gulimember.controller;

import java.util.List;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import gulimember.entity.UserCollectSubjectEntity;
import gulimember.service.UserCollectSubjectService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;
import io.renren.common.utils.R;




/**
 * 关注活动表
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-08 15:43:00
 */
@RestController
@RequestMapping("usercollectsubject")
public class UserCollectSubjectController {
	@Autowired
	private UserCollectSubjectService userCollectSubjectService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("usercollectsubject:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<UserCollectSubjectEntity> userCollectSubjectList = userCollectSubjectService.queryList(query);
		int total = userCollectSubjectService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(userCollectSubjectList, total, query.getLimit(), query.getCurrPage());
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("usercollectsubject:info")
	public R info(@PathVariable("id") Long id){
		UserCollectSubjectEntity userCollectSubject = userCollectSubjectService.queryObject(id);
		
		return R.ok().put("userCollectSubject", userCollectSubject);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("usercollectsubject:save")
	public R save(@RequestBody UserCollectSubjectEntity userCollectSubject){
		userCollectSubjectService.save(userCollectSubject);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("usercollectsubject:update")
	public R update(@RequestBody UserCollectSubjectEntity userCollectSubject){
		userCollectSubjectService.update(userCollectSubject);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("usercollectsubject:delete")
	public R delete(@RequestBody Long[] ids){
		userCollectSubjectService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
