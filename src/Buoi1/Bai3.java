package Buoi1;

import java.util.Scanner;

public class Bai3 {
	static void search(int a[], int n) {
		for(int i=0;i<n-1;i++) {
			for(int j=n-1;j>i;j--) {
				if(a[j]<a[j-1]) {
					int temp = a[j];
					a[j] = a[j-1];
					a[j-1] = temp;
				}
			}
		}
		for(int i=n-2;i<n;i++)
			System.out.print(a[i]+" ");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[],n;
		System.out.print("Nhap n= ");	
		n = sc.nextInt();
		a = new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		search(a,n);	
	}
}
