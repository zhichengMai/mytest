package cn.itcast.springboot;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;


public class ServletInitialzer extends SpringBootServletInitializer {
	
	
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		/**
		 * 设置启动类
		 */
		builder.sources(Application.class);
		builder.bannerMode(Mode.OFF);
		return builder;
	}

}
