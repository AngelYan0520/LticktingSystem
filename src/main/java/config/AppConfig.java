package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

/**
 * 应用配置（Spring配置）
 * 它相当于XML的替代者
 * @author windows
 *
 */
@Configuration
@ComponentScan({"dao","service","controller"})
@Import(JDBConfig.class)
@EnableAspectJAutoProxy
@EnableWebMvc
public class AppConfig {
	// 配置JSP解析器Bean
	/**
	 * jsp解析器
	 * 这个Bean的作用就是告诉SpringMVC你写的JSP文件的位置
	 * @return
	 */
	@Bean
	public UrlBasedViewResolver setupViewResolver() {
		UrlBasedViewResolver resolver = new UrlBasedViewResolver();
		resolver.setPrefix("/WEB-INF/");	// --位置[受保护的，不可以直接访问]
		resolver.setSuffix(".jsp");			//--jsp文件的后缀，你在写页面的时候就省略到后缀1
		resolver.setViewClass(JstlView.class);
		return resolver;
		
	}
}