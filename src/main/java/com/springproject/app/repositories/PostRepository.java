package com.springproject.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springproject.app.entities.Post;

public interface PostRepository extends JpaRepository<Post, Integer> {

}
