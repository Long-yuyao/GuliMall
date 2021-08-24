package com.yuyao.guliproduct;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/*
mybatis-plus
1. dependency
2. 配置
	2.1 数据源
		2.1.1 数据驱动
		2.1.2 数据源相关信息(yaml)
	2.2 mybatis-plus
		2.2.1 MapperScan
		2.2.2 告诉映射文件配置地址

 */
@MapperScan("com.yuyao.guliproduct.dao")
@SpringBootApplication
@EnableDiscoveryClient
public class GuliProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(GuliProductApplication.class, args);
	}

}
