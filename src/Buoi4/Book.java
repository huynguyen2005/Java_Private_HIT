package Buoi4;

public class Book {
	protected int masach;
	protected String tensach;
	protected Tacgia x;
	protected int namsanxuat;
	protected String tomtatnoidung;
	protected double giatien;
	public Book() {
		
	}
	public Book(int masach, String tensach, Tacgia x, int namsanxuat, String tomtatnoidung, double giatien) {
		this.masach = masach;
		this.tensach = tensach;
		this.x = x;
		this.namsanxuat = namsanxuat;
		this.tomtatnoidung = tomtatnoidung;
		this.giatien = giatien;
	}
	
	public int getMasach() {
		return masach;
	}
	public void setMasach(int masach) {
		this.masach = masach;
	}
	public String getTensach() {
		return tensach;
	}
	public void setTensach(String tensach) {
		this.tensach = tensach;
	}
	public Tacgia getX() {
		return x;
	}
	public void setX(Tacgia x) {
		this.x = x;
	}
	public int getNamsanxuat() {
		return namsanxuat;
	}
	public void setNamsanxuat(int namsanxuat) {
		this.namsanxuat = namsanxuat;
	}
	public String getTomtatnoidung() {
		return tomtatnoidung;
	}
	public void setTomtatnoidung(String tomtatnoidung) {
		this.tomtatnoidung = tomtatnoidung;
	}
	public double getGiatien() {
		return giatien;
	}
	public void setGiatien(double giatien) {
		this.giatien = giatien;
	}
	@Override
	public String toString() {
		return String.format("%-5d %-20s %-15s %-15d %-15s %-15.2f", masach, tensach, x, namsanxuat, tomtatnoidung, giatien);
	}
	public void display() {
		System.out.println(toString());
	}	
}
