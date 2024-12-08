/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI3;

/**
 *
 * @author My Le
 */
public class test {
    public static void main(String args[])
    {
        taiKhoanNganHang taiKhoan = new taiKhoanNganHang("123456789", "Tran Thi My", 1000);
        taiKhoanNganHang taiKhoan1= new taiKhoanNganHang("123","my lee");
        System.out.println("ctk: "+taiKhoan.getChuTaiKhoan());
        taiKhoan.setChuTaiKhoan("MY LE");
    }
}
