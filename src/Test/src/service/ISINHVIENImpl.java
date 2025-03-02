package service;

import models.SINHVIEN;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ISINHVIENImpl implements ISINHVIEN{
    private Connection connection = null;

    public ISINHVIENImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public List<SINHVIEN> getAll() {
        List<SINHVIEN> sinhvienList = new ArrayList<>();
        try{
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from SINHVIEN");
            while(resultSet.next()){
                SINHVIEN sinhvien1 = new SINHVIEN(resultSet.getString(1), resultSet.getString(2), resultSet.getDate(3), resultSet.getString(4), resultSet.getString(5));
                sinhvienList.add(sinhvien1);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return sinhvienList;
    }

    @Override
    public SINHVIEN getById() {
        Scanner scanner = new Scanner(System.in);
        SINHVIEN sinhvien1 = null;
        System.out.print("Nhap ma sinh vien ban muon tim kiem: ");
        String maSV = scanner.nextLine();

        try {
            String query = "select * from SINHVIEN where MASV = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,maSV);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                sinhvien1 = new SINHVIEN(resultSet.getString(1), resultSet.getString(2), resultSet.getDate(3), resultSet.getString(4), resultSet.getString(5));
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return sinhvien1;
    }

    @Override
    public void updateByName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap id: ");
        String id = scanner.nextLine();
        System.out.print("Nhap ten ban muon cap nhat: ");
        String name = scanner.nextLine();
        try{
            String query = "update SINHVIEN set Hoten = ? where MASV = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,name);
            preparedStatement.setString(2,id);
            System.out.println(preparedStatement.executeUpdate());
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
