package Tuần_3;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        double a, b, c;
        
        System.out.println("Nhap 3 so can kiem tra:");
        a = nhap.nextDouble();
        b = nhap.nextDouble();
        c = nhap.nextDouble();

        if (a > b) {
            if (a > c) {
                System.out.printf("a la so lon nhat, a = %f", a);
            }else{
                if (a == c) {
                    System.out.printf("a va c la so lon nhat, a = c = %f", a);
                }else{
                    System.out.printf("c la so lon nhat, c = %f", c);
                }
            }
        }else{
            if (b > c) {
                System.out.printf("b la so lon nhat, b = %f", b);
            }else{
                if (b == c) {
                    System.out.printf("b va c la so lon nhat, b = c = %f", b);
                }else{
                    System.out.printf("c la so lon nhat, c = %f", c);
                }
            }
        }
        nhap.close();
    }
}
