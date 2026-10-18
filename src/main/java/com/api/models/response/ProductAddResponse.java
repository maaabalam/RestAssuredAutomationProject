package com.api.models.response;

public class ProductAddResponse {
	private int id;
	private String title;
	private String price;
	private String category;
	private String emiOptionAvailable;
	
	public ProductAddResponse() {
		
	}
	public ProductAddResponse(int id, String title, String price, String category, String emiOptionAvailable) {
		super();
		this.id = id;
		this.title = title;
		this.price = price;
		this.category = category;
		this.emiOptionAvailable = emiOptionAvailable;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getEmiOptionAvailable() {
		return emiOptionAvailable;
	}

	public void setEmiOptionAvailable(String emiOptionAvailable) {
		this.emiOptionAvailable = emiOptionAvailable;
	}
	
}
