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
@Table(name = "spring_regsitration")
public class Place {
	 @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id;

	    @Column
	    private String name;

	    @Column
	    private int max_visitor_nr;

	    public Place() {
	    }

	    public Place(String name, int max_visitor_nr) {
	        this.name = name;
	        this.max_visitor_nr = max_visitor_nr;
	    }
}
