/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai2tuan5;
import java.util.Scanner;
public class Bai2Tuan5 {

    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
        System.out.print("Nhap so phan tu trong mang:");
        int n=scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhap phan tu thu %d: ", i+1 );
            array[i] = scanner.nextInt(); 
        }
    for(int i=0;i<n/2;i++){
    int tam = array[i];
    array[i] = array[n-1-i];
    array[n-1-i] = tam;
    }
    System.out.println("Mang sau khi dao nguoc:");
    for(int i=0;i<n;i++){
        System.out.println(array[i]+" ");
    }
}
}