package com.api.models.request;

public class ProductAddRequest {
	private int id;
	private String title;
	private String price;
	private String category;
	private String emiOptionAvailable;
	
	public ProductAddRequest(int id, String title, String price, String category, String emiOptionAvailable) {
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
	
	public static class builder{
		private int id;
		private String title;
		private String price;
		private String category;
		private String emiOptionAvailable;
		
		public builder setId(int id) {
			this.id = id;
			return this;
		}
		public builder setTitle(String title) {
			this.title = title;
			return this;
		}
		public builder setPrice(String price) {
			this.price = price;
			return this;
		}
		public builder setCategory(String category) {
			this.category = category;
			return this;
		}
		public builder setEmiOptionAvailable(String emiOptionAvailable) {
			this.emiOptionAvailable = emiOptionAvailable;
			return this;
		}
		
		public ProductAddRequest build() {
			return new ProductAddRequest(id, title, price, category, emiOptionAvailable);
		}
		
	}
}
