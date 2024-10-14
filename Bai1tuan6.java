/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai1tuan6;
import java.util.Scanner;
public class Bai1tuan6 {
    private double C;
    private double D;
    public Bai1tuan6(){}
    public Bai1tuan6(double C, double D) {
        this.C = C;
        this.D = D;
    }
    public void Nhap1()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap chieu dai: ");
        this.C= sc.nextDouble();
        System.out.println("Nhap chieu rong: ");
        this.D= sc.nextDouble();
    }
    public void Xuat1()
    {
        System.out.println("chieu dai : "+this.C);
        System.out.println("chieu rong: "+this.D);
        System.out.println("Chu vi CHU NHAT: " +this.tinhChuVi1());
        System.out.println("Dien tich CHU NHAT: " +this.tinhDienTich1());
    }
    public double tinhChuVi1(){
        return 2*(this.C+ this.D);
    }
    public double tinhDienTich1(){
        return this.C*this.D;
    }
    public static void main(String[] args) {
       Bai1tuan6 MY= new Bai1tuan6(5.0,4.0);
       MY.Xuat1();
    }
}