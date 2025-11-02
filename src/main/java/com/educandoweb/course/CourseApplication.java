package com.educandoweb.course;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // Marca a classe como ponto de partida da aplicação Spring Boot
public class CourseApplication {

	public static void main(String[] args) {
		
		// O método run() inicializa todo o contexto do Spring:
		// - Cria e configura automaticamente os beans (componentes gerenciados pelo Spring)
		// - Configura o servidor embutido (Tomcat)
		// - Lê as configurações (como application.properties)
		// - Inicia as classes com anotações @Configuration, @Service, @Repository e @RestController
		SpringApplication.run(CourseApplication.class, args);
	}

}
