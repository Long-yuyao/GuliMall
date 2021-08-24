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

import gulimember.entity.UserStatisticsEntity;
import gulimember.service.UserStatisticsService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;
import io.renren.common.utils.R;




/**
 * 统计信息表
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-08 15:43:00
 */
@RestController
@RequestMapping("userstatistics")
public class UserStatisticsController {
	@Autowired
	private UserStatisticsService userStatisticsService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("userstatistics:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<UserStatisticsEntity> userStatisticsList = userStatisticsService.queryList(query);
		int total = userStatisticsService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(userStatisticsList, total, query.getLimit(), query.getCurrPage());
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("userstatistics:info")
	public R info(@PathVariable("id") Long id){
		UserStatisticsEntity userStatistics = userStatisticsService.queryObject(id);
		
		return R.ok().put("userStatistics", userStatistics);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("userstatistics:save")
	public R save(@RequestBody UserStatisticsEntity userStatistics){
		userStatisticsService.save(userStatistics);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("userstatistics:update")
	public R update(@RequestBody UserStatisticsEntity userStatistics){
		userStatisticsService.update(userStatistics);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("userstatistics:delete")
	public R delete(@RequestBody Long[] ids){
		userStatisticsService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
