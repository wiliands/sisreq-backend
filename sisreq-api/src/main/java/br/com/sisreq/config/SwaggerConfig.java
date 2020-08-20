package br.com.sisreq.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
@EnableOpenApi
public class SwaggerConfig {

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.OAS_30)
					.select()
					.apis(RequestHandlerSelectors.basePackage("br.com.sisreq"))
					.paths(PathSelectors.any())
					.build()
					.apiInfo(apiInfo());
	}

	private ApiInfo apiInfo() {
		return new ApiInfo("RESTful Sisreq API",
						   "RESTful Sisreq API",
						   "v1",
						   "Terms Services URL",
						   new Contact("Wilian Domingues", "https://github.com/wiliands", "wiliands@gmail.com"),
						   "License API",
						   "License API URL",
						   Collections.emptyList());
	}
}
