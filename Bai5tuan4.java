/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.bai5tuan4;
import java.util.Scanner;
public class Bai5tuan4 {
    private int a;
    private int b;
    public Bai5tuan4()
    {
        this.a = 0;
        this.b = 0;
    }
    public Bai5tuan4(int a, int b)
    {
        this.a = a;
        this.b = b;
    }
    public void Nhap()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap a: ");
        this.a= sc.nextInt();
        System.out.println("Nhap b: ");
        this.b= sc.nextInt();
    }
    public void Xuat()
    {
        System.out.println("a: "+this.a);
        System.out.println("b: "+this.b);
        System.out.println("UCLN: " +this.UCLN());
        System.out.println("BCNN: " +this.BCNN());
    }
    public int UCLN() {
        int x = a;
        int y = b;
        while (x != y) {
            if (x > y) {
                x = x - y;
            } else {
                y = y - x;
            }
        }
        return x; 
    }

    public int BCNN() {
        return (a * b) / UCLN();
    }
    public static void main(String[] args) {
         Bai5tuan4 TG1=new Bai5tuan4();
                TG1.Nhap();
                TG1.Xuat();
    }
}
