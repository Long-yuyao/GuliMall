package com.yuyao.guliproduct;

import com.yuyao.guliproduct.entity.BrandEntity;
import com.yuyao.guliproduct.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GuliProductApplicationTests {
	@Autowired
	BrandService bs;
	@Test
	void contextLoads() {
		BrandEntity brandEntity = new BrandEntity();
		brandEntity.setId(455L);
		brandEntity.setLogo("yuyao");
		bs.save(brandEntity);
		BrandEntity p = bs.queryObject(1L);
		System.out.println(p.getName());
		System.out.println("success!");
	}

}
