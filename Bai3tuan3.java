/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai3tuan3;


    import java.util.Scanner;
public class Bai3tuan3 {





    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap he so a= ");
        float a = scanner.nextFloat();
        System.out.print("Nhap he so b= ");
        float b = scanner.nextFloat();
        System.out.print("Nhap he so c= ");
        float c = scanner.nextFloat();
        PTB2(a, b, c);
    }

    public static void PTB2(float a, float b, float c) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh vo nghiem");
            } else {
                System.out.println("Phuong trinh co 1 nghiem x=" + (-c / b));
            }
        } else {
            float delta = b * b - 4 * a * c;
            float x1, x2;
            if (delta > 0) {
                x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
                x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
                System.out.println("Phuong trinh co hai nghiem\nx1=" + x1 + "\nx2=" + x2);
            } else if (delta == 0) {
                x1 = (float) -(b / (2 * a));
                System.out.println("Phuong trinh co nghiem kep x1=x2=" + x1);
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        }
    }
}
