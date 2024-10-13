/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai4tuan3;

import java.util.Scanner;
public class Bai4tuan3 {

    public static void main(String[] args) {
   


        Scanner scanner = new Scanner(System.in);

        // Nhập ba số 
        System.out.print("Nhap a: ");
        int a = scanner.nextInt();
        System.out.print("Nhap so b: ");
        int b = scanner.nextInt();
        System.out.print("Nhap so c: ");
        int c = scanner.nextInt();

        // Tìm số nhỏ nhất
        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }

        // In ra số nhỏ nhất
        System.out.println("So nho nhat la: " + min);
    }
}

