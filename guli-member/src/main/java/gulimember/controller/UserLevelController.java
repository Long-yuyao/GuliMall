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

import gulimember.entity.UserLevelEntity;
import gulimember.service.UserLevelService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;
import io.renren.common.utils.R;




/**
 * 会员等级表
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-08 15:43:00
 */
@RestController
@RequestMapping("userlevel")
public class UserLevelController {
	@Autowired
	private UserLevelService userLevelService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("userlevel:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<UserLevelEntity> userLevelList = userLevelService.queryList(query);
		int total = userLevelService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(userLevelList, total, query.getLimit(), query.getCurrPage());
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("userlevel:info")
	public R info(@PathVariable("id") Long id){
		UserLevelEntity userLevel = userLevelService.queryObject(id);
		
		return R.ok().put("userLevel", userLevel);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("userlevel:save")
	public R save(@RequestBody UserLevelEntity userLevel){
		userLevelService.save(userLevel);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("userlevel:update")
	public R update(@RequestBody UserLevelEntity userLevel){
		userLevelService.update(userLevel);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("userlevel:delete")
	public R delete(@RequestBody Long[] ids){
		userLevelService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
