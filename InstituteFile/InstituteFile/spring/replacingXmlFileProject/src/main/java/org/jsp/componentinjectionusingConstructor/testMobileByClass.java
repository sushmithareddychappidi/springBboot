package org.jsp.componentinjectionusingConstructor;

import java.util.Arrays;
import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class testMobileByClass 
{
   public static void main(String[] args) 
   {
	   ApplicationContext context=new AnnotationConfigApplicationContext(MobileConfigwithAnnotation.class);
	   System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
//	   Mobile mb = context.getBean("getmobile",Mobile.class);
	   Mobile mb = context.getBean("mobile",Mobile.class);
	   System.out.println(mb);	   
	
   }
}
