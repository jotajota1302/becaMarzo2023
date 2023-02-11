package edu.es.eoi;

import org.springframework.context.annotation.Bean;

public class BeanConfiguration {
	
	
	@Bean
	public MyBean getMyBean() {
		
		return new MyBean();
	}
	
	@Bean
	public ExampleBean getMySecondBean() {
		
		return new ExampleBean();
	}



}
