package org.jsp.componentinjectionusingConstructor;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages ="org.jsp.componentinjectionusingConstructor")
public class MobileConfigwithAnnotation 
{
	//passing Explicitly the date
//	@Bean("mobile")
//	public Mobile getmobile()
//	{
//		Mobile mb=new Mobile();
//		mb.setBrand("vivo");
//		mb.setPrice(5000);
//		mb.setMemory(7);
//		mb.setDate(getDate());
//		return mb;
//	}
	//implicitly called by Ioc Container
//	@Bean("mobile")
//	public Mobile getmobile(Date date)
//	{
//		Mobile mb=new Mobile();
//		mb.setBrand("vivo");
//		mb.setPrice(5000);
//		mb.setMemory(7);
//		mb.setDate(date);
//		return mb;
//	}
	// passing values By Constructor
	@Bean("mobile")
	public Mobile getmobile(Date date)
	{
		return new Mobile();
	}
	@Bean
	public Date getDate()
	{
		return new Date();
		
	}
}
