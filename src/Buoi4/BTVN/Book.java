package Buoi4;

public class Book {
	private int masach;
	private String tensach;
	private String tentacgia;
	private int namsanxuat;
	private String tomtatnoidung;
	private double giatien;
	public Book() {
		
	}
	public Book(int masach, String tensach, String tentacgia, int namsanxuat, String tomtatnoidung, double giatien) {
		this.masach = masach;
		this.tensach = tensach;
		this.tentacgia = tentacgia;
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
	public String getTentacgia() {
		return tentacgia;
	}
	public void setTentacgia(String tentacgia) {
		this.tentacgia = tentacgia;
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
		return String.format("%-5d %-20s %-15s %-15d %-15s %-15.2f", masach, tensach, tentacgia, namsanxuat, tomtatnoidung, giatien);
	}
	public void display() {
		System.out.println(toString());
	}	
}
