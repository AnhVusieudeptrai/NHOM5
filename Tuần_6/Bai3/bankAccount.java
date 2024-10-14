package Bai3;

import java.util.Scanner;

public class bankAccount {
    Scanner sc = new Scanner(System.in);
    public int id;
    private String password;
    private String Newpassword;
    private String checkPassword;
    public String name;
    public int balance = 0;

    public void setAccount() {
        System.out.printf("Nhap so tai khoan: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.printf("Nhap ten khach hang: ");
        name = sc.nextLine();
        System.out.printf("Nhap so du tai khoan: ");
        balance = sc.nextInt();
        sc.nextLine();
        System.out.printf("Nhap mat khau tai khoan: ");
        password = sc.nextLine();
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        if(amount > balance) {
            System.out.println("So du tai khoan khong du de rut theo yeu cau.");
        }else{
            balance -= amount;
        }
    }

    public void setPassword() {
        checkPassword = sc.nextLine();
        while(!checkPassword.equals(password)){
            System.out.printf("Mat khau tai khoan cu sai, vui long nhap lai:");
            checkPassword = sc.nextLine();
        }
        System.out.printf("Nhap mat khau moi: ");
        Newpassword = sc.nextLine();
        password = Newpassword;
        Newpassword = "\0";
    }

    public void display() {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }
}
