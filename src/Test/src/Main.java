import models.SINHVIEN;
import service.ISINHVIENImpl;

import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
//            //Tao ket noi
//            Connection connection = B1Connect.getConnection();
//            String query = "select * from SINHVIEN where MASV = ? and Quequan = ?";
//            PreparedStatement preparedStatement = connection.prepareStatement(query);
//            preparedStatement.setString(1,maSV);
//            preparedStatement.setString(2,"Ha Noi");
//            ResultSet resultSet = preparedStatement.executeQuery();
//            //Doc du lieu tu bang SINHVIEN
//            //Tao doi tuong Statement de truy van
//            Statement statement = connection.createStatement();
//            //Sau khi thuc thi xong phai chua ket qua vao dau do thi ta dung ResultSet
//            //Thuc thi cau truy van dung executeQuery
//            ResultSet resultSet = statement.executeQuery("select * from SINHVIEN");
//            while(resultSet.next()){
//                System.out.println(resultSet.getString(1)+resultSet.getString(2)+resultSet.getString(3)+resultSet.getString(4)+resultSet.getString(5));
//            }
            Connection connection = B1Connect.getConnection();
            ISINHVIENImpl isinhvienimpl = new ISINHVIENImpl(connection);
            for (SINHVIEN sinhvien1 : isinhvienimpl.getAll()){
                System.out.println(sinhvien1.toString());
            }
            System.out.println(isinhvienimpl.getById());
            isinhvienimpl.updateByName();
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}