/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai4;
import java.util.Scanner;
/**
 *
 * @author My Le
 */
public class Bai4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Nhập vào số tiền gửi
        System.out.print("nhap so tien gui (VND): ");
        double tienbd = scanner.nextDouble();
        // Nhập vào lãi suất hàng năm
        System.out.print("nhap lai suat hang nam( phan tram): ");
        double lai = scanner.nextDouble();
        // Nhập vào số tháng gửi
        System.out.print("nhap so thang gui: ");
        int thang = scanner.nextInt();
        // Tính lãi suất hàng tháng từ lãi suất hàng năm
        double laihangthang = (lai / 100) / 12;
        double tienlai = tienbd*laihangthang*thang;
        // Tính số tiền lãi và số tiền gốc cuối kỳ
        double tiensau= tienbd+tienlai;
        // In kết quả ra màn hình
        System.out.printf("so tien goc cuoi ki: %.2f VND\n", tiensau);
        System.out.printf("so tien lai: %.2f VND\n", tienlai);
        // Đóng Scanner
        scanner.close();
    }
}
