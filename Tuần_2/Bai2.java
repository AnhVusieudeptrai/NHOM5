package Tuần_2;

import java.util.Scanner;

public class Bai2 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
        boolean co = true; 
			
        System.out.println("Nhap ten ");
        String ten = sc.nextLine();
        System.out.println("Nhap tuoi ");
        int tuoi = sc.nextInt();
        System.out.println("Nhap chieu cao ");
        double cc = sc.nextDouble();
        System.out.println("Ten la  "+ ten);
        System.out.println("Tuoi la  "+ tuoi);
        System.out.println("chieu cao la " + cc );	
        System.out.println("Co Thich lap trinh hay khong?");

        if (co) 
            System.out.println("Co thich lap trinh");
        else 
            System.out.println("Khong thich lap trinh");
        sc.close();
	}
}
