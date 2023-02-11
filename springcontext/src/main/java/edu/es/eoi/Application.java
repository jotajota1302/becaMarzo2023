package edu.es.eoi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


public class Application {

	
	static ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);
	
	
	public static void main(String[] args) {
		
		context.getBean(MyBean.class).doSomething();
		
		context.getBean(ExampleBean.class).doSomething();
		
		((AbstractApplicationContext)(context)).destroy();
		
	}
	

}
