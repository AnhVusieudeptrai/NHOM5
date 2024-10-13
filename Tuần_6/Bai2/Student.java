package Bai2;

import java.util.Scanner;

class Student {
    Scanner sc = new Scanner(System.in);
    public int msv;
    public double dtb;
    public String ten;
    public String ngaysinh;

    
    public void setInfor() {
        System.out.printf("Nhap ma sinh vien: ");
        this.msv = sc.nextInt();
        sc.nextLine();
        System.out.printf("Nhap ho ten sinh vien: ");
        this.ten = sc.nextLine();
        System.out.printf("Nhap ngay sinh sinh vien: ");
        this.ngaysinh = sc.nextLine();
        System.out.printf("Nhap diem trung binh sinh vien: ");
        this.dtb = sc.nextDouble();
        System.out.printf("\n");
    }

    public void setNgaySinh() {
        System.out.println("Nhap ngay/thang/nam sinh");
        this.ngaysinh = sc.nextLine();
    }

    public void setName(){
        System.out.println("Nhap ho ten sinh vien");
        this.ten = sc.nextLine();
    }

    public void setMaSinhVien(){
        System.out.println("Nhap ma sinh vien");
        this.msv = sc.nextInt();
    }

    public void Sort() {
        
    }

    public void getStudent() {
        System.out.println("Msv: " + msv);
        System.out.println("Ten sinh vien: " + ten);
        System.out.println("Ngay sinh: " + ngaysinh);
        System.out.println("Diem trung binh " + dtb);
    }
}
