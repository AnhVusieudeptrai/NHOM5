/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.quanli_ck;

/**
 *
 * @author OS
 */
public interface IQuanLyNhanVien {
    void themNhanVien(String maNV, String tenNV, double luongCoBan, double luongThuong, double giaTriThem, String loai);
    void xoaNhanVien(String maNV);
    void capNhatNhanVien(String maNV, String tenNV, double luongCoBan, double luongThuong, String loai, double giaTriRieng);
    void hienThiNhanVien();
    void timKiemNhanVien(String maNV, String tenNV);
    void luuFile();
    void docFile();
}