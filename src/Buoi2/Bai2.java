package Buoi2;

import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.print("Nhap do dai mang n = ");
			n = sc.nextInt();
			if(n<1||n>Math.pow(10, 5))
				System.out.println("Y/c nhap lai!!!");
		}
		while(n<1||n>Math.pow(10, 5));
		int k;
		do {
			System.out.print("Nhap k = ");
			k = sc.nextInt();
			if(k<1||k>n)
				System.out.println("Y/c nhap lai!!!");
		}
		while(k<1||k>n);
		int []a = new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int best = Integer.MIN_VALUE;
        for (int i = 0; i <= n - k; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) { 
                sum += a[j];
                if (j - i + 1 >= k) { 
                    best = Math.max(best, sum); 
                }
            }
        }
		System.out.println(best);
	}
}
