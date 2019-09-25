package com.gavin.dubbo;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @title 用于tomcat启动springboot程序
 * @author gavin
 * @date 2019年8月27日
 */
public class ServletInitializer extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(DubboServiceApplication.class);
	}
}
