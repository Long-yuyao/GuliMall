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

import gulimember.entity.UserLoginLogEntity;
import gulimember.service.UserLoginLogService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;
import io.renren.common.utils.R;




/**
 * 用户登陆记录表
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-08 15:43:00
 */
@RestController
@RequestMapping("userloginlog")
public class UserLoginLogController {
	@Autowired
	private UserLoginLogService userLoginLogService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("userloginlog:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<UserLoginLogEntity> userLoginLogList = userLoginLogService.queryList(query);
		int total = userLoginLogService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(userLoginLogList, total, query.getLimit(), query.getCurrPage());
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("userloginlog:info")
	public R info(@PathVariable("id") Long id){
		UserLoginLogEntity userLoginLog = userLoginLogService.queryObject(id);
		
		return R.ok().put("userLoginLog", userLoginLog);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("userloginlog:save")
	public R save(@RequestBody UserLoginLogEntity userLoginLog){
		userLoginLogService.save(userLoginLog);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("userloginlog:update")
	public R update(@RequestBody UserLoginLogEntity userLoginLog){
		userLoginLogService.update(userLoginLog);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("userloginlog:delete")
	public R delete(@RequestBody Long[] ids){
		userLoginLogService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
