package com.hw3.model.vo;

public class Product {
	
	private String brand;
	private String name;
	private String color;
	private int price;
	
	
	public Product() {}
	
	public Product(String brand, String name, String color, int price) {
		this.brand = brand;
		this.name = name;
		this.color = color;
		this.price = price;
		
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "brand=" + brand + 
				", name=" + name + 
				", color=" + color + 
				", price=" + price;
	}
	
	@Override
	public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Product otherProduct = (Product) obj;

        if (price != otherProduct.price) return false;
        if (brand != null ? !brand.equals(otherProduct.brand) : otherProduct.brand != null) return false;
        if (name != null ? !name.equals(otherProduct.name) : otherProduct.name != null) return false;
        return color != null ? color.equals(otherProduct.color) : otherProduct.color == null;
    }
	
	@Override
	public int hashCode() {
	        int result = brand != null ? brand.hashCode() : 0;
	        result = 31 * result + (name != null ? name.hashCode() : 0);
	        result = 31 * result + (color != null ? color.hashCode() : 0);
	        result = 31 * result + price;
	        return result;
	    }

	@Override
	public Product clone() {
	        return new Product(brand, name, color, price);
	    }
		
		
		
}

