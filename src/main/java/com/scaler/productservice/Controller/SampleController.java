package com.scaler.productservice.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/random")
public class SampleController {

    @GetMapping("/hello")
    public String sayhello(){
        return "hello everyone!!";
    }
}
