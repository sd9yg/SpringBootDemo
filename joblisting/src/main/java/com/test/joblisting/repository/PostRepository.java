package com.test.joblisting.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.test.joblisting.models.Post;

public interface PostRepository extends MongoRepository<Post,String> {

}
