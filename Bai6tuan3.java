/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai6tuan3;

import java.util.Scanner;
public class Bai6tuan3 {
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so thu nhat: ");
        double num1 = scanner.nextDouble();

        System.out.print("Nhap so thu hai: ");
        double num2 = scanner.nextDouble();

        System.out.print("Chon phep tinh (+, -, *, /): ");
        char Tinh = scanner.next().charAt(0);

        double result;

        switch (Tinh) {
            case '+':
                result = num1 + num2;
                System.out.println("Ket qua: " + num1 + " + " + num2 + " = " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Ket qua: " + num1 + " - " + num2 + " = " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Ket qua: " + num1 + " * " + num2 + " = " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Ket qua: " + num1 + " / " + num2 + " = " + result);
                } else {
                    System.out.println("Khong the chia cho 0.");
                }
                break;
            default:
                System.out.println("Phep toan khong hop le.");
                break;
        }
    }
}

