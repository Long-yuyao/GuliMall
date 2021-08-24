package gulistorage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@MapperScan("gulistorage.dao")
@SpringBootApplication
@EnableDiscoveryClient
public class GuliStorageApplication {

	public static void main(String[] args) {
		SpringApplication.run(GuliStorageApplication.class, args);
	}

}
