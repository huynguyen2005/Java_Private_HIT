package Buoi5;

import java.util.Scanner;

public class Student extends Person {
	private int id;
	private String nameClass;
	private float gpa;
	private final float criteria=2;
	public Student() {
	
	}
	public Student(String name, int age, Address address, int id, String nameClass, float gpa) {
		super(name, age, address);
		this.id = id;
		this.nameClass = nameClass;
		this.gpa = gpa;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNameClass() {
		return nameClass;
	}
	public void setNameClass(String nameClass) {
		this.nameClass = nameClass;
	}
	public float getGpa() {
		return gpa;
	}
	public void setGpa(float gpa) {
		this.gpa = gpa;
	}
	public float getCriteria() {
		return criteria;
	}
	@Override
	void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap id:");
		id = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhap nameClass:");
		nameClass = sc.nextLine();
		System.out.println("Nhap GPA:");
		gpa = sc.nextFloat();
		sc.nextLine();
		super.nhap();
	}
	@Override
	void xuat() {
		System.out.printf(String.format("%-10d %-10s %-10.2f", id, nameClass, gpa));
		super.xuat();
	}
	boolean checkFall() {
		if(gpa<criteria)
			return true;
		return false;
	}
}
