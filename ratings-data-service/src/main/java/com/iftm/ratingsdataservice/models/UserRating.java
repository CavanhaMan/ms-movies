package com.iftm.ratingsdataservice.models;

import java.util.List;

import com.iftm.ratingsdataservice.model.Rating;

public class UserRating {

	private List<Rating> userRating;

	public UserRating() {super();}
	public List<Rating> getUserRating() {return userRating;}
	public void setUserRating(List<Rating> userRating) {this.userRating = userRating;}
	
}
