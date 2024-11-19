package Buoi4;

public class Tacgia {
	private String tentacgia;
	public Tacgia() {
		
	}
	public Tacgia(String tentacgia) {
		this.tentacgia = tentacgia;
	}
	public String getTentacgia() {
		return tentacgia;
	}
	public void setTentacgia(String tentacgia) {
		this.tentacgia = tentacgia;
	}
	@Override
	public String toString() {
		return "Tacgia [tentacgia=" + tentacgia + "]";
	}	
}
