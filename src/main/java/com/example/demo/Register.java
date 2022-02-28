package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class Register {
    private String userName;
    @GetMapping("/Register")
    public String getRegister()
    {
        return "register";
    }

    @PostMapping("/register")
    public void getUser(@RequestParam String user, @RequestParam String pass){
        System.out.println("This is the user name: "+user+" and this is the password: "+pass);
    }
}
