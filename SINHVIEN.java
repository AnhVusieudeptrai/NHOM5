/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI2;

import java.util.Scanner;

/**
 *
 * @author My Le
 */
public class SINHVIEN {
    public String MSV; 
    public String Ten;
    public String ngSinh;
    public double DTB;
    public double getDTB() {
        return DTB;
    }
    public void setDTB(double DTB) {
        this.DTB = DTB;
    }
 public void Nhap()
 {
     Scanner sc= new Scanner(System.in);
     System.out.print("Nhap ma sinh vien: ");
     MSV = sc.nextLine(); 
     System.out.print("Nhap ho ten sinh vien: ");
     Ten = sc.nextLine(); 
     System.out.print("Nhap ngay sinh (dd/mm/yyyy): ");
     ngSinh = sc.nextLine();
     System.out.print("Nhap diem trung binh: ");
     DTB = sc.nextDouble(); 
     sc.nextLine(); 
 }
 public void Xuat()
{
    System.out.println("Ma sinh vien: " + MSV);
    System.out.println("Ho ten sinh vien: " + Ten);
    System.out.println("Ngay sinh: " + ngSinh);
    System.out.println("Diem trung binh: " + DTB);
}
 
}