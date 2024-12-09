/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quanli_ck;

/**
 *
 * @author OS
 */
public class NhanVienBanHang extends NhanVien {
    double doanhThu; // Thêm thuộc tính riêng cho nhân viên bán hàng

    public NhanVienBanHang(String maNV, String tenNV, double luongCoBan, double luongThuong, double doanhThu) {
        super(maNV, tenNV, luongCoBan, luongThuong);
        this.doanhThu = doanhThu;
    }

    @Override
    public double tinhLuong() {
        return luongCoBan + luongThuong + (doanhThu * 0.1); // Ví dụ: Thưởng 10% doanh thu
    }

    public double getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(double doanhThu) {
        this.doanhThu = doanhThu;
    }

   
    public String toString() {
        return super.toString() + ", Doanh thu: " + doanhThu;
    }
}
