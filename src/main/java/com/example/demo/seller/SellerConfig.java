package com.example.demo.seller;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SellerConfig {

    @Bean
    CommandLineRunner commandLineRunner(SellerRepository repository) {
        return args -> {
            Seller ciclano = new Seller("Ciclano de tal", "mail1@mail.com");
            Seller ciclana = new Seller("Ciclana de tal", "mail2@mail.com");
            
            repository.saveAll(
                List.of(ciclano, ciclana)
            )
        };

    }
}

