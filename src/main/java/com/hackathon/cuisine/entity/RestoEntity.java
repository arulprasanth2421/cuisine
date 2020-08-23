package com.hackathon.cuisine.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table(name="Resto")
public class RestoEntity {
	@Id
	@Column(name="RESTAURANTID")
	@SequenceGenerator(name="seq", initialValue=101, allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
	private int restaurantid;
	@Column(name="RESTAURANTNAME")
	private String restaurantname;
	@Column(name="REVIEW")
	private int review;
	@Column(name="LOCATION")
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
	

}
