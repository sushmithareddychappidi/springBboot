package com.jsp.Jdbc.configuration;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = "com.jsp.jdbc")
public class studentConfig 
{
	@Bean("datasource")
	public DataSource getDataSoucrce()
	{
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		ds.setUsername("root");
		ds.setPassword("12345");
		return  ds;
	}
	@Bean("template")
	public JdbcTemplate getjdbcTemplate(DataSource ds)
	{
		JdbcTemplate template=new JdbcTemplate();
		template.setDataSource(ds);
		return template;
	}
}
