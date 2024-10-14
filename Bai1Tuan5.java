/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.bai1tuan5;
import java.util.Scanner;
public class Bai1Tuan5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so phan tu trong mang: ");
        int n = scanner.nextInt();
        int[] ds = new int[n]; 
        int tong = 0;
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhap phan tu thu %d: ", i+1 );
            ds[i] = scanner.nextInt(); 
        }
        for (int i = 0; i < n; i++)
            tong =tong+ds[i]; 
        System.out.println("tong cac phan tu trong mang la: " + tong);
    }
}

