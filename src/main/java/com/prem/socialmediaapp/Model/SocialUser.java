package com.prem.socialmediaapp.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@Entity
public class SocialUser {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
