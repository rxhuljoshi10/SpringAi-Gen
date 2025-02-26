package com.example.SpringAi_gen.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {
    @GetMapping("health-check")
    public String check(){
        return "Working fine!";
    }
}
