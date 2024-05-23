package com.app.dao;

import java.util.List;

import com.app.entities.Post;

public interface PostDao {
	void createPost(Post post);

	Post getPost(Long id);

	void updatePost(Post post);

	void deletePost(Long id);

	List<Post> getAllPosts();
}
