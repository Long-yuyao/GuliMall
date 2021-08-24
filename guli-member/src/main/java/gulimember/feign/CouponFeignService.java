package gulimember.feign;
import io.renren.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("gulicoupon")
public interface CouponFeignService {
    @RequestMapping("/coupon/list")
    R list();
}
