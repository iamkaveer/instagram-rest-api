package com.instagram.insta.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.instagram.insta.model.Post;

public interface PostRepository extends JpaRepository<Post, Integer> {

}
