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
public class QuanLyHangHoa implements IQuanLyHangHoa {
    private HashMap<String, HangHoa> danhSachHangHoa;

    public QuanLyHangHoa() {
        danhSachHangHoa = new HashMap<>();
    }

    @Override
    public void themHangHoa(String maHang, String tenHang, int soLuong, double giaBan, String hanSuDung, String danhGia) {
        // Kiểm tra nếu sản phẩm đã có trong danh sách, gộp lại và tăng số lượng
        HangHoa hangHoa = danhSachHangHoa.get(maHang);
        if (hangHoa != null) {
            // Cập nhật số lượng nếu sản phẩm đã tồn tại
            hangHoa.soLuong += soLuong;
        } else {
            // Nếu chưa có sản phẩm, thêm mới
            danhSachHangHoa.put(maHang, new HangHoa(maHang, tenHang, soLuong, giaBan, hanSuDung, danhGia));
        }
    }

    @Override
    public void xoaHangHoa(String maHang) {
        
        danhSachHangHoa.remove(maHang);  // Xóa sản phẩm theo mã hàng
    }

    @Override
    public void capNhatHangHoa(String maHang, String tenHang, int soLuong, double giaBan, String hanSuDung, String danhGia) {
        HangHoa hangHoa = danhSachHangHoa.get(maHang);
        if (hangHoa != null) {
            // Cập nhật thông tin sản phẩm
            hangHoa.tenHang = tenHang;
            hangHoa.soLuong = soLuong;
            hangHoa.giaBan = giaBan;
            hangHoa.hanSuDung = hanSuDung;
            hangHoa.danhGia = danhGia;
        }
    }

    @Override
    public void hienThiHangHoa() {
        // Hiển thị danh sách hàng hóa
        for (HangHoa hangHoa : danhSachHangHoa.values()) {
            System.out.println(hangHoa);
        }
    }

    @Override
    public void timKiemHangHoa(String maHang, String tenHang) {
        // Tìm kiếm sản phẩm theo mã hoặc tên
        for (HangHoa hangHoa : danhSachHangHoa.values()) {
            if (hangHoa.maHang.contains(maHang) || hangHoa.tenHang.contains(tenHang)) {
                System.out.println(hangHoa);
            }
        }
    }
@Override
public void luuFile() {
    try (FileWriter fw = new FileWriter("D:\\hanghoa.txt")) {
        StringBuilder infor = new StringBuilder();
        for (HangHoa hangHoa : danhSachHangHoa.values()) {
            String infoProduct = hangHoa.getMaHang() + "," + hangHoa.getTenHang() + ","
                    + hangHoa.getSoLuong() + "," + hangHoa.getGiaBan() + "," + hangHoa.getHanSuDung() + ","
                    + hangHoa.getDanhGia();
            
            // Write the product information into the file
            infor.append(infoProduct).append("\n");
        }
        fw.write(infor.toString());
        System.out.println("Dữ liệu đã được ghi vào file.");
    } catch (IOException e) {
        e.printStackTrace();
    }
}
@Override
public void docFile() {
    try (BufferedReader br = new BufferedReader(new FileReader("D:\\hanghoa.txt"))) {
        String infor;
        while ((infor = br.readLine()) != null) {
            String[] arrayInfor = infor.split(","); // Split the line by commas
            if (arrayInfor.length == 6) {
                String maHang = arrayInfor[0].trim();
                String tenHang = arrayInfor[1].trim();
                int soLuong = Integer.parseInt(arrayInfor[2].trim());
                double giaBan = Double.parseDouble(arrayInfor[3].trim());
                String hanSuDung = arrayInfor[4].trim();
                String danhGia = arrayInfor[5].trim();

                // Create a HangHoa object and add it to the list
                HangHoa hangHoa = new HangHoa(maHang, tenHang, soLuong, giaBan, hanSuDung, danhGia);
                danhSachHangHoa.put(maHang, hangHoa);

                // Display product information
                System.out.println("maHang: " + maHang + ", tenHang: " + tenHang + 
                                   ", soLuong: " + soLuong + ", giaBan: " + giaBan + 
                                   ", hanSuDung: " + hanSuDung + ", danhGia: " + danhGia);
            }
        }
        System.out.println("Dữ liệu đã được đọc từ file.");
    } catch (IOException e) {
        System.out.println("Lỗi khi đọc dữ liệu: " + e.getMessage());
    }
}

}
