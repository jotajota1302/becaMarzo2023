package edu.es.eoi;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import edu.es.eoi.properties.Labels;

@SpringBootTest
class AppTests {

	@Autowired()
	@Qualifier("EN")
	Labels label;

	@Test
	void test() {

		System.out.println(label.getWelcome());
		
	}

}
