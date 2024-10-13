package bai2;
import java.util.Scanner;
public class bai2 {
	public static void main(String[] args) {
		System.out.println("Nhap vao diem trung binh cua hoc sinh");
		try(Scanner sc = new Scanner(System.in)){
		double dtb=sc.nextDouble();
		if (dtb >= 8.0)
			System.out.println("Gioi");
		else
			if(dtb >=6.5)
				System.out.println("Kha");
			else
				if(dtb>=5.0 )
					System.out.println("Trung binh");
				else
					System.out.println("Yeu");
	}
}

}