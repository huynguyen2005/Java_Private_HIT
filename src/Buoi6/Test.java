package Buoi6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap n trong khoang 2<=n<=4: ");
		int n = sc.nextInt();
		List<SVCDCQ> sv = new ArrayList<>();
		for(int i=0;i<n;i++) {
			SVCDCQ a = new SVCDCQ();
			a.nhap();
			sv.add(a);
		}
		for(SVCDCQ ss : sv) {
			ss.xuat();
		}
	}
}
