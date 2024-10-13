/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai1tuan6;
import java.util.Scanner;
/**
 *
 * @author OS
 */
public class Bai1tuan6 {
    Scanner sc=new Scanner(System.in);
    private double D;
    private double R;

    public Bai1tuan6(double D, double R) {
        this.D = D;
        this.R = R;
    }
    //Tinh chu vi
    public double ChuVi(){
        
        return (D+R)*2;
    }
    //Tinh dien tich
    public double DienTich(){
        return D*R;
    }
    //In ket qua ra man hinh
    public void Xuat(){
        System.out.println("Chu vi hinh chu nhat la: " +this.ChuVi());
        System.out.println("Dien tich hinh chu nhat la: " +this.DienTich());
    }

    public static void main(String[] args) {
    Bai1tuan6 hcn=new Bai1tuan6(7.0,3.0);
    hcn.Xuat();
    
    }
}