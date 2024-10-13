package Tuần_3;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap so diem trung binh cua ban: ");
        double a = nhap.nextDouble();
        
        if(a >= 8.5){
            System.out.println("Ban gioi lam day");
        }else{
            if (a >= 7.5) {
                System.out.println("Ban kha lam day");
            }else{
                if(a >= 5.5) {
                    System.out.println("Ban trung binh lam day");
                }else{
                    System.out.println("Ban yeu lam day");
                }
            }
        }
        nhap.close();
        
    }
}
