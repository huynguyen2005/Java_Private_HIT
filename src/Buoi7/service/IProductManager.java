package Buoi7.service;

import java.util.Scanner;


public interface IProductManager {
	public boolean addProduct(Scanner scanner);
	public void display();
	public boolean search(String name);//admin use method
	public boolean deleteProduct(String id);	//admin use method
	public boolean updateProduct(String id,Scanner scanner);	//admin use method
}
