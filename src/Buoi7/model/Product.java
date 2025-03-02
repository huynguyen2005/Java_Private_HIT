package Buoi7.model;

public abstract class Product {
	protected String id;
	protected String nameProduct;
	protected float price;
	protected int quantity;
	
	public Product() {
		
	}

	public Product(String id, String nameProduct, float price, int quantity) {
		this.id = id;
		this.nameProduct = nameProduct;
		this.price = price;
		this.quantity = quantity;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNameProduct() {
		return nameProduct;
	}

	public void setNameProduct(String name) {
		this.nameProduct = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Product"
				+ "\n id=" + id 
				+ "\n name=" + nameProduct
				+ "\n price=" + price 
				+ "\n quantity=" + quantity;
	}
	
	public void xuat() {
		System.out.println(toString());
	}
	public abstract float totalPrice();
}
