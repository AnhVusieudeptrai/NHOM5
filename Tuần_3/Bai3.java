package Tuần_3;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        double a, b, c;
        double d, x1, x2, x;
        
        System.out.println("Nhập giá trị hệ số phương trình bậc 2:");
        a = nhap.nextDouble();
        b = nhap.nextDouble();
        c = nhap.nextDouble();

        if (a != 0) {
            d = b*b - 4*a*c;
            if (d > 0) {
                x1 = (-b - Math.sqrt(d)) / (2*a);
                x2 = (-b + Math.sqrt(d)) / (2*a);
                System.out.printf("Phương trình có 2 nghiệm:\nx1 = %f\nx2 = %f\n", x1, x2);
            } else if (d == 0) {
                x = -b / (2*a);
                System.out.printf("Phương trình có 1 nghiệm duy nhất:\nx = %f\n", x);
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        } else {
            if (b != 0) {
                x = -c/b;
                System.out.printf("Phương trình có 1 nghiệm duy nhất:\nx = %f\n", x);
            } else {
                if (c != 0) {
                    System.out.println("Phương trình vô nghiệm.");
                } else {
                    System.out.println("Phương trình vô số nghiệm.");
                }
            }
        }
        nhap.close();
    }
}
