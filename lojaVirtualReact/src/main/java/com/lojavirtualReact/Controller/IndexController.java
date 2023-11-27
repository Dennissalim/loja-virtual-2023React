package com.lojavirtualReact.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/api")
public class IndexController {

    @GetMapping("/home")
    public String home(){
        return "Ola mundo spring" + new Date();
    }

}
