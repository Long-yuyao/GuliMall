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

import gulimember.entity.UserCollectSkuEntity;
import gulimember.service.UserCollectSkuService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;
import io.renren.common.utils.R;




/**
 * 关注商品表
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-08 15:43:00
 */
@RestController
@RequestMapping("usercollectsku")
public class UserCollectSkuController {
	@Autowired
	private UserCollectSkuService userCollectSkuService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("usercollectsku:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<UserCollectSkuEntity> userCollectSkuList = userCollectSkuService.queryList(query);
		int total = userCollectSkuService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(userCollectSkuList, total, query.getLimit(), query.getCurrPage());
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("usercollectsku:info")
	public R info(@PathVariable("id") Long id){
		UserCollectSkuEntity userCollectSku = userCollectSkuService.queryObject(id);
		
		return R.ok().put("userCollectSku", userCollectSku);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("usercollectsku:save")
	public R save(@RequestBody UserCollectSkuEntity userCollectSku){
		userCollectSkuService.save(userCollectSku);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("usercollectsku:update")
	public R update(@RequestBody UserCollectSkuEntity userCollectSku){
		userCollectSkuService.update(userCollectSku);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("usercollectsku:delete")
	public R delete(@RequestBody Long[] ids){
		userCollectSkuService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
