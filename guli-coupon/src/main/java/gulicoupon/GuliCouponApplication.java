package gulicoupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@MapperScan("gulicoupon.dao")
@SpringBootApplication
@EnableDiscoveryClient
public class GuliCouponApplication {

	public static void main(String[] args) {
		SpringApplication.run(GuliCouponApplication.class, args);
	}

}
