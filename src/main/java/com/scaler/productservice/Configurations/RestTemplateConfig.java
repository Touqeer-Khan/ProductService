package com.scaler.productservice.Configurations;


import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;

@Controller
public class RestTemplateConfig {

    @Bean
    public RestTemplate createRestTemplate() {
        return new RestTemplate();
    }
}
