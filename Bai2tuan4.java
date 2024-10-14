/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai2tuan4;
/**
 *
 * @author My Le
 */
public class Bai2tuan4 {
    public static void main(String[] args) { 
       for (int i = 1; i <= 9; i++) {
            System.out.println("BANG CUU CHUONG " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println(); // Dòng trống giữa các bảng
        }
    }
}
