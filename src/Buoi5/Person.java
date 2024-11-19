package Buoi5;

import java.util.Scanner;

public class Person {
	protected String name;
	protected int age;
	protected Address address;
	public Person() {
		
	}
	public Person(String name, int age, Address address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten: ");
		name = sc.nextLine();
		System.out.println("Nhap tuoi: ");
		age = sc.nextInt();
		sc.nextLine();
		address = new Address();
		address.nhap();
	}
	void xuat() {
		System.out.printf(String.format("%-15s %-10d", name, age));
		address.xuat();
	}
	
}
