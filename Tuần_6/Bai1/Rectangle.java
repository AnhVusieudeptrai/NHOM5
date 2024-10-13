package Bai1;

import java.util.Scanner;

public class Rectangle{
    public double length;
    public double width;
    Scanner sc = new Scanner(System.in);

    public void setSize() {
        System.out.println("Nhap gia tri chieu dai: ");
        this.length = sc.nextDouble();
        System.out.println("Nhap gia tri chieu rong: ");
        this.width = sc.nextDouble();
    }

    public void setLength(double length){
        this.length = length;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double acreage() {
        return length * width;
    }

    public double perimeter() {
        return 2 * (length + width);
    }
} 
    
