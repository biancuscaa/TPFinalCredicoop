package utn.tp.credicoop.servnombres;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer

public class ServnombresApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServnombresApplication.class, args);
	}

}
