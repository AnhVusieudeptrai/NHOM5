/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI2;

/**
 *
 * @author My Le
 */
public class SINHVIEN {
    private String maSinhVien;
    private String ten;
    private String ngaySinh;
    private double diemTrungBinh;
    private String hocLuc;

    public SINHVIEN(String maSinhVien, String ten, String ngaySinh, double diemTrungBinh) {
        this.maSinhVien = maSinhVien;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.diemTrungBinh = diemTrungBinh;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(double diemTrungBinh) {
        if(diemTrungBinh>=0 &&diemTrungBinh<=10)
            this.diemTrungBinh = diemTrungBinh;
        else
            System.out.println("Diem trung binh khong hop le");
    }
    public String getHocLuc() {
        return hocLuc;
    }
    public String xepLoai()
    {
        if (diemTrungBinh>=8)
            hocLuc="Gioi";
        else
            if (diemTrungBinh>=6.5)
                hocLuc="Kha";
            else
                if(diemTrungBinh>=5)
                    hocLuc="Trung binh";
                else
                    hocLuc="Yeu";   
        return hocLuc;
    }       
    
}
