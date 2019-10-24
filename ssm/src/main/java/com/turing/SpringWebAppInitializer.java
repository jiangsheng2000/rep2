package com.turing;

import javax.servlet.Filter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.turing.config.RootConfig;
import com.turing.config.WebConfig;
import com.turing.web.MyFilter;
import com.turing.web.MyServlet;
/**
 * 总配置项，用来初始化前端控制器和所有配置
 * 配置DispatcherServlet
 * @author fred
 *
 */
public class SpringWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	//全局配置
	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return new Class<?>[] {RootConfig.class};
	}

	//配置SpringMVC
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] {WebConfig.class};
	}

	//配置ServletMapping
	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}
	
	//配置过滤器
	@Override
	protected Filter[] getServletFilters() {
		//配置编码处理过滤器
		CharacterEncodingFilter encodingFilter = new CharacterEncodingFilter("utf-8",true);
		return new Filter[] {encodingFilter};
	}
	
	//放其它的Servlet和Filter
//	@Override
//	public void onStartup(ServletContext servletContext) throws ServletException {
//		super.onStartup(servletContext);
//		
//		//配置一个Servlet
//		Dynamic myServlet = servletContext.addServlet("MyServlet", MyServlet.class);
//		//设置Servlet的映射
//		myServlet.addMapping("/MyServlet");
//		
//		//配置一个Filter
//		javax.servlet.FilterRegistration.Dynamic myFilter = servletContext.addFilter("MyFilter", MyFilter.class);
//		//设置拦截路径
//		myFilter.addMappingForUrlPatterns(null, true, "/*");
//	}

}
