package com.example.demo.model;

import lombok.Data;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "spring_event")
public class Event {
	 @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id;

	    @Column
	    private int userId;

	    @Column
	    private int placeId;
	    
	    @Column
	    private Date eventDate;
	    
	    @Column
	    private int status;

	    public Event() {
	    }

	    public Event(int userId, int placeId,  int status, Date eventDate) {
	        this.userId = userId;
	        this.placeId = placeId;
	        this.status = status;
	        this.eventDate = eventDate;
	    }
}
