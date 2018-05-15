package com.pk.rest.ws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@Configuration
@EnableSwagger2
public class RestfulWsApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfulWsApplication.class, args);
	}

	public static final Contact DEFAULT_CONTACT = new Contact("Pavithra", "", "pavithrakamathgp@gmail.com");
	public static final ApiInfo DEFAULT = new ApiInfo("Sample WS", "Sample restful practice application", "1.0",
			"urn:tos", DEFAULT_CONTACT, "Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0");

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(DEFAULT).select()
				.apis(RequestHandlerSelectors.basePackage("com.pk.rest.ws.controllers")).paths(PathSelectors.any())
				.build();
	}
}
