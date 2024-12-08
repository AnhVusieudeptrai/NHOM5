/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI2;
import java.util.Scanner;
/**
 *
 * @author My Le
 */
public class Test 
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap so luong sinh vien: ");
        int n=scanner.nextInt();
        SINHVIEN[] ds=new SINHVIEN[n];
        for (int i = 0; i < n; i++) 
        {
            SINHVIEN sv = new SINHVIEN();
            System.out.println("NHAP SINH VIEN THU"+" "+(i+1)+":");
            sv.Nhap(); 
            ds[i] = sv;
        }
        System.out.println("\nDANH SACH SINH VIEN:");
        for (int i = 0; i < ds.length; i++)
        {
            SINHVIEN sv = ds[i];
            sv.Xuat();
        }
        for (int i = 0; i < n - 1; i++)
            for (int j = i + 1; j < n; j++) 
                if (ds[i].getDTB() < ds[j].getDTB())
                {
                    SINHVIEN temp = ds[i];
                    ds[i] = ds[j];
                    ds[j] = temp;   
                }
        System.out.println("\nDANH SACH SINH VIEN SAU KHI SAP XEP GIAM THEO DTB: ");
        for (int i = 0; i < ds.length; i++) 
        {
             SINHVIEN sv = ds[i];
             sv.Xuat();
        }
    }
}