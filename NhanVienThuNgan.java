/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quanli_ck;

/**
 *
 * @author OS
 */
public class NhanVienThuNgan extends NhanVien {
    double soGioLam; // Thêm thuộc tính riêng cho nhân viên thu ngân

    public NhanVienThuNgan(String maNV, String tenNV, double luongCoBan, double luongThuong, double soGioLam) {
        super(maNV, tenNV, luongCoBan, luongThuong);
        this.soGioLam = soGioLam;
    }

    @Override
    public double tinhLuong() {
        return luongCoBan + luongThuong + (soGioLam * 50); // Ví dụ: Thưởng 50k/giờ làm
    }

    public double getSoGioLam() {
        return soGioLam;
    }

    public void setSoGioLam(double soGioLam) {
        this.soGioLam = soGioLam;
    }

    public String toString() {
        return super.toString() + ", Số giờ làm: " + soGioLam;
    }
}
