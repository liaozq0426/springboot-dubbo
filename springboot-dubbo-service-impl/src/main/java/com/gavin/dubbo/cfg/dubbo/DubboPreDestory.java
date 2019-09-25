package com.gavin.dubbo.cfg.dubbo;

import javax.annotation.PreDestroy;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.registry.dubbo.DubboRegistryFactory;
import com.alibaba.dubbo.rpc.protocol.dubbo.DubboProtocol;

/**
 * @title dubbo服务销毁配置，用于解决dubbo服务部署在tomcat中，tomcat自动重启时端口占用错误
 * @author gavin
 * @date 2019年8月27日
 */
@Component
public class DubboPreDestory {
	
	private Logger logger = Logger.getLogger(this.getClass());
	
	
	@PreDestroy
	public void destroy() {
		logger.info("dubbo实例销毁中....");
		DubboRegistryFactory.destroyAll();
		DubboProtocol.getDubboProtocol().destroy();
		logger.info("dubbo服务销毁完成！");
	}
	
}
