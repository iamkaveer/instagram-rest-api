package com.instagram.insta.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.instagram.insta.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
