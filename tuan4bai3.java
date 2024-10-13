import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n, gt;
        System.out.println("Nhap so nguyen duong can tinh giai thua: ");
        n = sc.nextInt();
        gt = 1;
        for(int i = 1; i <= n; i++) {
            gt *= i;
        }
        System.out.println("Giai thua cua " + n + " bang: " + gt);
    }
}
