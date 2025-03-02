package models;

import java.util.Date;

public class SINHVIEN {
    private String MASV;
    private String Hoten;
    private Date Ngaysinh;
    private String Quequan;
    private String Gioitinh;

    public SINHVIEN() {
    }

    public SINHVIEN(String MASV, String hoten, Date ngaysinh, String quequan, String gioitinh) {
        this.MASV = MASV;
        Hoten = hoten;
        Ngaysinh = ngaysinh;
        Quequan = quequan;
        Gioitinh = gioitinh;
    }

    public String getMASV() {
        return MASV;
    }

    public void setMASV(String MASV) {
        this.MASV = MASV;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String hoten) {
        Hoten = hoten;
    }

    public Date getNgaysinh() {
        return Ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        Ngaysinh = ngaysinh;
    }

    public String getQuequan() {
        return Quequan;
    }

    public void setQuequan(String quequan) {
        Quequan = quequan;
    }

    public String getGioitinh() {
        return Gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        Gioitinh = gioitinh;
    }

    @Override
    public String toString() {
        return "SINHVIEN{" +
                "MASV='" + MASV + '\'' +
                ", Hoten='" + Hoten + '\'' +
                ", Ngaysinh=" + Ngaysinh +
                ", Quequan='" + Quequan + '\'' +
                ", Gioitinh='" + Gioitinh + '\'' +
                '}';
    }
}
