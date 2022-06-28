package br.edu.infnet.votatalesb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class VotaTalesbApplication {

	public static void main(String[] args) {
		SpringApplication.run(VotaTalesbApplication.class, args);
	}

}
