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

import gulimember.entity.UserCollectShopEntity;
import gulimember.service.UserCollectShopService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;
import io.renren.common.utils.R;




/**
 * 关注店铺表
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-08 15:43:00
 */
@RestController
@RequestMapping("usercollectshop")
public class UserCollectShopController {
	@Autowired
	private UserCollectShopService userCollectShopService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("usercollectshop:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<UserCollectShopEntity> userCollectShopList = userCollectShopService.queryList(query);
		int total = userCollectShopService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(userCollectShopList, total, query.getLimit(), query.getCurrPage());
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("usercollectshop:info")
	public R info(@PathVariable("id") Long id){
		UserCollectShopEntity userCollectShop = userCollectShopService.queryObject(id);
		
		return R.ok().put("userCollectShop", userCollectShop);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("usercollectshop:save")
	public R save(@RequestBody UserCollectShopEntity userCollectShop){
		userCollectShopService.save(userCollectShop);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("usercollectshop:update")
	public R update(@RequestBody UserCollectShopEntity userCollectShop){
		userCollectShopService.update(userCollectShop);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("usercollectshop:delete")
	public R delete(@RequestBody Long[] ids){
		userCollectShopService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
