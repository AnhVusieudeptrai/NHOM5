package bai3;
import java.util.Scanner;

public class bai3 {
	public static void main (String[] args) {
	try (Scanner sc = new Scanner(System.in)){
		System.out.println("Nhap 2 so vao tu ban phim ");
		int  a=sc.nextInt(),b=sc.nextInt();
		System.out.printf("Tong 2 so la %d ",a+b);
		System.out.printf("Hieu 2 so la %d \n ",a-b);
		System.out.printf("Tich 2 so la %d \n",a*b);
		System.out.printf("Thuong 2 so la %f \n ",1.0*a/b);
		System.out.printf("Du cua 2 so la %d  \n",a%b);
		
	}
}
}