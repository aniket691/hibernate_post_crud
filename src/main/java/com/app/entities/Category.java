package com.app.entities;

import javax.persistence.*;

@Entity
@Table(name = "categories")
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String description;
	private String name;

	// Getters and Setters
}
