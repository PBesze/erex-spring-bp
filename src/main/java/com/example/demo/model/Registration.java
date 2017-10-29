package com.example.demo.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "spring_place")
public class Registration {
	 @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id;

	    @Column
	    private int userId;

	    @Column
	    private int eventId;
	    
	    @Column
	    private int status;

	    public Registration() {
	    }

	    public Registration(int userId, int eventId,  int status) {
	        this.userId = userId;
	        this.eventId = eventId;
	        this.status = status;
	    }
}
