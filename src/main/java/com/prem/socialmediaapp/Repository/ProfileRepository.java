package com.prem.socialmediaapp.Repository;

import com.prem.socialmediaapp.Model.SocialProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository<SocialProfile,Long> {
}
