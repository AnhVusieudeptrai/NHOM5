/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai2tuan3;
import java.util.Scanner;
public class Bai2tuan3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap diem trung binh cua hoc sinh: ");
        float diemTrungBinh = scanner.nextFloat();
        scanner.close();
        if (diemTrungBinh >= 8.0) {
            System.out.println("Xep loai: Gioi");
        } else if (diemTrungBinh >= 6.5) {
            System.out.println("Xep loai: Kha");
        } else if (diemTrungBinh >= 5.0) {
            System.out.println("Xep loai: Trung binh");
        } else {
            System.out.println("Xep loai: Yeu");
        }
        
    }
}

