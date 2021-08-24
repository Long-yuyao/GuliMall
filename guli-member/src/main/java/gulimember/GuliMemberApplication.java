package gulimember;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@MapperScan("gulimember.dao")
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients("gulimember.feign")
public class GuliMemberApplication {

	public static void main(String[] args) {
		SpringApplication.run(GuliMemberApplication.class, args);
	}

}
