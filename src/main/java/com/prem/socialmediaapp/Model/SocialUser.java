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

    //cascade = {CascadeType.MERGE, CascadeType.PERSIST}
    @OneToOne(mappedBy = "socialUser", cascade = CascadeType.ALL)
    //@JoinColumn(name = "social_profile_")
   // @JsonIgnore //circular reference
    public SocialProfile socialProfile;

    @OneToMany(mappedBy = "socialUser", fetch = FetchType.EAGER) //fetch = FetchType.LAZY
   // @JsonIgnore //circular reference
    private List<Post> posts;

    @ManyToMany(mappedBy = "socialUserSet")
    //@JsonIgnore //circular reference
    private Set<SocialGroup> socialGroups = new HashSet<>();

    public void setSocialProfile(SocialProfile socialProfile) {
        this.socialProfile = socialProfile;
        if (socialProfile != null) {
            socialProfile.setSocialUser(this); // maintain both sides
        }
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(id);
    }

}
