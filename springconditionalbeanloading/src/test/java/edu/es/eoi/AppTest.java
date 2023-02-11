package edu.es.eoi;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import edu.es.eoi.service.Service;

@SpringBootTest
class AppTest {

	@Autowired
	Service service;
	
	
	@Test
	void contextLoads() {
		
		System.out.println(service.doSomething());
	}

}
