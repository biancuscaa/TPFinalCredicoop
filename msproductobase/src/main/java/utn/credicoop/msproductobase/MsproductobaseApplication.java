package utn.credicoop.msproductobase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MsproductobaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsproductobaseApplication.class, args);
	}

}
