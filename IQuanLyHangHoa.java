/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.quanli_ck;

/**
 *
 * @author OS
 */
public interface IQuanLyHangHoa {
    void themHangHoa(String maHang, String tenHang, int soLuong, double giaBan, String hanSuDung, String danhGia);
    void xoaHangHoa(String maHang);
    void capNhatHangHoa(String maHang, String tenHang, int soLuong, double giaBan, String hanSuDung, String danhGia);
    void hienThiHangHoa();
    void timKiemHangHoa(String maHang, String tenHang);
    void luuFile();
    void docFile();
}
