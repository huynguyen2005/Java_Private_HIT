package service;

import models.SINHVIEN;

import java.util.List;

public interface ISINHVIEN {
    public List<SINHVIEN> getAll();
    public SINHVIEN getById();
    public void updateByName();
}
