package com.gavin.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;

@SpringBootApplication
@DubboComponentScan("com.gavin.dubbo.service.impl")	// 扫描注册dubbo服务
public class DubboServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(DubboServiceApplication.class, args);
	}
}
