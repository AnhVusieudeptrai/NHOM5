package bai4;
import java.util.Scanner;
public class bai4 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)){
			System.out.println("Nhap 3 so ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c= sc.nextInt();
			if (a<b)
				if (a<c)
					System.out.println(a+" la so nho nhat");
				else
					System.out.println(b +" la so nho nhat ");
			else
				if(b<c)
					System.out.println(b+" la so nho nhat ");
				else
					System.out.println(c+ " la so nho nhat ");
		}
	}

}
