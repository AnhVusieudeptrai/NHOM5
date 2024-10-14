/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai4tuan4;
import java.util.Scanner;

/**
 *
 * @author My Le
 */
import java.util.Scanner;

public class Bai4tuan4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so can kiem tra: ");
        int so = scanner.nextInt();
        int dem=0;
        if (so <= 1) 
            System.out.println(so + " khong phai la so nguyen to.");
        for (int i = 2; i <= Math.sqrt(so); i++) 
            if (so % i == 0)
                dem++;
        if (dem==0)
            System.out.println(so + " la so nguyen to.");
        else 
            System.out.println(so + " khong phai la so nguyen to.");
    }
}

