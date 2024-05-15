package com.example.demo;

import java.util.Date;

public class Hand {
	private Date createdTime = new Date();
	
	private String hand;

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public String getHand() {
		return hand;
	}

	public void setHand(String hand) {
		this.hand = hand;
	}
}
