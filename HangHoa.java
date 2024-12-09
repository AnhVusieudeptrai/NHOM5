/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quanli_ck;
/**
 *
 * @author OS
 */

public class HangHoa {
    String maHang, tenHang, hanSuDung;
    int soLuong;
    double giaBan;
    String danhGia;
    public HangHoa(String maHang, String tenHang, int soLuong, double giaBan, String hanSuDung, String danhGia) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.soLuong = soLuong;
        this.giaBan = giaBan;
        this.hanSuDung = hanSuDung;
        this.danhGia = danhGia;
    }

    public String getMaHang() {
        return maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public String getHanSuDung() {
        return hanSuDung;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public String getDanhGia() {
        return danhGia;
    }

 
    public String toString() {
        return "Mã hàng: " + maHang + ", Tên hàng: " + tenHang + ", Số lượng: " + soLuong +
                ", Giá bán: " + giaBan + ", Hạn sử dụng: " + hanSuDung + ", Đánh giá: " + danhGia;
    }
}