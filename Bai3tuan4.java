/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai3tuan4;
import java.util.Scanner;
/**
 *
 * @author My Le
 */
public class Bai3tuan4 {

    public static void main(String[] args) {
       Scanner scanner= new Scanner(System.in);
       System.out.println("Nhap vao so nguyen duong n: ");
       int n=scanner.nextInt();
       int giaithua=1;
       for(int i=1;i<=n;i++)
           giaithua=giaithua*i;
       System.out.println("Tong n giai thua la: "+giaithua);
    }
}
