package com.ura.courseerpbackend.configs;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition
public class SwaggerConfig {
    @Bean
    public OpenAPI openApi(){
        Contact contact=new Contact();
        contact.setName("Aytaj Mammadli");
        contact.setEmail("aytajmammmadli@gmail.com");

        return new OpenAPI().info(new Info().title("Aytac Mammadli terefinden documentasiya")
                .version("0.0.1").contact(contact).description("This API for course ERP"));
    }
}
