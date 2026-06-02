package org.example.ex2.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @GetMapping("/api/v1/auth/login")
    public String longin(){
        return "API Public";
    }
}
