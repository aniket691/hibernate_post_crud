package com.app.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "comments")
public class Comment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String body;
	private int rating;
	private Date updated;

	@ManyToOne
	@JoinColumn(name = "commenter_id")
	private User commenter;

	@ManyToOne
	@JoinColumn(name = "post_id")
	private Post post;

	// Getters and Setters
}
