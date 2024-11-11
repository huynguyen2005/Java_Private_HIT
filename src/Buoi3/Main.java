package Buoi3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=4;
		Student []x = new Student[n];
		x[0] = new Student("01","Nguyen Van Huy", 19, "Nam", "113", "huy@gmail.com");
		x[1] = new Student("02","Nguyen Van Manh", 19, "Nam", "111", "manh@gmail.com");
		x[2] = new Student("03","Nguyen Duc Thinh", 18, "Nam", "110", "thinh@gmail.com");
		x[3] = new Student("04","Doan Phuong Anh", 19, "Nu", "123", "panh@gmail.com");
//		System.out.print("Nhap vi tri muon chen: ");
//		int tem = sc.nextInt();
//		Student sv1 = new Student("05","Alice", 10, "Nu", "191", "garena@gmail.com");
//		for(int i = n; i>tem;i--) {
//			x[i]=x[i-1];
//		}
//		x[tem]=sv1;
//		n++;
		String head = String.format("%-10s %-20s %-10s %-20s %-20s %-30s", "Ma sv", "Ho ten", "Tuoi", "Gioi tinh", "Phone Number", "Email");
		System.out.println(head);
		for(int i=0;i<n;i++) {
			x[i].display();
//		}
	}
}
