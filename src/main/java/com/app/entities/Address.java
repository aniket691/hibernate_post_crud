package com.app.entities;

import javax.persistence.*;

@Entity
@Table(name = "address")
public class Address {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String adrLine1;
    private String adrLine2;
    private String city;
    private String country;
    private String state;
    private String zipCode;

    // Getters and Setters
}
