package edu.es.eoi;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class ExampleBean {

	@PostConstruct
	public void init() {
		System.out.println("Inicializando ExampleBean");
		// Aquí puede inicializar cualquier recurso necesario
	}

	public void doSomething() {
		System.out.println("Haciendo algo en ExampleBean");
		// Aquí puede realizar alguna tarea importante
	}

	@PreDestroy
	public void cleanUp() {
		System.out.println("Limpiando ExampleBean");
		// Aquí puede liberar cualquier recurso utilizado
	}

}
