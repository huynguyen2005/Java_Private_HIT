package Buoi4;

import java.util.Scanner;

public class Main {
	public static void SearchByName(Person x[], String ten) {
		System.out.println(String.format("%-15s %-20s %-10s %-20s %-20s","id","name","age","diachi","sdt"));
		boolean test = false;
		for(Person x1 : x) {
			if(x1.getName().equalsIgnoreCase(ten)) {
				x1.display();
				test = true;
			}
		}
		if(test==false) {
			System.out.println("Khong tim thay ten trong danh sach");
		}
	}
	public static void SearchByCCCD(Person x[], String cccd) {
		boolean test = false;
		System.out.println(String.format("%-15s %-20s %-10s %-20s %-20s","id","name","age","diachi","sdt"));
		for(int i=0;i<x.length;i++) {
			if(x[i].getId().equals(cccd)) {
				x[i].display();
				test = true;
			}
		}
		if(test==false) {
			System.out.println("Khong tim thay ten trong danh sach");
		}
	}
	public static void SortByAge(Person x[]) {
		for(int i=0;i<x.length-1;i++) {
			for(int j=x.length-1;j>i;j--) {
				if(x[j].getAge()<x[j-1].getAge()) {
					Person temp = x[j];
					x[j] = x[j-1];
					x[j-1] = temp;
				}
			}
		}
		System.out.println(String.format("%-15s %-20s %-10s %-20s %-20s","id","name","age","diachi","sdt"));
		for(int i=0;i<x.length;i++) {
			x[i].display();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person []x = new Person[3];
		x[0] = new Person("001","Huy",30,"Ha Noi",113);
		x[1] = new Person("002","Manh",19,"Ha Nam",114);
		x[2] = new Person("003","Vinh",20,"Ha Noi",115);
		System.out.print("Lua chon: ");
		int n = sc.nextInt();
		sc.nextLine();
		switch(n) {
			case 1:
				System.out.print("Nhap ten ban muon tim: ");
				String ten = sc.nextLine();
				SearchByName(x,ten);
				break;
			case 2:
				System.out.print("Nhap cccd ban muon tim: ");
				String cccd = sc.nextLine();
				SearchByCCCD(x,cccd);
				break;
			case 3:
				SortByAge(x);
				break;
			case 4:
				System.out.println("Ket thuc");
				break;
		}
		sc.close();
	}
}
