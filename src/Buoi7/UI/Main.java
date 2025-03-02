package Buoi7.UI;

import Buoi7.model.Role;
import Buoi7.service.IProductManager;
import Buoi7.service.impl.IProductManagerimpl;
import Buoi7.service.impl.IUserServiceImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IUserServiceImpl userService = new IUserServiceImpl();
        IProductManagerimpl productManager = new IProductManagerimpl();
        userService.login();
        if(userService.getCurrentUser().getRole().equals(Role.ADMIN)){
            while (true){
                System.out.println("-------QUAN LI SAN PHAM-------");
                System.out.println("1. Thêm sản phẩm");
                System.out.println("2. Hien thi danh sach san pham");
                System.out.println("3. Tim kiem san pham theo ten");
                System.out.println("4. Xóa sản phẩm theo ma");
                System.out.println("5. Cập nhật lại sản phẩm");
                System.out.println("6. Thoát chương trình");
                System.out.print("Nhap lua chon cua ban: ");
                int n = scanner.nextInt();
                switch (n){
                    case 1:
                        if(productManager.addProduct(scanner)) System.out.println("Them thanh cong");
                        else System.out.println("Them that bai");
                        break;
                    case 2:
                        productManager.display();
                        break;
                    case 3:
                        scanner.nextLine();
                        System.out.print("Nhap ten ma ban muon tim kiem: ");
                        String name = scanner.nextLine();
                        if(productManager.search(name)) System.out.println("Tim kiem thanh cong");
                        else System.out.println("Khong tim thay ten trong danh sach");
                        break;
                    case 4:
                        scanner.nextLine();
                        System.out.print("Nhap id de xoa san pham: ");
                        String id = scanner.nextLine();
                        if(productManager.deleteProduct(id)) System.out.println("Xoa thanh cong");
                        else System.out.println("Xoa that bai!!!");
                        break;
                    case 5:
                        scanner.nextLine();
                        System.out.print("Nhap id de cap nhat san pham: ");
                        String id2 = scanner.nextLine();
                        if(productManager.updateProduct(id2,scanner)) System.out.println("Cap nhat thanh cong");
                        else System.out.println("Cap nhat that bai!!!");
                        break;
                    case 6:
                        userService.logout();
                        System.exit(0);
                        System.out.println("Exit!!!");
                        break;
                    default:
                        System.out.println("Vui long chon lai");
                }
            }

        }
        else {
            while (true) {
                System.out.println("--------------XEM SAN PHAM--------------");
                System.out.println("1. Hien thi danh sach san pham");
                System.out.println("2. Tim kiem san pham theo ten");
                System.out.println("3. Thoat");
                System.out.print("Nhap lua chon cua ban: ");
                int n = scanner.nextInt();
                switch (n){
                    case 1:
                        productManager.display();
                        break;
                    case 2:
                        System.out.print("Nhap ten ma ban muon tim kiem: ");
                        String name = scanner.nextLine();
                        if(productManager.search(name)) System.out.println("Tim kiem thanh cong");
                        else System.out.println("Khong tim thay ten trong danh sach");
                        break;
                    case 3:
                        userService.logout();
                        System.exit(0);
                        System.out.println("Exit!!!");
                        break;
                    default:
                        System.out.println("Vui long chon lai");
                }
            }
        }
    }

}
