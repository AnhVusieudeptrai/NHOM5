package bai1;
import java.util.Scanner;
public class bai1 {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Nhap so bat ky ");
			int n = sc.nextInt();
			if (n == 0)
				System.out.printf("La so bang 0");
			else
				if (n < 0)
					System.out.printf("La so am");
				else
					System.out.printf("La so duong");
		}
		
	}
	
}
