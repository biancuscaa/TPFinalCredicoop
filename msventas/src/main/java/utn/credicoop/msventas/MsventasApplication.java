package utn.credicoop.msventas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MsventasApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsventasApplication.class, args);
	}

}
