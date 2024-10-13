import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, tong;

        System.out.println("Nhap gia tri n: ");
        n = sc.nextInt();

        tong = 0;
        for(int i = 1; i <=n; i++) {
            tong += i;
        }
        System.out.println("Tong cac so tu 1 den n la: " + tong);
    }
}