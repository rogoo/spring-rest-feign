package br.rosa.rest_rod_2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class RestRod2Application {

	public static void main(String[] args) {
		SpringApplication.run(RestRod2Application.class, args);
	}

}
