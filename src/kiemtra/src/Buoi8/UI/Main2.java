package Buoi8.UI;

import Buoi8.model.Account;
import Buoi8.model.Address;
import Buoi8.model.Role;
import Buoi8.model.Status;
import Buoi8.service.impl.IAccountServiceImpl;
import Buoi8.service.impl.IAuthServiceImpl;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IAccountServiceImpl iAccountServiceimpl = new IAccountServiceImpl();
        IAuthServiceImpl iAuthServiceimpl = new IAuthServiceImpl();
        iAuthServiceimpl.login(scanner);
        if(iAuthServiceimpl.getCurrentaccount().getRole().equals(Role.ADMIN)){
            while(true){
                System.out.println("===== HỆ THỐNG QUẢN LÝ TÀI KHOẢN =====");
                System.out.println("Xin chào ADMIN: [username của admin]\n" +
                        "Chọn một trong các chức năng sau");
                System.out.println("1. Xem danh sách tài khoán");
                System.out.println("2. Tạo tài khoản mới");
                System.out.println("3. Tim kiếm tài khoản theo username");
                System.out.println("4. Xóa tài khoản");
                System.out.println("5. Thay đổi trạng thái tài khoản (ACTIVE • BAN)");
                System.out.println("6. Xem thông tin cá nhãn");
                System.out.println("0. Đăng xuất");
                System.out.print("Nhập lựa chọn của bạn:");
                int n = scanner.nextInt();
                scanner.nextLine();
                switch (n){
                    case 1:
                        iAccountServiceimpl.getAllAccount();
                        break;
                    case 2:
                        System.out.print("Nhap id: ");
                        String id = scanner.nextLine();
                        System.out.print("Nhap full name: ");
                        String name = scanner.nextLine();
                        System.out.print("Nhap age: ");
                        int age = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Nhap address street: ");
                        String street = scanner.nextLine();
                        System.out.print("Nhap address city: ");
                        String city = scanner.nextLine();
                        System.out.print("Nhap birthday: ");
                        String birthday = scanner.nextLine();
                        System.out.print("Nhap username: ");
                        String username = scanner.nextLine();
                        System.out.print("Nhap password: ");
                        String password = scanner.nextLine();
                        System.out.print("Nhap role: ");
                        String role = scanner.nextLine().toUpperCase();
                        System.out.print("Nhap status: ");
                        String status = scanner.nextLine().toUpperCase();
                        iAccountServiceimpl.createNewAccount(new Account(id, name, age, new Address(street,city), birthday, username, password, Role.valueOf(role), Status.valueOf(status)));
                        break;
                    case 3:
                        System.out.println("Nhap username ma ban muon tim kiem: ");
                        String username1 = scanner.nextLine();
                        iAccountServiceimpl.getAccountByUsername(username1);
                        break;
                    case 4:
                        System.out.println("Nhap username ma ban muon xoa: ");
                        String username2 = scanner.nextLine();
                        iAccountServiceimpl.deleteAccount(username2);
                        break;
                    case 5:
                        System.out.println("Nhap username: ");
                        String username3 = scanner.nextLine();
                        System.out.println("Nhap trang thai ban muon thay doi: ");
                        String status2 = scanner.nextLine().toUpperCase();
                        iAccountServiceimpl.changeStatus(username3,Status.valueOf(status2));
                        break;
                    case 6:
                        System.out.println(iAuthServiceimpl.getCurrentaccount().toString());
                        break;
                    case 7:
                        iAuthServiceimpl.logout();
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Lua chon cua ban kh dung");
                        break;
                }
            }

        }
        else{
            while(true){
                System.out.println("==== HỆ THỐNG-NGƯỜI DÙNG ====-");
                System.out.println("Xin chào USER: [username của user]");
                System.out.println("Chọn một trong các chức năng sau:");
                System.out.println("1. Đổi mật khẩu");
                System.out.println("2. Xem thông tin cá nhân");
                System.out.println("0. Đăng xuất");
                System.out.print("Nhập lựa chọn của bạn:");
                int k = scanner.nextInt();
                scanner.nextLine();
                switch (k){
                    case 1:
                        System.out.println("Nhap username: ");
                        String username9 = scanner.nextLine();
                        System.out.println("Nhap old password: ");
                        String oldpassword = scanner.nextLine();
                        System.out.println("Nhap new password: ");
                        String newpassword = scanner.nextLine();
                        iAuthServiceimpl.changePassword(username9, oldpassword,newpassword);
                        break;
                    case 2:
                        System.out.println(iAuthServiceimpl.getCurrentaccount().toString());
                        break;
                    case 0:
                        iAuthServiceimpl.logout();
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Lua chon cua ban khong hop le!!!");
                        break;
                }
            }
        }
    }
}
