package com.prem.socialmediaapp.Service;

import com.prem.socialmediaapp.Model.SocialUser;
import com.prem.socialmediaapp.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SocialmediaService {

    @Autowired
    UserRepository userRepository;

    public List<SocialUser> getUsers() {
        return userRepository.findAll();
    }

    public SocialUser createUser(SocialUser socialUser) {
        return userRepository.save(socialUser);
    }
}
