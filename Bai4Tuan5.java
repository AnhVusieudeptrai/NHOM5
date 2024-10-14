/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai4tuan5;
import java.util.Scanner;
public class Bai4Tuan5 {
    public static void main(String[] args) {
   
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu cua mang:");
        int n = scanner.nextInt();
        int[] ds = new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.printf("Phan tu thu %d: ",i+1);
            ds[i]=scanner.nextInt();
        }
        int max = ds[0];
        int soLan = 1;

        for (int i = 0; i < n; i++) {
            int dem = 1; // Đếm số lần xuất hiện của ds[i]
            for (int j = i + 1; j < n; j++) {
                if (ds[i] == ds[j]) {
                    dem++;
                }
            }
            if (dem > soLan) {
                soLan = dem;
                max = ds[i];
            }
        }
        System.out.println("Phan tu xuat hien nhieu nhat la: " + max + " (Xuat hien " + soLan + " lan)");
    }
}