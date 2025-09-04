package com.prem.socialmediaapp.Repository;

import com.prem.socialmediaapp.Model.SocialGroup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepository extends JpaRepository<SocialGroup,Long> {
}
