package davzuzu.restTemplate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RestTemplateDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestTemplateDemoApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
	/*
	Proyecto que consume un servicio externo tomado de la pagina web https://jsonplaceholder.typicode.com/
	Ejemplo tomado desde:
	https://youtu.be/9R2TYCnlpfU
	 */

}
