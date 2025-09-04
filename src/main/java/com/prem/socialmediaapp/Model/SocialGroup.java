package com.prem.socialmediaapp.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Data
@NoArgsConstructor
@Entity
public class SocialGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long groupId;

    @ManyToMany
   @JoinTable(
           name = "userAndGroupId",
           joinColumns = @JoinColumn(name="group_id"),
           inverseJoinColumns = @JoinColumn(name = "user_id")
   )

    @JsonIgnore //to eliminate circular reference
    private Set<SocialUser> socialUserSet = new HashSet<>();

    @Override
    public int hashCode()
    {
        return Objects.hash(groupId);
    }

}
