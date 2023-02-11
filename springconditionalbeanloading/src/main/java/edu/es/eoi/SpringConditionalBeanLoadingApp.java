package edu.es.eoi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;

import edu.es.eoi.service.Service;
import edu.es.eoi.service.impl.AsiaServiceImpl;
import edu.es.eoi.service.impl.EuServiceImpl;
import edu.es.eoi.service.impl.UsaServiceImpl;

@SpringBootApplication
public class SpringConditionalBeanLoadingApp{

	
	public static void main(String[] args) {
		SpringApplication.run(SpringConditionalBeanLoadingApp.class, args);
	}

	
	@Bean 
	@ConditionalOnProperty(prefix="service", name="zone",havingValue="USA")
	Service getService1() {
	    return new UsaServiceImpl();
	}
	
	@Bean 
	@ConditionalOnProperty(prefix="service", name="zone",havingValue="EU")
	Service getService2() {
	    return new EuServiceImpl();
	}
	
	@Bean 
	@ConditionalOnProperty(prefix="service", name="zone",havingValue="ASIA")
	Service getService3() {
	    return new AsiaServiceImpl();
	}


	
	
}
