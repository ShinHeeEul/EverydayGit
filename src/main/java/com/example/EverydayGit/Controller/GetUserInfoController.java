package com.example.EverydayGit.Controller;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GetUserInfoController {


    @GetMapping("/login")
    public ResponseEntity<String> getUserInfo(@RequestParam String code) {
        String accessToken = getAccessToken(code);
        String userName = getUserName(accessToken);
        return ResponseEntity.ok(userName);
    }

    private String getAccessToken(String code) {
        return null;
    }

    private String getUserName(String accessToken) {
        return null;
    }

}
