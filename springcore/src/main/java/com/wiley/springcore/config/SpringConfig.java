package com.wiley.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.wiley.springday2.config")
public class SpringConfig {
	@Bean
	public Beer getBeer() {
		return new Beer();
	}
	@Bean("student1")
public Student getStudent() {
	Student student=new Student(getBeer());
	return student;
}
}