package br.com.usuario.controller.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("API DE ESTUDO SPRING DATA")
                        .version("1.0")
                        .description("API DE ESTUDO SPRING DATA")
                        .termsOfService("Termos para Serviço")
                        .contact(new Contact()
                                .name("Demilly Felipe")
                                .url("https://www.linkedin.com/in/demilly-ferreira/")
                                .email("demilly_@hotmail.com"))
                        .license(new License()
                                .name("Apache License Version 2.0")
                                .url("https://www.apache.org/licenses/LICENSE-2.0")));
    }

    @Bean
    public GroupedOpenApi api() {
        return GroupedOpenApi.builder()
                .group("br.com.usuario.controller")
                .pathsToMatch("/**")
                .build();
    }
}
