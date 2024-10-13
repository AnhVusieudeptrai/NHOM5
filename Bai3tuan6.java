/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai3tuan6;
import java.util.Scanner;
/**
 *
 * @author OS
 */
public class Bai3tuan6 {

 
    private String soTaiKhoan;
    private String chuTaiKhoan;
    private double soDu;

    public Bai3tuan6(String soTaiKhoan, String chuTaiKhoan, double soDu) {
        this.soTaiKhoan = soTaiKhoan;
        this.chuTaiKhoan = chuTaiKhoan;
        this.soDu = soDu;
    }

    public void guiTien(double soTien) {
        if (soTien > 0) {
            soDu += soTien;
            System.out.println("Gui tien: " + soTien + ". So du hien tai: " + soDu + ".");
        } else {
            System.out.println("So tien gui phai lon hon 0.");
        }
    }

    public void rutTien(double soTien) {
        if (soTien > 0 && soTien <= soDu) {
            soDu -= soTien;
            System.out.println("Rut tien thanh cong: " + soTien + ". So du hien tai: " + soDu + ".");
        } else {
            System.out.println("Khong the rut tien. Kiem tra so du hoac so tien rut.");
        }
    }

    public void kiemTraSoDu() {
        System.out.println("So du tai khoan " + soTaiKhoan + " cua " + chuTaiKhoan + " la: " + soDu + ".");
    }

    public static void main(String[] args) {
        Bai3tuan6 taiKhoan = new Bai3tuan6("0368368325", "HUYNH VIET ANH VU", 100);
        taiKhoan.kiemTraSoDu();
        taiKhoan.guiTien(50);
        taiKhoan.rutTien(30);
        taiKhoan.kiemTraSoDu();
    }
  }
