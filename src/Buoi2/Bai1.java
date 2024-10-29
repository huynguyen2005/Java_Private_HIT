package Buoi2;

import java.util.Arrays;
import java.util.Scanner;

public class Bai1 {
	public static int ktra(int a[],int n, int k) {
		for(int i=0;i<n;i++) {
			if(a[i]==k)	
				return i;
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.print("Nhap do dai mang n = ");
			n = sc.nextInt();
			if(n<1||n>104)
				System.out.println("Y/c nhap lai!!!");
		}
		while(n<1||n>104);
		int k;
		do {
			System.out.print("Nhap k = ");
			k = sc.nextInt();
			if(k<=-104||k>=104)
				System.out.println("Y/c nhap lai!!!");
		}
		while(k<=-104||k>=104);
		int []a = new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		System.out.println(ktra(a,n,k));
	}
}
