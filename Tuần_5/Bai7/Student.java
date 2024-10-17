package Tuần_5.Bai7;

public class Student {
   String masv;
   String ten;  
   double dtb;  
   public Student(String masv, String ten, double dtb) {
      this.masv = masv;
      this.ten = ten;
      this.dtb = dtb;
   }
   public void d() {
      System.out.println("Mã SV: " + masv + ", Tên: " + ten + ", GPA: " + dtb);
   }
}
