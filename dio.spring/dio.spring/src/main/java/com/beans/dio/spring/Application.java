package com.beans.dio.spring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.beans.dio.spring.app.ConversorJson;
import com.beans.dio.spring.app.ViaCepResponse;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public CommandLineRunner run (ConversorJson conversorJson) throws  Exception {
			return args -> {
				String json = "{\"cep\": \"01001-000\",\"logradouro\": \"Praça da Sé\",\"localidade\": \"São Paulo\"}";
				ViaCepResponse response = conversorJson.converter(json);
				System.out.println("Dados do CEP: " + response);	
			};
	}

}
