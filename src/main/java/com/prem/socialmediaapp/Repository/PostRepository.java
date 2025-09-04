package com.prem.socialmediaapp.Repository;

import com.prem.socialmediaapp.Model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Long> {
}
