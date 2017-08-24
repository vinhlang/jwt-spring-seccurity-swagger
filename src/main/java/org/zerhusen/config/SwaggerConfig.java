package org.zerhusen.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static springfox.documentation.builders.PathSelectors.regex;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;

/**
 *
 * @author Loser
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2).host("192.168.33.11:9000")
                .select()
                .apis(RequestHandlerSelectors.basePackage("org.zerhusen"))
                .paths(regex("/.*"))
                .build().apiInfo(metaData()).host("192.168.33.11:9000");
    }

    private ApiInfo metaData() {
        ApiInfo apiInfo = new ApiInfo(
                "Spring Boot REST API",
                "Spring Boot REST API for VFiness",
                "1.0",
                "Terms of service",
                new Contact("VinhNV", "", "vinhnv@dtsgroup.com.vn"),
                "Apache License Version 2.0",
                "https://www.apache.org/licenses/LICENSE-2.0");
        return apiInfo;
    }
}
