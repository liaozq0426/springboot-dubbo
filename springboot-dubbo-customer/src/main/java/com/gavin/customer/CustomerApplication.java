package com.gavin.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;

@SpringBootApplication
@DubboComponentScan("com.gavin.customer.service.impl")
public class CustomerApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(CustomerApplication.class, args);
	}
	
}
