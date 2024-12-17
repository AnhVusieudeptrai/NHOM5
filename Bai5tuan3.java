/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai5tuan3;

import java.util.Scanner;
public class Bai5tuan3 {

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap canh a: ");
        double a = scanner.nextDouble();

        System.out.print("Nhap canh b: ");
        double b = scanner.nextDouble();

        System.out.print("Nhap canh c: ");
        double c = scanner.nextDouble();
//Gọi hàm
        if (Ktra(a, b, c)) {
            System.out.println("Ba canh nay tao thanh mot tam giac");
            if (TGDEU(a, b, c)) {
                System.out.println("Day la tam giac deu.");
            } else if (TGCAN(a, b, c)) {
                System.out.println("Day la tam giac can.");
            } else if (TGVUONG(a, b, c)) {
                System.out.println("Day la tam giac vuong.");
            } else {
                System.out.println("Day la tam giac thuong.");
            }
        } else {
            System.out.println("Ba canh nay khong tao thanh mot tam giac");
        }
    }

    public static boolean Ktra(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    public static boolean TGDEU(double a, double b, double c) {
        return (a == b) && (b == c);
    }

    public static boolean TGCAN(double a, double b, double c) {
        return (a == b) || (b == c) || (a == c);
    }

    public static boolean TGVUONG(double a, double b, double c) {
        return (a * a + b * b == c * c) || (a * a + c * c == b * b) || (b * b + c * c == a * a);
    }
}
    

