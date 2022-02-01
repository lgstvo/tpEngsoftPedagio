package com.ufmg.pedagio.config;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dsv")
public class DBConfig {

	
	@Value("${spring.jpa.hibernate.ddl-auto}")
	private String strategy;
	
	private static final String CREATE = "create";
	
	@Bean
	public boolean instantiateDatabase() throws ParseException {
		return CREATE.equals(strategy);
	}
}