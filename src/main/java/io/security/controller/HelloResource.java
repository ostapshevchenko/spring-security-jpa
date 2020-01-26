package io.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloResource {

    @GetMapping("/")
    public String helloAll() {
        return ("<h1>Welcome all</h1>");
    }

    @GetMapping("/admin")
    public String helloAdmin() {
        return ("<h1>Welcome Admin</h1>");
    }

    @GetMapping("/user")
    public String helloUser() {
        return ("<h1>Welcome user</h1>");
    }

}
