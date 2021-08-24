package guliorder.controller;

import java.util.List;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import guliorder.entity.PaymentInfoEntity;
import guliorder.service.PaymentInfoService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;
import io.renren.common.utils.R;




/**
 * 支付信息表
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-08 15:13:17
 */
@RestController
@RequestMapping("paymentinfo")
public class PaymentInfoController {
	@Autowired
	private PaymentInfoService paymentInfoService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("paymentinfo:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<PaymentInfoEntity> paymentInfoList = paymentInfoService.queryList(query);
		int total = paymentInfoService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(paymentInfoList, total, query.getLimit(), query.getCurrPage());
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("paymentinfo:info")
	public R info(@PathVariable("id") Long id){
		PaymentInfoEntity paymentInfo = paymentInfoService.queryObject(id);
		
		return R.ok().put("paymentInfo", paymentInfo);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("paymentinfo:save")
	public R save(@RequestBody PaymentInfoEntity paymentInfo){
		paymentInfoService.save(paymentInfo);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("paymentinfo:update")
	public R update(@RequestBody PaymentInfoEntity paymentInfo){
		paymentInfoService.update(paymentInfo);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("paymentinfo:delete")
	public R delete(@RequestBody Long[] ids){
		paymentInfoService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
