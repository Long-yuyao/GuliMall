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

import gulimember.entity.UserAddressEntity;
import gulimember.service.UserAddressService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;
import io.renren.common.utils.R;




/**
 * 收货地址表
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-08 15:43:00
 */
@RestController
@RequestMapping("useraddress")
public class UserAddressController {
	@Autowired
	private UserAddressService userAddressService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("useraddress:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<UserAddressEntity> userAddressList = userAddressService.queryList(query);
		int total = userAddressService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(userAddressList, total, query.getLimit(), query.getCurrPage());
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("useraddress:info")
	public R info(@PathVariable("id") Long id){
		UserAddressEntity userAddress = userAddressService.queryObject(id);
		
		return R.ok().put("userAddress", userAddress);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("useraddress:save")
	public R save(@RequestBody UserAddressEntity userAddress){
		userAddressService.save(userAddress);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("useraddress:update")
	public R update(@RequestBody UserAddressEntity userAddress){
		userAddressService.update(userAddress);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("useraddress:delete")
	public R delete(@RequestBody Long[] ids){
		userAddressService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
