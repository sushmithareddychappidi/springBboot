package org.jsp.mvcClassConfig.Configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer
{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class[] getServletConfigClasses() 
	{
		Class c[]= {StudentConfig.class};
		return c;
	}

	@Override
	protected String[] getServletMappings() 
	{
		String s[]= {"/"};
		return s;
	}

}
