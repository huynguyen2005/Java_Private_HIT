package Buoi1;

import java.util.Scanner;

public class Bai2 {
	static int f(int n) {
		if(n==0) return 0;
		else if(n<10) return n;
		int k=n%10;
		return f(n/10)*k;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap 1 so nguyen n= ");
		int n = sc.nextInt();
		int kq=f(n);
		System.out.println(kq);
	}
}
