package com.gulimal.guligateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/*
1.开启服务注册发现
2.配置nacos的注册中心地址
 */
@EnableDiscoveryClient
@SpringBootApplication
public class GuliGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GuliGatewayApplication.class, args);
	}

}
