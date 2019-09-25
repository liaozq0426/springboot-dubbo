package com.gavin.dubbo.cfg.dubbo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.RegistryConfig;

/**
 * @title dubbo服务配置
 * @author gavin
 * @date 2019年8月27日
 */
@Configuration
public class DubboConfiguration {
	
	// 注册中心地址
	@Value("${dubbo.registry.address}")
	private String registryAddress;
	
	// dubbo服务地址
	@Value("${dubbo.protocol.address}")
	private String protocolAddress;
	
	// dubbo服务端口
	@Value("${dubbo.protocol.port}")
	private int protocolPort;
	
	
	/**
	 * @title 服务配置
	 * @author gavin
	 * @date 2019年8月27日
	 * @return
	 */
	@Bean
	public ApplicationConfig applicationConfig() {
		ApplicationConfig applicationConfig = new ApplicationConfig();
		// 指定一个服务名
		applicationConfig.setName("springboot-dubbo-service");
		// 设置Qos端口并且关闭，防止运行过程报错
		applicationConfig.setQosEnable(false);
		applicationConfig.setQosAcceptForeignIp(false);
		applicationConfig.setQosPort(22222);
		return applicationConfig;
	}
	
	/**
	 * @title 注册中心配置
	 * @author gavin
	 * @date 2019年8月27日
	 * @return
	 */
	@Bean
	public RegistryConfig registryConfig() {
		RegistryConfig  registryConfig = new RegistryConfig();
		registryConfig.setAddress(this.registryAddress);
		// 指定连接zookeeper的客户端
		registryConfig.setClient("curator");
		// 设置超时时间
		registryConfig.setTimeout(30000);
		return registryConfig;
	}
	
	/**
	 * @title 协议配置
	 * @author gavin
	 * @date 2019年8月30日
	 * @return
	 */
	@Bean
	public ProtocolConfig protocalConfig() {
		ProtocolConfig protocolConfig = new ProtocolConfig();
		// 指定协议为dubbo
		protocolConfig.setName("dubbo");
		// 指定dubbo服务地址
		protocolConfig.setHost(this.protocolAddress);
		// 指定dubbo服务端口
		protocolConfig.setPort(this.protocolPort);
		return protocolConfig;
	}

	public String getRegistryAddress() {
		return registryAddress;
	}

	public void setRegistryAddress(String registryAddress) {
		this.registryAddress = registryAddress;
	}

	public String getProtocolAddress() {
		return protocolAddress;
	}

	public void setProtocolAddress(String protocolAddress) {
		this.protocolAddress = protocolAddress;
	}

	public int getProtocolPort() {
		return protocolPort;
	}

	public void setProtocolPort(int protocolPort) {
		this.protocolPort = protocolPort;
	}
	
	
	
	
	
	
	
}
