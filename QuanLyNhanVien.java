/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quanli_ck;
import java.io.*;
import java.util.*;
/**
 *
 * @author OS
 */
public class QuanLyNhanVien implements IQuanLyNhanVien {
    private HashMap<String, NhanVien> danhSachNhanVien;

    public QuanLyNhanVien() {
        danhSachNhanVien = new HashMap<>();
    }

    @Override
public void themNhanVien(String maNV, String tenNV, double luongCoBan, double luongThuong, double giaTriRieng, String loai) {
    if (danhSachNhanVien.containsKey(maNV)) {
        System.out.println("Nhân viên với mã " + maNV + " đã tồn tại!");
        return;
    }

    NhanVien nhanVien;
    if (loai.equalsIgnoreCase("BANHANG")) {
        nhanVien = new NhanVienBanHang(maNV, tenNV, luongCoBan, luongThuong, giaTriRieng);
    } else if (loai.equalsIgnoreCase("THUNGAN")) {
        nhanVien = new NhanVienThuNgan(maNV, tenNV, luongCoBan, luongThuong, giaTriRieng);
    } else {
        System.out.println("Loại nhân viên không hợp lệ! Vui lòng nhập BANHANG hoặc THUNGAN.");
        return;
    }

    danhSachNhanVien.put(maNV, nhanVien);
    System.out.println("Thêm nhân viên thành công!");
}
    @Override
    public void xoaNhanVien(String maNV) {
        if (danhSachNhanVien.containsKey(maNV)) {
            danhSachNhanVien.remove(maNV);
            System.out.println("Đã xóa nhân viên với mã: " + maNV);
        } else {
            System.out.println("Không tìm thấy nhân viên với mã: " + maNV);
        }
    }

    @Override
public void capNhatNhanVien(String maNV, String tenNV, double luongCoBan, double luongThuong, String loai, double giaTriRieng) {
    if (danhSachNhanVien.containsKey(maNV)) {
        NhanVien nhanVien;
        if (loai.equalsIgnoreCase("BANHANG")) {
            nhanVien = new NhanVienBanHang(maNV, tenNV, luongCoBan, luongThuong, giaTriRieng);
        } else if (loai.equalsIgnoreCase("THUNGAN")) {
            nhanVien = new NhanVienThuNgan(maNV, tenNV, luongCoBan, luongThuong, giaTriRieng);
        } else {
            System.out.println("Loại nhân viên không hợp lệ!");
            return;
        }
        danhSachNhanVien.put(maNV, nhanVien);
        System.out.println("Cập nhật nhân viên thành công!");
    } else {
        System.out.println("Nhân viên với mã " + maNV + " không tồn tại.");
    }
}

    @Override
    public void hienThiNhanVien() {
        for (NhanVien nhanVien : danhSachNhanVien.values()) {
            System.out.println(nhanVien);
        }
    }

    @Override
    public void timKiemNhanVien(String maNV, String tenNV) {
        for (NhanVien nhanVien : danhSachNhanVien.values()) {
            if (nhanVien.maNV.contains(maNV) || nhanVien.tenNV.contains(tenNV)) {
                System.out.println(nhanVien);
            }
        }
    }
@Override
public void luuFile() {
    try (FileWriter fw = new FileWriter("D:\\nhanvien.txt")) {
        StringBuilder infor = new StringBuilder();
        for (NhanVien nhanVien : danhSachNhanVien.values()) {
            String type = (nhanVien instanceof NhanVienBanHang) ? "BANHANG" : "THUNGAN";
String infoNhanVien = nhanVien.getMaNV() + "," + nhanVien.getTenNV() + ","
                    + nhanVien.getLuongCoBan() + "," + nhanVien.getLuongThuong() + "," + type;

            if (nhanVien instanceof NhanVienBanHang) {
                infoNhanVien += "," + ((NhanVienBanHang) nhanVien).getDoanhThu();
            } else if (nhanVien instanceof NhanVienThuNgan) {
                infoNhanVien += "," + ((NhanVienThuNgan) nhanVien).getSoGioLam();
            }

            infor.append(infoNhanVien).append("\n");
        }
        fw.write(infor.toString());
        System.out.println("Dữ liệu đã được ghi vào file.");
    } catch (IOException e) {
        e.printStackTrace();
    }
}
@Override
public void docFile() {
    try (BufferedReader br = new BufferedReader(new FileReader("D:\\nhanvien.txt"))) {
        String infor;
        while ((infor = br.readLine()) != null) {
            String[] arrayInfor = infor.split(","); // Split the line by commas
            if (arrayInfor.length >= 5) {
                String maNV = arrayInfor[0].trim();
                String tenNV = arrayInfor[1].trim();
                double luongCoBan = Double.parseDouble(arrayInfor[2].trim());
                double luongThuong = Double.parseDouble(arrayInfor[3].trim());
                String type = arrayInfor[4].trim();

                if (type.equals("BANHANG") && arrayInfor.length == 6) {
                    double doanhThu = Double.parseDouble(arrayInfor[5].trim());
                    NhanVienBanHang nhanVien = new NhanVienBanHang(maNV, tenNV, luongCoBan, luongThuong, doanhThu);
                    danhSachNhanVien.put(maNV, nhanVien);
                } else if (type.equals("THUNGAN") && arrayInfor.length == 6) {
                    double soGioLam = Double.parseDouble(arrayInfor[5].trim());
                    NhanVienThuNgan nhanVien = new NhanVienThuNgan(maNV, tenNV, luongCoBan, luongThuong, soGioLam);
                    danhSachNhanVien.put(maNV, nhanVien);
                }

                // Display employee information
                System.out.println("maNV: " + maNV + ", tenNV: " + tenNV +
                        ", luongCoBan: " + luongCoBan + ", luongThuong: " + luongThuong + ", type: " + type);
            }
        }
        System.out.println("Dữ liệu đã được đọc từ file.");
    } catch (IOException e) {
        System.out.println("Lỗi khi đọc dữ liệu: " + e.getMessage());
    }
}
}