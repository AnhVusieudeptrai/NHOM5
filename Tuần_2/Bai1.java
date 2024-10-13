package Tuần_2;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhập tên của bạn: ");
        String ten = nhap.nextLine();
        
        System.out.println("Hello " + ten);
        nhap.close();
    }
}
