/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai2tuan6;

/**
 *
 * @author OS
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Bai2tuan6 {
        private String msv;
        private String ten;
        private String ngsinh;
        private double dtb;
        
    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgsinh() {
        return ngsinh;
    }

    public void setNgsinh(String ngsinh) {
        this.ngsinh = ngsinh;
    }

    public double getDtb() {
        return dtb;
    }

    public void setDtb(double dtb) {
        this.dtb = dtb;
    }
    public Bai2tuan6(){
        
    }
    public Bai2tuan6(String msv, String ten, String ngsinh, double dtb) {
        this.msv = msv;
        this.ten = ten;
        this.ngsinh = ngsinh;
        this.dtb = dtb;
    }
    //Nhap vao du lieu
        public void nhap(){
            Scanner sc=new Scanner(System.in);
            System.out.print("Nhap ma sinh vien: ");
            this.msv=sc.nextLine();
            System.out.print("Nhap ten sinh vien: ");
            this.ten=sc.nextLine();
            System.out.print("Nhap ngay sinh sinh vien(dd/MM/yyyy):");
            this.ngsinh=sc.nextLine();
            System.out.print("Nhap diem trung binh sinh vien: ");
            this.dtb=sc.nextDouble();
            sc.nextLine();
        
        }
        //In ra man hinh
        public void xuat(){
            System.out.println("Ma sinh vien: "+this.msv);
            System.out.println("Ten sinh vien: "+this.ten);
            System.out.println("Ngay sinh sinh vien: "+this.ngsinh);
            System.out.println("Diem trung binh sinh vien: "+this.dtb);
        }
        
    public static void main(String[] args) {
        //Danh sach sinh vien duoc luu lai
         ArrayList<Bai2tuan6> DS = new ArrayList<>();
         
     //Nhap bao nhieu sinh vien
     Scanner sc=new Scanner(System.in);
     System.out.printf("Nhap so luong sinh vien: ");
     int soluong = sc.nextInt();
     sc.nextLine();
     
    
    
     //Vong lap cho so sinh vien
     for(int i=0;i<soluong;i++){
            Bai2tuan6 sv = new Bai2tuan6();
            System.out.println("Nhap sinh vien thu " + (i + 1) + ":");
            sv.nhap();
            DS.add(sv);
  
     }
      //In thong tin sinh vien sau khi nhap
     System.out.printf("\nDanh sach sinh vien: ");
     for(Bai2tuan6 sv : DS){
         sv.xuat();
     }
     
      // Sap xep theo diem trung binh giam dan
        Collections.sort(DS, new Comparator<Bai2tuan6>() {
            @Override
            public int compare(Bai2tuan6 sv1, Bai2tuan6 sv2) {
                return Double.compare(sv2.getDtb(), sv1.getDtb());
            }
        });

        // In thong tin sinh vien sau khi sap xep
        System.out.println("Danh sach sinh vien sau khi sap xep theo diem trung binh giam dan:");
        for (Bai2tuan6 sv : DS) {
            sv.xuat();
        }


         
     
    }
}
