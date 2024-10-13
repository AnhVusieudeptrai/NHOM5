import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n, m, kt;

        System.out.println("Nhap so can kiem tra: ");
        n = sc.nextInt();
        kt = n;
        m = 0;
        while (kt > 0) {
            m = m * 10 + kt % 10;
            kt = kt / 10;
        }
        if(m == n) {
            System.out.println("Do la so doi xung.");
        }else {
            System.out.println("Do khong phai la so doi xung.");
        }
    }
}
