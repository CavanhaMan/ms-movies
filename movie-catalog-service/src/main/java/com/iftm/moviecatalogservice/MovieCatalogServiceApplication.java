package com.iftm.moviecatalogservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MovieCatalogServiceApplication {
	
	//precisamos criar uma unica instancia (singleton) que irá responder às classes
	//para isso criaremos um bean
	//a ideia é que sempre  precisar usar esse RestTemplete, vai usar essa instancia
	//sempre ele - executado uma única vez (não cria diversas instancias durante a execução!)
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	//o Autowired da classe CatalogResource informa ao Spring que em algum lugar (aqui)
	//existe um BEAN desse RestTemplate e o inject precisa desse dado e é injetado lá na CatalogResource
	//o Bean informa que tem algum dado disponível e o Autowired informa que precisa desse dado


	public static void main(String[] args) {
		SpringApplication.run(MovieCatalogServiceApplication.class, args);
	}

}
//localhost:8080