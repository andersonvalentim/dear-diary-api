package com.cesario.deardiaryapi.configure;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket agendaApi() {
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.basePackage("com.cesario.deardiaryapi"))
                .build().apiInfo(ApiInformations());
    }
    private ApiInfo ApiInformations() {
        ApiInfo apiInfo = new ApiInfo("Dear Diary API", "",
                "1.0", "Terms of Service", new Contact("Cesário Pereira Neto", null, "cesariopereiraneto@gmail.com"),
                "", "", new ArrayList<VendorExtension>());
        return apiInfo;
    }
}