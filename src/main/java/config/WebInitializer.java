package config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
/**
 * Tomcat启动时会检测是否有WebApplicationInitializer接口的类，
 * 若检测到有这个类，就会实例化它，并调用它的onStartup方法
 * @author windows
 *
 */
public class WebInitializer implements WebApplicationInitializer{

	public void onStartup(ServletContext servletContext) throws ServletException {
		// 1.构造Spring容器
		AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
		// 2.Spring容器加载配置
		ctx.register(AppConfig.class);
		// 3.Spring容器接管ServletContext应用上下文对象
		ctx.setServletContext(servletContext);
		// 4.添加Servlet（至少添加一个Servlet，SpringMVC框架实现的入口Servlet）
		ServletRegistration.Dynamic servlet = servletContext.addServlet("dispatcher", new DispatcherServlet(ctx));
		servlet.addMapping("/");
		servlet.setLoadOnStartup(1);
	}
}
// 你想使用Spring，就得有Spring容器的实例；
// 你想使用Spring MVC，就得配置DispatcherServlet的实例
// 还要把这两个东西放到ServletContext对象里，因为它俩都是重量级对象


