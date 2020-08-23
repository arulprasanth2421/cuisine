package com.hackathon.cuisine.dto;

import com.hackathon.cuisine.entity.RestoEntity;

public class RestoDto {
	private int restaurantid;
	private String restaurantname;
	private int review;
	private String location;
	public int getRestaurantid() {
		return restaurantid;
	}
	public void setRestaurantid(int restaurantid) {
		this.restaurantid = restaurantid;
	}
	public String getRestaurantname() {
		return restaurantname;
	}
	public void setRestaurantname(String restaurantname) {
		this.restaurantname = restaurantname;
	}
	public int getReview() {
		return review;
	}
	public void setReview(int review) {
		this.review = review;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public static RestoDto valueof(RestoEntity oe) {
		RestoDto dto=new RestoDto();
		dto.setRestaurantid(oe.getRestaurantid());
		dto.setLocation(oe.getLocation());
		dto.setRestaurantname(oe.getRestaurantname());
		dto.setReview(oe.getReview());
		return dto;
	}
	
}
