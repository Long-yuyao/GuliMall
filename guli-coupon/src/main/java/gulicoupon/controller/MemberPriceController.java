package gulicoupon.controller;

import java.util.List;
import java.util.Map;

import gulicoupon.entity.MemberPriceEntity;
import gulicoupon.service.MemberPriceService;
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
 * 商品会员价格
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-06 22:06:16
 */
@RestController
@RequestMapping("memberprice")
public class MemberPriceController {
	@Autowired
	private MemberPriceService memberPriceService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("memberprice:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<MemberPriceEntity> memberPriceList = memberPriceService.queryList(query);
		int total = memberPriceService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(memberPriceList, total, query.getLimit(), query.getCurrPage());
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("memberprice:info")
	public R info(@PathVariable("id") Long id){
		MemberPriceEntity memberPrice = memberPriceService.queryObject(id);
		
		return R.ok().put("memberPrice", memberPrice);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("memberprice:save")
	public R save(@RequestBody MemberPriceEntity memberPrice){
		memberPriceService.save(memberPrice);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("memberprice:update")
	public R update(@RequestBody MemberPriceEntity memberPrice){
		memberPriceService.update(memberPrice);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("memberprice:delete")
	public R delete(@RequestBody Long[] ids){
		memberPriceService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
