/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai4;
import java.util.Scanner;
/**
 *
 * @author OS
 */
public class taiKhoanNganHang {
     private String soTaiKhoan;
    private String chuTaiKhoan;
    private double soDu;
    private String matKhau;

    public taiKhoanNganHang(String soTaiKhoan, String chuTaiKhoan, double soDu, String matKhau) {
        this.soTaiKhoan = soTaiKhoan;
        this.chuTaiKhoan = chuTaiKhoan;
        this.soDu = soDu;
        this.matKhau= matKhau;
    }

    public taiKhoanNganHang(String soTaiKhoan, String chuTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
        this.chuTaiKhoan = chuTaiKhoan;
      
    }

    public String getSoTaiKhoan() {
        return soTaiKhoan;
    }

    public void setSoTaiKhoan(String soTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
    }

    public String getChuTaiKhoan() {
        return chuTaiKhoan;
    }

    public void setChuTaiKhoan(String chuTaiKhoan) {
        this.chuTaiKhoan = chuTaiKhoan;
    }

    public double getSoDu() {
        return soDu;
    }

    public void setSoDu(double soDu) {
        this.soDu = soDu;
    }

    public String getmatKhau() {
        return matKhau;
    }

    public void setmatKhau(String matKhau) {
        this.matKhau = matKhau;
    }
    

    public void guiTien(double soTien) {
        if (soTien > 0) {
            soDu += soTien;
            System.out.println("Gui tien: " + soTien + ". \nSo du hien tai: " + soDu + ".");
        } else {
            System.out.println("So tien gui phai lon hon 0.");
        }
    }

    public void rutTien(double soTien) {
        if (soTien > 0 && soTien <= soDu) {
            soDu -= soTien;
            System.out.println("Rut tien thanh cong: " + soTien + ". \nSo du hien tai: " + soDu + ".");
        } else {
            System.out.println("Khong the rut tien. Kiem tra so du hoac so tien rut.");
        }
    }

    public void kiemTraSoDu() {
        System.out.println("So du tai khoan " + soTaiKhoan + " cua " + chuTaiKhoan + " la: " + soDu + ".");
    }
    
    public void doiMatKhau(String matKhauHienTai,String matKhauMoi){
        Scanner sc=new Scanner(System.in);
        System.out.printf("Nhap mat khau hien tai:");
        this.matKhau=sc.nextLine();
            if(this.matKhau.equals(matKhauHienTai)){
                System.out.println("Nhap mat khau moi:");         
                this.matKhau=sc.nextLine();
                    System.out.println("Doi mat khau thanh cong!");
            }else
                    System.out.println("Mat khau hien tai khong chinh xac!");
    }
  
  }


