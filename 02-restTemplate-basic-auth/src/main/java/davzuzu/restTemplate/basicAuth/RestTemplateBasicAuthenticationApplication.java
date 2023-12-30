package davzuzu.restTemplate.basicAuth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestTemplateBasicAuthenticationApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestTemplateBasicAuthenticationApplication.class, args);
	}
	
	/*
	Proyecto que consume un servicio externo de la pagina https://wiremock.org/ donde se consulta a través de una
	autenticacion basica usuerio/clave

	Se registro en la pagina con correo davzuzu@gmail para hacer uso de la herramienta
	
	Ejemplo tomado desde:
	https://www.youtube.com/watch?v=tPx5ltfmN74
	*/

}
