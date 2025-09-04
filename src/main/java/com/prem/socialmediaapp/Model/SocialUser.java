package com.prem.socialmediaapp.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;


@Data
@NoArgsConstructor
@Entity
public class SocialUser {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(mappedBy = "socialUser")
    //@JoinColumn(name = "social_profile_")
   // @JsonIgnore //circular reference
    public SocialProfile socialProfile;

    @OneToMany(mappedBy = "socialUser")
   // @JsonIgnore //circular reference
    private List<Post> posts;

    @ManyToMany(mappedBy = "socialUserSet")
    //@JsonIgnore //circular reference
    private Set<SocialGroup> socialGroups = new HashSet<>();


    @Override
    public int hashCode()
    {
        return Objects.hash(id);
    }

}
