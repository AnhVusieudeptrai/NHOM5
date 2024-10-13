package bai2;
import java.util.Scanner;
public class bai2 {
	public static void main (String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Nhap ten ");
			String ten = sc.nextLine();
			System.out.println("Nhap tuoi ");
			int tuoi = sc.nextInt();
			System.out.println("Nhap chieu cao ");
			double cc = sc.nextDouble();
			System.out.println("Ten la  "+ ten);
			System.out.println("Tuoi la  "+ tuoi);
			System.out.println("chieu cao la " +cc );	
			System.out.println("Co Thich lap trinh hay khong?");
	        boolean co = true; 
	        if (co) 
	            System.out.println("Co thich lap trinh");
	        else 
	            System.out.println("Khong thich lap trinh");
		}
				
	}
}
