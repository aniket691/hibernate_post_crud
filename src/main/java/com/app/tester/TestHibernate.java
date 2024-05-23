package com.app.tester;

import java.util.List;

import com.app.dao.PostDao;
import com.app.dao.PostDaoImpl;
import com.app.entities.Post;

public class TestHibernate {

	public static void main(String[] args) {
		PostDao postDao = new PostDaoImpl();

		// Create a new post
		Post post = new Post();
		post.setContent("This is the content of the post.");
		post.setDescription("This is the description of the post.");
		post.setImagePath("/images/sample.png");
		post.setTitle("Sample Post Title");
		postDao.createPost(post);

		// Read a post
		Post retrievedPost = postDao.getPost(post.getId());
		System.out.println("Retrieved Post Title: " + retrievedPost.getTitle());

		// Update a post
		retrievedPost.setTitle("Updated Post Title");
		postDao.updatePost(retrievedPost);

		// Delete a post
//		postDao.deletePost(retrievedPost.getId());

		// List all posts
		List<Post> allPosts = postDao.getAllPosts();
		for (Post p : allPosts) {
			System.out.println("Post Title: " + p.getTitle());
		}

	}

}
