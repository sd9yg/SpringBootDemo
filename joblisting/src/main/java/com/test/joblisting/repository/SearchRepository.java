package com.test.joblisting.repository;

import java.util.List;

import com.test.joblisting.models.Post;

public interface SearchRepository {
	
	List<Post> findbyText(String text);

}
