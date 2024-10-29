package Buoi2;

import java.util.Arrays;
import java.util.Scanner;

public class trelop {
	public static void t(int a[], int n) {
		Arrays.sort(a);
		int dem=1, dmax=1, tam=0;
		for(int i=0;i<n-1;i++) {
			if(a[i]==a[i+1]) {
				dem++;
			}
			else {
				dem=1;
			}
			if(dem>dmax) {
				dmax=dem;
				tam = a[i];
			}
		}
		System.out.println("So xuat hien nhieu nhat trong mang la: " + tam);
	}	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap n= ");
		int n = sc.nextInt();
		int []a = new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();	
		}
		t(a,n);
	}
}
