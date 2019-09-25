package com.gavin.customer.cfg;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ConsumerConfig;
import com.alibaba.dubbo.config.RegistryConfig;

@Configuration
public class DubboConfiguration {
	
	// 注册中心地址
	@Value("${dubbo.registry.address}")
	private String registryAddress;
	
	/**
	 * @title 服务配置
	 * @author gavin
	 * @date 2019年8月30日
	 * @return
	 */
	@Bean
	public ApplicationConfig applicationConfig() {
		ApplicationConfig applicationConfig = new ApplicationConfig();
		applicationConfig.setName("springboot-dubbo-service");
		applicationConfig.setQosAcceptForeignIp(false);
		applicationConfig.setQosEnable(false);
		applicationConfig.setQosPort(55555);
		return applicationConfig;
	}
	
	/**
	 * @title 消费者配置
	 * @author gavin
	 * @date 2019年8月30日
	 * @return
	 */
	@Bean
	public ConsumerConfig consumerConfig() {
		ConsumerConfig  consumerConfig = new ConsumerConfig();
		// 设置超时时间
		consumerConfig.setTimeout(15000);
		// 设置启动时不监听provider的状态
		consumerConfig.setCheck(false);
		return consumerConfig;
	}
	
	/**
	 * @title 注册中心配置
	 * @author gavin
	 * @date 2019年8月30日
	 * @return
	 */
	@Bean
	public RegistryConfig registryConfig() {
		RegistryConfig registryConfig = new RegistryConfig();
		registryConfig.setAddress(this.registryAddress);
		registryConfig.setClient("curator");
		registryConfig.setTimeout(15000);
		return registryConfig;
	}

	public String getRegistryAddress() {
		return registryAddress;
	}

	public void setRegistryAddress(String registryAddress) {
		this.registryAddress = registryAddress;
	}
}
