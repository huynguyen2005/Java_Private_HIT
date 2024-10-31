package Buoi3;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap 1 so bat ki: ");
        String x = sc.nextLine();
        if (x.length() == 3) {
            // Xử lý số có 3 chữ số
            if (x.charAt(0) == '1') System.out.print("Mot tram ");
            if (x.charAt(0) == '2') System.out.print("Hai tram ");
            if (x.charAt(0) == '3') System.out.print("Ba tram ");
            if (x.charAt(0) == '4') System.out.print("Bon tram ");
            if (x.charAt(0) == '5') System.out.print("Nam tram ");
            if (x.charAt(0) == '6') System.out.print("Sau tram ");
            if (x.charAt(0) == '7') System.out.print("Bay tram ");
            if (x.charAt(0) == '8') System.out.print("Tam tram ");
            if (x.charAt(0) == '9') System.out.print("Chin tram ");
            if (x.charAt(1) == '0') System.out.print("le ");
            if (x.charAt(1) == '1') System.out.print("muoi ");
            if (x.charAt(1) == '2') System.out.print("hai muoi ");
            if (x.charAt(1) == '3') System.out.print("ba muoi ");
            if (x.charAt(1) == '4') System.out.print("bon muoi ");
            if (x.charAt(1) == '5') System.out.print("nam muoi ");
            if (x.charAt(1) == '6') System.out.print("sau muoi ");
            if (x.charAt(1) == '7') System.out.print("bay muoi ");
            if (x.charAt(1) == '8') System.out.print("tam muoi ");
            if (x.charAt(1) == '9') System.out.print("chin muoi ");
            if (x.charAt(2) == '1') System.out.print("mot ");
            if (x.charAt(2) == '2') System.out.print("hai ");
            if (x.charAt(2) == '3') System.out.print("ba ");
            if (x.charAt(2) == '4') System.out.print("bon ");
            if (x.charAt(2) == '5') System.out.print("lam ");
            if (x.charAt(2) == '6') System.out.print("sau ");
            if (x.charAt(2) == '7') System.out.print("bay ");
            if (x.charAt(2) == '8') System.out.print("tam ");
            if (x.charAt(2) == '9') System.out.print("chin ");
        } else if (x.length() == 2) {
            // Xử lý số có 2 chữ số (hàng chục)
            if (x.charAt(0) == '1') System.out.print("Muoi ");
            if (x.charAt(0) == '2') System.out.print("Hai muoi ");
            if (x.charAt(0) == '3') System.out.print("Ba muoi ");
            if (x.charAt(0) == '4') System.out.print("Bon muoi ");
            if (x.charAt(0) == '5') System.out.print("Nam muoi ");
            if (x.charAt(0) == '6') System.out.print("Sau muoi ");
            if (x.charAt(0) == '7') System.out.print("Bay muoi ");
            if (x.charAt(0) == '8') System.out.print("Tam muoi ");
            if (x.charAt(0) == '9') System.out.print("Chin muoi ");
            if (x.charAt(1) == '1') System.out.print("mot ");
            if (x.charAt(1) == '2') System.out.print("hai ");
            if (x.charAt(1) == '3') System.out.print("ba ");
            if (x.charAt(1) == '4') System.out.print("bon ");
            if (x.charAt(1) == '5') System.out.print("lam ");
            if (x.charAt(1) == '6') System.out.print("sau ");
            if (x.charAt(1) == '7') System.out.print("bay ");
            if (x.charAt(1) == '8') System.out.print("tam ");
            if (x.charAt(1) == '9') System.out.print("chin ");
        } else if (x.length() == 1) {
            // Xử lý số có 1 chữ số (hàng đơn vị)
            if (x.charAt(0) == '0') System.out.print("khong ");
            if (x.charAt(0) == '1') System.out.print("mot ");
            if (x.charAt(0) == '2') System.out.print("hai ");
            if (x.charAt(0) == '3') System.out.print("ba ");
            if (x.charAt(0) == '4') System.out.print("bon ");
            if (x.charAt(0) == '5') System.out.print("nam ");
            if (x.charAt(0) == '6') System.out.print("sau ");
            if (x.charAt(0) == '7') System.out.print("bay ");
            if (x.charAt(0) == '8') System.out.print("tam ");
            if (x.charAt(0) == '9') System.out.print("chin ");
        } 
        sc.close();
    }
}
