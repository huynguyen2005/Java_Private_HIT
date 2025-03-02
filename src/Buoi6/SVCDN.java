package Buoi6;

import java.util.Scanner;

public class SVCDN extends Nguoi{
	private float tdkt;
	private int smkt;
	
	public SVCDN() {
		
	}

	public SVCDN(String hoten, String ngaysinh, String diachi, float tdkt, int smkt) {
		super(hoten, ngaysinh, diachi);
		this.tdkt = tdkt;
		this.smkt = smkt;
	}
	
	public float getTdkt() {
		return tdkt;
	}

	public void setTdkt(float tdkt) {
		this.tdkt = tdkt;
	}

	public int getSmkt() {
		return smkt;
	}

	public void setSmkt(int smkt) {
		this.smkt = smkt;
	}
	@Override
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		super.nhap();
		System.out.print("Nhap tong diem cac mon kiem tra: ");
		tdkt = sc.nextFloat();
		System.out.print("Nhap so mon kiem tra: ");
		smkt = sc.nextInt();
	}
	@Override
	public float dtb() {
		return tdkt/smkt;
	}
	
	@Override
	public void xuat() {
		super.xuat();
		System.out.println("Diem trung binh: " + dtb());
	}
}
