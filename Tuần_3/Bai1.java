package Tuần_3;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap so can kiem tra: ");
        int a = nhap.nextInt();
        
        if(a > 0){
            System.out.println("So do la so duong");
        }else{
            if (a == 0) {
                System.out.println("So do la so 0");
            }else{
                System.out.println("So do la so am");
            }
        }
        nhap.close();
    }
}
