package br.com.alura.microservices.auth.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class OAuthController {

    @GetMapping("/user")
    public Principal user(Principal user) {
        return user;
    }
}
