package Bai2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        sc.nextLine();
        Student[] students = new Student[n];

        for(int i = 0; i < n; i++) {
            students[i] = new Student();
            System.out.printf("Nhap thong tin sinh vien thu %d: \n", i+1);
            students[i].setInfor();
        }

        System.out.println("-----Danh sach sinh vien-----");
        for (int i = 0; i < students.length; i++) {
            System.out.println("------------------------------");
            students[i].getStudent();
        }
        sc.close();
        
    }
}
