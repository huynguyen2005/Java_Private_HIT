package Buoi7.model;

public class PhysicalProduct extends Product {
	
	@Override
	public float totalPrice() {
		return (float) (this.price*this.quantity);
	}

	@Override
	public String toString() {
		return super.toString() + "\ntotal Price:" + totalPrice();
	}
}
