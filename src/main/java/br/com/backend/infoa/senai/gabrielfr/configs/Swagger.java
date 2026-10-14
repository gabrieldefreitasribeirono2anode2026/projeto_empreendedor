package br.com.backend.infoa.senai.gabrielfr.configs;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "Sistema de comunicações do exército",
        version = "1.0",
        description = "Admininstrações e disponibilização de recursos focadas na intendência da cidade de Petrópolis."
    )
)
public class Swagger {

}
