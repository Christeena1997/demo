package Arraylist1;

public class Mobile {
	private String brand;
	private int price;//price
	private String color;
	private float rating;
	private int edition;

	public Mobile(String brand, int price,String color, float rating, int edition) {
		this.brand = brand;
		this.price = price;
		this.color=color;
		this.rating = rating;
		this.edition = edition;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public int getEdition() {
		return edition;
	}

	public void setEdition(int edition) {
		this.edition = edition;
	}

	
	public String toString() {
		return "Mobile [brand=" + brand + ", price=" + price + ", color=" + color + ", rating=" + rating + ", edition="
				+ edition + "]";
	}
}
	

	
