import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, count;
        count = 0;
        System.out.println("Nhap so nguyen can kiem tra: ");
        n = sc.nextInt();
        for(int i = 2; i <= n / 2; i++) {
            if( n % i == 0) {
                System.out.println("Do khong phai so nguyen to.");
                return;
            }
            count++;
        }
        if(count > 0) {
            System.out.println("Do la so nguyen to.");
        }
    
    }   
}
