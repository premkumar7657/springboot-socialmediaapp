package com.prem.socialmediaapp.Repository;

import com.prem.socialmediaapp.Model.SocialUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<SocialUser,Long> {
}
