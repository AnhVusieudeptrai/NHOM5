package bai6;
import java.util.Scanner;
public class bai6 {
	public static void main(String[] args) {
		try(Scanner sc= new Scanner(System.in)){
			System.out.println("Nhap phep tinh ban muon dung");
			String a =sc.nextLine();
			switch(a) {
			case "+":System.out.println("Dau cong");break;
			case "-":System.out.println("Dau tru");break;
			case "*":System.out.println("Dau nhan");break;
			case "/":System.out.println("Dau chia");break;
			}
		}
	}
}
