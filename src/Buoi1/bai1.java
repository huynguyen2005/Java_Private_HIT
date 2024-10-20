package Buoi1;

import java.util.Scanner;

public class bai1 {
	static String tf(int n, int b) {
		String temp="";
		int x;
		while(n>0)
		{
			x=n%b;
			n=n/b;
			if(b==16) {
				if(x==10) 	temp+="A";
				if(x==11) 	temp+="B";
				if(x==12) 	temp+="C";
				if(x==13) 	temp+="D";
				if(x==14) 	temp+="E";
				if(x==15) 	temp+="F";
				if(x<10) 	temp+=x;
			}
			else	temp+=x;
		}
		return temp;
	}
	static void output(String temp) {
		for(int i=0;i<temp.length();i++) {
			System.out.print(temp.charAt(temp.length()-i-1));
		}
	}
	public static void main(String[] args) {
		String temp;
		int n,b;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Nhap 1 so tu nhien bat ki n= ");
			n = sc.nextInt();
			System.out.println("Ban muon chuyen sang he co so nao");
			b = sc.nextInt();
			if(b<2||b>16)
				System.out.println("Yeu can nhap lai !!!");
		}
		while(b<2||b>16);
		temp=tf(n,b);
		output(temp);
		
	}
}
