package bai3;
import java.util.Scanner;
public class bai3 {
	public static void main (String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Nhap a b c ");
			int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
			if (a==0)
				if (b==0)
					if(c==0)
						System.out.println("PTVN");
					else
						System.out.println("PTVSN");
				else
						System.out.println("Pt co 1 nghiem x=" + -c*1.0/b);
			else
			{
				int denta=b*b-4*a*c;
				if(denta < 0)
					System.out.println("PTVN");
				else
					if (denta==0)
						System.out.println("PT co nghiem kep x= " + -b*1.0/(2*a));
					else
						System.out.println("pt co 2 nghiem phan biet x1= "+ 1.0*(-b-Math.sqrt(denta))/(2*a)+ "\n x2="+1.0*(-b+Math.sqrt(denta))/(2*a));
			}
					
						
		}
	}
}
