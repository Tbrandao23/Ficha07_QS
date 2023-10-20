package org.example;

public class 	Product {
	private String title;
	private double price;
	
	public Product (String t, double p) {
		this.title = t;
		this.price = p;
	}
	
	public String getTitle() {
		return title;
	}
	
	public double getPrice() {
		return price;
	}
	
	public boolean equals(Object o) {
		if (o instanceof Product) {
			Product p = (Product)o;
			return p.getTitle().equals(title);
		}
		return false;
	}

	@Override
	public int hashCode() {
		int result;
		long temp;
		result = title.hashCode();
		temp = Double.doubleToLongBits(price);
		result = 31 * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
}

