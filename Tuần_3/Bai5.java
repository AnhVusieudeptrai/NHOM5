package Tuần_3;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        int a, b, c;

        System.out.println("Nhap 3 so can kiem tra:");
        a = nhap.nextInt();
        b = nhap.nextInt();
        c = nhap.nextInt();

        if ( (a+b) > c && (a+c) > b && (b+c) > a ){
            if (a == b && b == c && c == a){
                System.out.printf("Do la tam giac deu.");
            }else{
                if (a == b || a == c || b == c){
                    if (a*a+b*b == c*c || b*b+c*c == a*a || c*c+a*a == b*b){
                        System.out.printf("Do la tam giac vuong can.");
                    }else{
                        System.out.printf("Do la tam giac can.");
                    }
                }else{
                    if(a*a+b*b == c*c || b*b+c*c == a*a || c*c+a*a == b*b){
                        System.out.printf("Do la tam giac vuong.");
                    }else{
                        System.out.printf("Do la tam giac thuong");
                    }
                }
            }
        }else{
            System.out.printf("Cac canh do khong phai la cac canh cua 1 tam giac.");
        }
        nhap.close();
    }
}
