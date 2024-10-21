/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI2;

/**
 *
 * @author My Le
 */
public class Test {
    public static void main(String[] args){
        SINHVIEN sv=new SINHVIEN("0123","A","01/01/2005",8);
        System.out.println("Ma sinh vien: "+sv.getMaSinhVien());
        System.out.println("Ten sinh vien: "+sv.getTen());
        System.out.println("Ngay sinh: "+sv.getNgaySinh());
        sv.setDiemTrungBinh(1);
        System.out.println("Diem trung binh: "+sv.getDiemTrungBinh());
        System.out.println("Hoc luc: "+sv.xepLoai());
    }
}
