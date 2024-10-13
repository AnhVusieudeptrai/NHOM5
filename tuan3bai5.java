package bai5;
import java.util.Scanner;
public class bai5 {
	public static void main(String[] args) {
		try(Scanner sc= new Scanner(System.in)){
			System.out.println("Nhap 3 canh tam giac");
			int a =sc.nextInt();
			int b =sc.nextInt();
			int c =sc.nextInt();
			if (a+b>c && b+c>a && a+c >b) {
				System.out.println("\n Do la 1 tam giac");
				if (a==b && a==c && b==c)
					System.out.println("\n Do la 1 tam giac deu");
				else
					if (a==b || b==c || c==a)
						System.out.println("\n Do la 1 tam giac can");
					else
						if ( a*a+b*b==c*c || a*a+c*c==b*b || b*b+c*c==a*a)
							System.out.println("\n Do la 1 tam giac vuong");
						else
							System.out.println("\n Do la 1 tam giac thuong");
			}
				
			else
				System.out.println("\n Khong phai la 1 tam giac");
		}
	}

}
