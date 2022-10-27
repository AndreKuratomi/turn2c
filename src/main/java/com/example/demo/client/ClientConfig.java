package com.example.demo.client;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ClientConfig {

    @Bean
    CommandLineRunner commandLineRunner(ClientRepository repository) {
        return args -> {
            Client fulano = new Client("Fulano de tal", "mail01@mail.com");
            Client fulana = new Client("Fulana de tal", "mail02@mail.com");
            
            repository.saveAll(
                List.of(fulano, fulana)
            )
        };

    }
}

