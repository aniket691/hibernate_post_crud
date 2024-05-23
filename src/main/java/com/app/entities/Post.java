package com.app.entities;

import javax.persistence.*;

@Entity
@Table(name = "posts")
public class Post {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String content;
	private String description;
	private String imagePath;
	private String title;

	@ManyToOne
	@JoinColumn(name = "author_id")
	private User author;

	@ManyToOne
	@JoinColumn(name = "category_id")
	private Category category;

	// Getters and Setters
}
