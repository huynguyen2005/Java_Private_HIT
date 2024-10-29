package Buoi3;

import java.util.Scanner;

public class bai2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x = sc.nextLine();
		int dema=0;
		int []a=new int[100];
		for(int i=0;i<x.length();i++) {
			if(x.charAt(i) >= '0' && x.charAt(i) <= '9') {
				a[dema]=x.charAt(i) - '0';
				dema++;
			}
			else {
				System.out.print(x.charAt(i));
			}
		}
		System.out.println();
		for(int i=0;i<dema;i++) {
			System.out.print(a[i]);
		}
		sc.close();
	}
}
