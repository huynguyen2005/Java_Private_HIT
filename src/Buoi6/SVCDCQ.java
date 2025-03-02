package Buoi6;

import java.util.Scanner;

public class SVCDCQ extends Nguoi{
	private float tdkt;
	private int smkt;
	private float dtkthp;
	
	public SVCDCQ() {
		
	}

	public SVCDCQ(String hoten, String ngaysinh, String diachi,float tdkt, int smkt, float dtkthp) {
		super(hoten,ngaysinh,diachi);
		this.tdkt = tdkt;
		this.smkt = smkt;
		this.dtkthp = dtkthp;
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

	public float getDtkthp() {
		return dtkthp;
	}

	public void setDtkthp(float dtkthp) {
		this.dtkthp = dtkthp;
	}
	@Override
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		super.nhap();
		System.out.print("Nhap tong diem cac mon kiem tra: ");
		tdkt = sc.nextFloat();
		System.out.print("Nhap so mon kiem tra: ");
		smkt = sc.nextInt();
		System.out.print("Nhap diem thi ket thuc hoc phan: ");
		dtkthp = sc.nextFloat();
	}
	
	@Override
	public float dtb() {
		return (tdkt/smkt + dtkthp)/3;
	}
	
	@Override
	public void xuat() {
		super.xuat();
		System.out.println("Diem trung binh: " + dtb());
	}
}
