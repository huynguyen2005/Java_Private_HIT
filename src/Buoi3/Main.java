package Buoi3;

public class Main {
	public static void main(String[] args) {
		Student []x = new Student[4];
		x[0] = new Student("01","Nguyen Van Huy", 19, "Nam", "113", "huy@gmail.com");
		x[1] = new Student("02","Nguyen Van Manh", 19, "Nam", "111", "manh@gmail.com");
		x[2] = new Student("03","Nguyen Duc Thinh", 18, "Nam", "110", "thinh@gmail.com");
		x[3] = new Student("04","Doan Phuong Anh", 19, "Nu", "123", "panh@gmail.com");
		String head = String.format("%-10s %-20s %-10s %-20s %-20s %-30s", "Ma sv", "Ho ten", "Tuoi", "Gioi tinh", "Phone Number", "Email");
		System.out.println(head);
		for(int i=0;i<4;i++) {
			x[i].display();
		}
	}
}
