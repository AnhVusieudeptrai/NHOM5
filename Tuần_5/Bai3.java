package Tuần_5;

import java.util.Scanner;
public class Bai3 {

	public static void sapxep(int[] a) {
      int n = a.length;

      for (int i=0;i<n-1;i++) {
         for (int j=0;j<n-i-1;j++) {
               if (a[j]>a[j+1]) {
                  int t=a[j];
                  a[j] = a[j + 1];
                  a[j+1] = t;
               }
         }
      }
   }
   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      System.out.print("Nhập số phần tử của mảng: ");
      int n = sc.nextInt();
      int[] a = new int[n];

      for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            a[i] = sc.nextInt();
      }
      sapxep(a);
      System.out.println("Mảng sau khi sắp xếp tăng dần: ");
      for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
      }
      
      sc.close();
   }
}

