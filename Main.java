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
public class Main {
    public static void main(String[] args) {
        taiKhoanNganHang tk = new taiKhoanNganHang("0368368325","Huynh Viet Anh Vu",100,"2625");
        Bai3.taiKhoanNganHang tk1= new Bai3.taiKhoanNganHang("0368368325","Huynh Viet Anh Vu");
        System.out.println("So tai khoan: "+tk.getSoTaiKhoan());
        tk.setSoTaiKhoan("0368368325");
        System.out.println("Chu tai khoan: "+tk.getChuTaiKhoan());
        tk.setChuTaiKhoan("Huynh Viet Anh Vu");
        //Kiểm tra số dư
        tk.kiemTraSoDu();
        
        //Gửi tiền và kiếm tra lại số dư
        tk.guiTien(50);
        
        //Rút tiền và kiếm tra lại số dư
        tk.rutTien(90);
        
        //Đổi mật khẩu
        tk.doiMatKhau("2625"," ");
        
        
    }
}
