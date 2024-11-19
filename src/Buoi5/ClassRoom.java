package Buoi5;

import java.util.ArrayList;
import java.util.Scanner;

public class ClassRoom {
	static ArrayList<Student> a = new ArrayList<Student>();
	public void sortByGpa() {
		for(int i=0;i<a.size()-1;i++) {
			for(int j=a.size()-1;j>i;j--) {
				if(a.get(j).getGpa()<a.get(j-1).getGpa()) {
					Student temp = a.get(j);
					a.set(j,a.get(j-1));
					a.set(j-1, temp);
				}
			}
		}
	}
	public void inputList() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap sinh vien den khi nao id bang 500 thi dung ");
		while(true) {
			Student st = new Student();
			st.nhap();
			a.add(st);
			if(st.getId()==555) {
				break;
			}
		}
	}
	public void outputList() {
		System.out.println(String.format("%-10s %-10s %-10s %-15s %-10s %-10s %-10s %-10s", "id", "nameClass", "GPA", "Name", "Age","commune", "district", "city"));
		for(Student sv: a) {
			sv.xuat();
			System.out.println();
		}
	}
	public boolean removeById() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap id ban muon xoa: ");
		int n = sc.nextInt();
		for(Student sv:a) {
			if(sv.getId()==n) {
				a.remove(sv);
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ClassRoom x = new ClassRoom();
		boolean check =true;
		while(check) {
			System.out.println("-------------------MENU--------------------");
	        System.out.println("1. Nhập thông tin các sinh viên");
	        System.out.println("2. In ra thông tin các sinh viên");
	        System.out.println("3. Sắp xếp danh sách sinh viên theo gpa");
	        System.out.println("4. Xóa sinh viên theo id");
	        System.out.println("5. Exit");
	        System.out.print("Hãy nhập sự lựa chọn của bạn: ");
	        int chose = sc.nextInt();
	        switch(chose) {
	        	case 1:
	        		x.inputList();
	        		break;
	        	case 2:
	        		x.outputList();
	        		break;
	        	case 3:
	        		x.sortByGpa();
	        		break;
	        	case 4:
	        		x.removeById();
	        		break;
	        	case 5:
	        		check=false;
	        		break;
	        	default:
                    System.out.println("Vui long nhap lai!!!");
	        }    
		}
	}
}
