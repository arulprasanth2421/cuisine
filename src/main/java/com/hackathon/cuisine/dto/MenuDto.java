package com.hackathon.cuisine.dto;

import com.hackathon.cuisine.entity.MenuEntity;

public class MenuDto {
	private int itemid;
	private String itemname;
	private float amount;
	private int rating;
	public int getItemid() {
		return itemid;
	}
	public void setItemid(int itemid) {
		this.itemid = itemid;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public static MenuDto valueof(MenuEntity o) {
		MenuDto dto=new MenuDto();
		dto.setAmount(o.getAmount());
		dto.setItemid(o.getItemid());
		dto.setItemname(o.getItemname());
		dto.setRating(o.getRating());
		return dto;
	}
	

}
