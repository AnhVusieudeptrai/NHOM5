/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai1tuan3;


  import java.util.Scanner;
public class Bai1tuan3 {

    public static void main(String[] args) {
       



   
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so: ");
        int so = scanner.nextInt();
        scanner.close();
        if (so > 0) {
            System.out.println("" + so + " la so duong");
        } else if (so < 0) {
            System.out.println("" + so + " la so am");
        } else {
            System.out.println("La so 0");
        }

    }
}

    
