/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quanli_ck;

/**
 *
 * @author OS
 */
public abstract class NhanVien {
    String maNV, tenNV;
    double luongCoBan, luongThuong;

    public NhanVien(String maNV, String tenNV, double luongCoBan, double luongThuong) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.luongCoBan = luongCoBan;
        this.luongThuong = luongThuong;
    }

    public abstract double tinhLuong() ;
  

    public String getMaNV() {
        return maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public double getLuongThuong() {
        return luongThuong;
    }

   


    public String toString() {
        return "Mã nhân viên: " + maNV + ", Tên: " + tenNV + ", Lương cơ bản: " + luongCoBan +
                ", Lương thưởng: " + luongThuong + ", Lương tổng: " + tinhLuong();
    }
}
