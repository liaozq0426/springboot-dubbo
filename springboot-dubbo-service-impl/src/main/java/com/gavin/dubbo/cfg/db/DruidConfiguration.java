package com.gavin.dubbo.cfg.db;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;


/**
 * @title 创建数据源
 * @author gavin
 * @date 2019年8月27日
 */
@Configuration
@MapperScan(basePackages= {"com.gavin.dubbo.mapper"})	// 扫描mapper接口
public class DruidConfiguration {
	
	@ConfigurationProperties(prefix="spring.datasource.druid.dubbo")
	@Bean(name="dubbo")
	public DataSource dataSource() throws SQLException{
		return DruidDataSourceBuilder.create().build();
	}
	
}
