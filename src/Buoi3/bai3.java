package Buoi3;

import java.util.Scanner;

public class bai3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float x;
		do {
			System.out.println("nhap x= ");
			x= sc.nextFloat();
			if(x<-100||x>100)
				System.out.println("yc nhap lai");
		}
		while(x<-100||x>100);
		int y;
		do {
			System.out.println("nhap y= ");
			y= sc.nextInt();
			if(y<Math.pow(-2, 31)-1||y>Math.pow(2, 31)-1)
				System.out.println("yc nhap lai");
		}
		while(y<Math.pow(-2, 31)-1||y>Math.pow(2, 31)-1);
		float sum=1;
		for(int i=1;i<=y;i++) {
			sum*=x;
		}
		System.out.println(sum);
		sc.close();
	}
}
