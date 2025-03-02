package Buoi7.service.impl;


import Buoi7.model.PhysicalProduct;
import Buoi7.model.Product;
import Buoi7.service.IProductManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IProductManagerimpl implements IProductManager {
	private List<Product> productlist = new ArrayList<>();
	@Override
	public boolean addProduct(Scanner scanner) {
		Product product = new PhysicalProduct();
		try{
			scanner.nextLine();
			System.out.print("Nhap id san pham: ");
			String id = scanner.nextLine();
			for(Product pr1:productlist){
				if(pr1.getId().equals(id)){
					throw new Exception("ID đã tồn tại!!! Vui lòng nhâọ lại");
				}
			}
			product.setId(id);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			return false;
		}
		System.out.print("Nhap ten san pham: ");
		product.setNameProduct(scanner.nextLine());
		System.out.print("Nhap gia san pham: ");
		product.setPrice(scanner.nextFloat());
		System.out.print("Nhap so luong san pham: ");
		product.setQuantity(scanner.nextInt());
		productlist.add(product);
		return true;
	}

	@Override
	public void display() {
			for (Product pr2:productlist){
				pr2.xuat();
            }
	}

	@Override
	public boolean search(String name) {
		for (Product pr3:productlist){
			if(pr3.getNameProduct().equals(name)){
				pr3.xuat();
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean deleteProduct(String id) {
		for (Product pr4:productlist){
			if(pr4.getId().equals(id)){
				productlist.remove(pr4);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean updateProduct(String id,Scanner scanner) {
		for (Product pr5:productlist){
			if(pr5.getId().equals(id)){
				System.out.print("Cap nhap lai ten: ");
				pr5.setNameProduct(scanner.nextLine());
				System.out.print("Cap nhap lai gia: ");
				pr5.setPrice(scanner.nextFloat());
				System.out.print("Cap nhap lai so luong: ");
				pr5.setQuantity(scanner.nextInt());
				return true;
			}
		}
		return false;
	}
}
