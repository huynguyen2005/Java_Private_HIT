package Buoi4;

public class Person {
	private String id;
	private String name;
	private int age;
	private String diachi;
	private int sdt;
	Person(){
		
	}
	public Person(String id, String name, int age, String diachi, int sdt) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.diachi = diachi;
		this.sdt = sdt;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	public int getSdt() {
		return sdt;
	}
	public void setSdt(int sdt) {
		this.sdt = sdt;
	}
	void display() {
		System.out.println(String.format("%-15s %-20s %-10d %-20s %-20d", id, name, age, diachi, sdt));
	}
	
}
