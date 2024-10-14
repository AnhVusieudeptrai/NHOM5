/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI3;
import java.util.Scanner;
/**
 *
 * @author My Le
 */
public class taiKhoanNganHang {
    public String soTaiKhoan;
    public String chuTaiKhoan;
    public double soDu;
    public taiKhoanNganHang (String soTaiKhoan, String chuTaiKhoan, double soDu) {
        this.soTaiKhoan = soTaiKhoan;
        this.chuTaiKhoan = chuTaiKhoan;
        this.soDu = soDu;
    }
public void guiTien(double soTien)
{
    if (soTien > 0) {
                soDu =soDu+ soTien;
                System.out.println("Gui tien: " + soTien + ". So du hien tai: " + soDu + ".");
            } else {
                System.out.println("So tien gui phai lon hon 0.");
            }
}
public void rutTien(double soTien)
{
    if (soTien > 0 && soTien <= soDu) {
            soDu =soDu- soTien;
            System.out.println("Rut tien thanh cong: " + soTien + ". So du hien tai: " + soDu + ".");
        } else {
            System.out.println("Khong the rut tien. Kiem tra so du hoac so tien rut.");
        }
}
public void kiemTraSoDu() 
{
        System.out.println("So du tai khoan " + soTaiKhoan + " cua " + chuTaiKhoan + " la: " + soDu + ".");
    }
}
