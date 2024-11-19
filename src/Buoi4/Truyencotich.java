package Buoi4;

public class Truyencotich extends Book {
	private int sotrang;
	public Truyencotich() {
		
	}

	public Truyencotich(int sotrang, int masach, String tensach, Tacgia x, int namsanxuat, String tomtatnoidung, double giatien) {
		super(masach, tensach, x, namsanxuat, tomtatnoidung, giatien);
		this.sotrang = sotrang;
	}

	public int getSotrang() {
		return sotrang;
	}

	public void setSotrang(int sotrang) {
		this.sotrang = sotrang;
	}

	@Override
	public String toString() {
		return super.toString()+String.format("%-15d", sotrang);
	}
	
}
