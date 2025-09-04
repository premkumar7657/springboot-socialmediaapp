package com.prem.socialmediaapp.Controller;


import com.prem.socialmediaapp.Model.SocialUser;
import com.prem.socialmediaapp.Service.SocialmediaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class SocialmediaController {

    @Autowired
    SocialmediaService socialmediaService;

    @GetMapping("/users")
    public ResponseEntity<List<SocialUser>> getUsers()
    {
        return new ResponseEntity<>(socialmediaService.getUsers(), HttpStatus.OK);
    }

    @PostMapping("/users")
    public ResponseEntity<SocialUser> createUser(@RequestBody SocialUser socialUser)
    {
        return new ResponseEntity<>(socialmediaService.createUser(socialUser),HttpStatus.CREATED);
    }
}
