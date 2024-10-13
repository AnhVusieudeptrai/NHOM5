package Bai3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        bankAccount account = new bankAccount();

        int money = 0;
        int amount = 0;
        account.setAccount();

        System.out.printf("Nhap so tien can gui: ");
        money = sc.nextInt();
        account.deposit(money);
        System.out.printf("Nhap so tien can rut: ");
        amount = sc.nextInt();
        account.withdraw(amount);
        System.out.printf("So du tai khoan la: %d\n", account.getBalance());
        System.out.println("-----Thong tin tai khoan-----");
        account.display();

        sc.close();
    }
}
