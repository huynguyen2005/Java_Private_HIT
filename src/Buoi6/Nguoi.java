package Buoi6;

import java.util.Scanner;

abstract class Nguoi {
	protected String hoten;
	protected String ngaysinh;
	protected String diachi;
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public String getNgaysinh() {
		return ngaysinh;
	}
	public void setNgaysinh(String ngaysinh) {
		this.ngaysinh = ngaysinh;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	
	public Nguoi() {
		
	}
	public Nguoi(String hoten, String ngaysinh, String diachi) {
		this.hoten = hoten;
		this.ngaysinh = ngaysinh;
		this.diachi = diachi;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ho ten sinh vien: ");
		hoten = sc.nextLine();
		System.out.print("Nhap ngay sinh sinh vien: ");
		ngaysinh = sc.nextLine();
		System.out.print("Nhap dia chi sinh vien: ");
		diachi = sc.nextLine();
	}
	public void xuat() {
		System.out.println("Ho ten: " + hoten);
		System.out.println("Ngay sinh: " + ngaysinh);
		System.out.println("Dia chi: " + diachi);
	}
	public abstract float dtb();
}
