package com.example.EverydayGit.Controller;



import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @Value("${client.id}")
    private String clientId;
    @GetMapping("/user/login")
    public String login() {
        return "redirect:https://github.com/login/oauth/authorize?client_id=" + clientId;
    }
}

