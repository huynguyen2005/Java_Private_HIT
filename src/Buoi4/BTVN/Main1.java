package Buoi4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main1 {
	public static void add(ArrayList<Book> a) {
		a.add(new Book(116, "Tam nhin", "Luan", 1989, "Your eyes", 90.5));
		for(Book bk : a) {
			bk.display();
		}
	}
	public static void sua(ArrayList<Book> a) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap thu tu sach ma ban muon sua: ");
		int stt = sc.nextInt();
		for(int i=0;i<a.size();i++) {
			if(i==stt-1) {
				a.get(i).setMasach(333);
				a.get(i).setTensach("Sua ten");
				a.get(i).setTentacgia("Nguyen");
				a.get(i).setNamsanxuat(9999);
				a.get(i).setTomtatnoidung("Hihi");
				a.get(i).setGiatien(5555.55);
			}
		}
		for(Book s:a) {
			s.display();
		}
	}
	public static void in(ArrayList<Book> a) {
		for(Book bk:a) {
			bk.display();
		}
	}
	public static void sacholdmax(ArrayList<Book> a) {
		int minn = a.get(0).getNamsanxuat();
		int minnso=0;
		for(int i=1;i<a.size();i++) {
			if(a.get(i).getNamsanxuat()<minn) {
				minn=a.get(i).getNamsanxuat();
				minnso=i;
			}
		}
		a.get(minnso).display();
	}
	public static void fitt(ArrayList<Book> a) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vui long nhap so tien ban co: ");
		double stt = sc.nextDouble();
		boolean found = false;
		for(int i=0;i<a.size();i++) {
			if(a.get(i).getGiatien()<=stt) {
				a.get(i).display();
				found = true;
			}
		}
		if(!found) {
			System.out.println("No book!!!");
		}
	}
	public static void sx(ArrayList<Book> a) {
		for(int i=0;i<a.size()-1;i++) {
			int m = i;
			for(int j=i+1;j<a.size();j++) {
				if(a.get(j).getGiatien()<a.get(m).getGiatien()) {
					m=j;
				}
			}
			if(m!=i) {
				Book temp = a.get(i);
				a.set(i, a.get(m));
				a.set(m, temp);
			}
		}
		for(Book bk:a) {
			bk.display();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Book> a = new ArrayList<>();
		a.add(new Book(111, "Sach thanh", "Huy", 2000, "Dame big", 101.3));
        a.add(new Book(112, "Sach truy hon", "Thinh", 2100, "Giam hoi mau", 98.3));
        a.add(new Book(113, "Bang suong", "Dong", 1999, "Dong bang", 50.88));
        a.add(new Book(114, "Quy kiem", "Manh", 5000, "Hut mau", 2435.55));
        a.add(new Book(115, "Dac nhan tam", "Vinh", 2025, "Your life", 66.56));
		System.out.println("----------Menu----------");
		System.out.println("1.Them sach moi");
		System.out.println("2.Chinh sua thong tin sach");
		System.out.println("3.In ra danh sach co trong mang");
		System.out.println("4.In ra cuon sach lau doi co kinh nhat");
		System.out.println("5.In ra cuon sach phu hop voi gia tien nguoi mua yeu cau");
		System.out.println("6.Sap xep lai danh sach cac cuon sach");
		System.out.print("Ban muon chon so may: ");
		int k = sc.nextInt();
		switch(k) {
			case 1:
				add(a);
				break;
			case 2:
				sua(a);
				break;
			case 3:
				in(a);
				break;
			case 4:
				sacholdmax(a);
				break;
			case 5:
				fitt(a);
				break;
			case 6:
				sx(a);
				break;
		}
	}
}
