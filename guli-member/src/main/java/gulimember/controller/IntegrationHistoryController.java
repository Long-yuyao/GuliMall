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

import gulimember.entity.IntegrationHistoryEntity;
import gulimember.service.IntegrationHistoryService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;
import io.renren.common.utils.R;




/**
 * 购物积分记录表
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-08 15:43:00
 */
@RestController
@RequestMapping("integrationhistory")
public class IntegrationHistoryController {
	@Autowired
	private IntegrationHistoryService integrationHistoryService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("integrationhistory:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<IntegrationHistoryEntity> integrationHistoryList = integrationHistoryService.queryList(query);
		int total = integrationHistoryService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(integrationHistoryList, total, query.getLimit(), query.getCurrPage());
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("integrationhistory:info")
	public R info(@PathVariable("id") Long id){
		IntegrationHistoryEntity integrationHistory = integrationHistoryService.queryObject(id);
		
		return R.ok().put("integrationHistory", integrationHistory);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("integrationhistory:save")
	public R save(@RequestBody IntegrationHistoryEntity integrationHistory){
		integrationHistoryService.save(integrationHistory);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("integrationhistory:update")
	public R update(@RequestBody IntegrationHistoryEntity integrationHistory){
		integrationHistoryService.update(integrationHistory);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("integrationhistory:delete")
	public R delete(@RequestBody Long[] ids){
		integrationHistoryService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
