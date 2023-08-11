package com.furlencoapp.model;

public class FurnitureDTO {
	private String furnitureId;
    private String furnitureName;
    private double price;
    private int quantity;
    private String size;
    private String catagory;
    private String reviewStar;
	private String imageString;
	
	public FurnitureDTO() {
		super();
	}

	public FurnitureDTO(String furnitureId, String furnitureName, double price, int quantity, String size, String catagory,
			String reviewStar, String imageString) {
		super();
		this.furnitureId = furnitureId;
		this.furnitureName = furnitureName;
		this.price = price;
		this.quantity = quantity;
		this.size = size;
		this.catagory = catagory;
		this.reviewStar = reviewStar;
		this.imageString = imageString;
	}

	public String getFurnitureId() {
		return furnitureId;
	}

	public void setFurnitureId(String furnitureId) {
		this.furnitureId = furnitureId;
	}

	public String getFurnitureName() {
		return furnitureName;
	}

	public void setFurnitureName(String furnitureName) {
		this.furnitureName = furnitureName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getCatagory() {
		return catagory;
	}

	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}

	public String getReviewStar() {
		return reviewStar;
	}

	public void setReviewStar(String reviewStar) {
		this.reviewStar = reviewStar;
	}

	public String getImageString() {
		return imageString;
	}

	public void setImageString(String imageString) {
		this.imageString = imageString;
	}

	@Override
	public String toString() {
		return "Furniture [furnitureId=" + furnitureId + ", furnitureName=" + furnitureName + ", price=" + price
				+ ", quantity=" + quantity + ", size=" + size + ", catagory=" + catagory + ", reviewStar=" + reviewStar
				+ ", imageString=" + imageString + "]";
	}

}
