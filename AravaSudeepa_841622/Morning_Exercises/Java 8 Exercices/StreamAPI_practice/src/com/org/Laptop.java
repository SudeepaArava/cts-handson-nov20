package com.org;

import java.util.ArrayList;
import java.util.List;

public class Laptop {

	private String brandName;
	private double rating;
	private double price;
	private String ram;
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	@Override
	public String toString() {
		return "Laptop [brandName=" + brandName + ", rating=" + rating + ", price=" + price + ", ram=" + ram + "]";
	}
	public Laptop(String brandName, double rating, double price, String ram) {
		super();
		this.brandName = brandName;
		this.rating = rating;
		this.price = price;
		this.ram = ram;
	}
	public Laptop() {
		super();
	}
	public static List<Laptop> fetchLaptops()
	{
		List<Laptop> laptops=new ArrayList<Laptop>();
		laptops.add(new Laptop("dell",4.5,30000,"16GB"));
		laptops.add(new Laptop("HP",4.8,25000,"4GB"));
		laptops.add(new Laptop("Lenovo",4.2,40000,"8GB"));
		laptops.add(new Laptop("dell",3.0,60000,"16GB"));
		laptops.add(new Laptop("Hp",4.5,75000,"4GB"));
		laptops.add(new Laptop("Lenovo",4.0,15000,"16GB"));
		laptops.add(new Laptop("dell",4.1,45000,"8GB"));
		laptops.add(new Laptop("Hp",4.0,30000,"4GB"));
		laptops.add(new Laptop("Lenovo",3.0,60000,"16GB"));
		return laptops;
	}
}
