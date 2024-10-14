/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai3tuan5;
import java.util.Scanner;
/**
 *
 * @author My Le
 */
import java.util.Scanner;

public class Bai3Tuan5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so phan tu trong mang: ");
        int n = scanner.nextInt();
        int[] ds = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhap phan tu thu %d: ", i + 1);
            ds[i] = scanner.nextInt();
        }
        for (int i = 0; i < n - 1; i++) 
            for (int j = i + 1; j < n; j++) 
                if (ds[j] < ds[i]) 
                {
                    int tg = ds[i];
                    ds[i] = ds[j];
                    ds[j] = tg;
                }
        System.out.println("Day so sau khi da sap xep:");
        for (int i = 0; i < n; i++) {
            System.out.printf(" %d",ds[i]);
        }
    }
}
