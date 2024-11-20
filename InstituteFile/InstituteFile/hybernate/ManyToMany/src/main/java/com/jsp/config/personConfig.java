package com.jsp.config;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan(basePackages ="com.jsp")
public class personConfig 
{
	@Bean
	public EntityManagerFactory entitymanagerfactoryBean()
	{
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("ManyToMany");
		return factory;
	}
	@Bean
	public EntityManager entitymanagerBean()
	{
		EntityManager manager=entitymanagerfactoryBean().createEntityManager();
		return manager;
	}
	@Bean
	public EntityTransaction entityTransactionBean()
	{
		EntityTransaction transaction = entitymanagerBean().getTransaction();
		return transaction;
	}
}
