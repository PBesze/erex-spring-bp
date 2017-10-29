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
@Table(name = "spring_user")
public class User {
	 @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id;

	    @Column
	    private String nick;

	    @Column
	    private String email;

	    @Column
	    private boolean host;
	    
	    @Column
	    private int status;
	    
	    public User() {
	    }

	    public User(String nick, String email, boolean host, int status) {
	        this.nick = nick;
	        this.email = email;
	        this.host= host;
	        this.status = status;
	    }
}
