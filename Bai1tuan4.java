/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai1tuan4;
import java.util.Scanner;
/**
 *
 * @author My Le
 */
public class Bai1tuan4 {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("nhap vao n so: ");
        int n= scanner.nextInt();
        int tong=0;
        for(int i=1;i<=n;i++)
        {
            tong=tong+i;
        }
        System.out.println("tong n so la: "+tong);
    }
}
