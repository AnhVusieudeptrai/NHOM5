/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.quanli_ck;

import java.util.Scanner;
import java.util.InputMismatchException;

public class QuanLi_CK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuanLyHangHoa qlHangHoa = new QuanLyHangHoa();
        QuanLyNhanVien qlNhanVien = new QuanLyNhanVien();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Quản lý hàng hóa");
            System.out.println("2. Quản lý nhân viên");
            System.out.println("3. Thoát");
            System.out.print("Chọn chức năng: ");
            int choice = 0;

            // Xử lý ngoại lệ khi người dùng nhập không phải số nguyên
            try {
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline
            } catch (InputMismatchException e) {
                System.out.println("Lỗi: Bạn phải nhập một số nguyên!");
                scanner.nextLine(); // Consume invalid input
                continue;
            }

            if (choice == 1) {
                while (true) {
                    System.out.println("\nMenu Quản lý hàng hóa:");
                    System.out.println("1. Thêm hàng hóa");
                    System.out.println("2. Xóa hàng hóa");
                    System.out.println("3. Cập nhật hàng hóa");
                    System.out.println("4. Hiển thị hàng hóa");
                    System.out.println("5. Tìm kiếm hàng hóa");
                    System.out.println("6. Lưu vào file");
                    System.out.println("7. Đọc từ file");
                    System.out.println("8. Quay lại");
                    System.out.print("Chọn chức năng: ");
                    int hangHoaChoice = 0;

                    try {
                        hangHoaChoice = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                    } catch (InputMismatchException e) {
                        System.out.println("Lỗi: Bạn phải nhập một số nguyên!");
                        scanner.nextLine(); // Consume invalid input
                        continue;
                    }

                    if (hangHoaChoice == 1) {
                        try {
                            System.out.print("Mã hàng: ");
                            String maHang = scanner.nextLine();
                            System.out.print("Tên hàng: ");
                            String tenHang = scanner.nextLine();
                            System.out.print("Số lượng: ");
                            int soLuong = scanner.nextInt();
                            System.out.print("Giá bán(/kg): ");
                            double giaBan = scanner.nextDouble();
                            scanner.nextLine(); // Consume newline
                            System.out.print("Hạn sử dụng: ");
                            String hanSuDung = scanner.nextLine();
                            System.out.print("Đánh giá: ");
                            String danhGia = scanner.nextLine();
                            qlHangHoa.themHangHoa(maHang, tenHang, soLuong, giaBan, hanSuDung, danhGia);
                        } catch (InputMismatchException e) {
                            System.out.println("Lỗi: Nhập không đúng kiểu dữ liệu. Vui lòng thử lại!");
                            scanner.nextLine(); // Consume invalid input
                        }
                    } else if (hangHoaChoice == 2) {
                        System.out.print("Nhập mã hàng cần xóa: ");
                        String maHang = scanner.nextLine();
                        qlHangHoa.xoaHangHoa(maHang);
                    } else if (hangHoaChoice == 3) {
                        try {
                            System.out.print("Nhập mã hàng cần cập nhật: ");
                            String maHang = scanner.nextLine();
                            System.out.print("Tên hàng: ");
                            String tenHang = scanner.nextLine();
                            System.out.print("Số lượng: ");
                            int soLuong = scanner.nextInt();
                            System.out.print("Giá bán(/kg): ");
                            double giaBan = scanner.nextDouble();
                            scanner.nextLine(); // Consume newline
                            System.out.print("Hạn sử dụng: ");
                            String hanSuDung = scanner.nextLine();
                            System.out.print("Đánh giá: ");
                            String danhGia = scanner.nextLine();
                            qlHangHoa.capNhatHangHoa(maHang, tenHang, soLuong, giaBan, hanSuDung, danhGia);
                        } catch (InputMismatchException e) {
                            System.out.println("Lỗi: Nhập không đúng kiểu dữ liệu. Vui lòng thử lại!");
                            scanner.nextLine(); // Consume invalid input
                        }
                    } else if (hangHoaChoice == 4) {
                        qlHangHoa.hienThiHangHoa();
                    } else if (hangHoaChoice == 5) {
                        System.out.print("Nhập mã hoặc tên hàng cần tìm: ");
                        String search = scanner.nextLine();
                        qlHangHoa.timKiemHangHoa(search, search);
                    } else if (hangHoaChoice == 6) {
                        try {
                            qlHangHoa.luuFile();
                            
                        } catch (Exception e) {
                            System.out.println("Lỗi khi lưu dữ liệu vào file: " + e.getMessage());
                        }
                    } else if (hangHoaChoice == 7) {
                        try {
                            qlHangHoa.docFile();
                        } catch (Exception e) {
                            System.out.println("Lỗi khi đọc dữ liệu từ file: " + e.getMessage());
                        }
                    } else if (hangHoaChoice == 8) {
                        break;
                    }
                }
            } else if (choice == 2) {
                while (true) {
    System.out.println("\nMenu Quản lý nhân viên:");
    System.out.println("1. Thêm nhân viên");
    System.out.println("2. Xóa nhân viên");
    System.out.println("3. Cập nhật nhân viên");
    System.out.println("4. Hiển thị nhân viên");
    System.out.println("5. Tìm kiếm nhân viên");
    System.out.println("6. Lưu vào file");
    System.out.println("7. Đọc từ file");
    System.out.println("8. Quay lại");
    System.out.print("Chọn chức năng: ");
    int nhanVienChoice = 0;

    try {
        nhanVienChoice = scanner.nextInt();
        scanner.nextLine(); // Consume newline
    } catch (InputMismatchException e) {
        System.out.println("Lỗi: Bạn phải nhập một số nguyên!");
        scanner.nextLine(); // Consume invalid input
        continue;
    }

    switch (nhanVienChoice) {
        case 1: // Thêm nhân viên
    try {
        System.out.print("Mã nhân viên: ");
        String maNV = scanner.nextLine();
        System.out.print("Tên nhân viên: ");
        String tenNV = scanner.nextLine();
        System.out.print("Lương cơ bản: ");
        double luongCoBan = scanner.nextDouble();
        System.out.print("Lương thưởng: ");
        double luongThuong = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        System.out.print("Loại nhân viên (BANHANG/THUNGAN): ");
        String loai = scanner.nextLine().toUpperCase();

        if (loai.equals("BANHANG")) {
            System.out.print("Nhập doanh thu: ");
            double doanhThu = scanner.nextDouble();
            qlNhanVien.themNhanVien(maNV, tenNV, luongCoBan, luongThuong, doanhThu, "BANHANG");
        } else if (loai.equals("THUNGAN")) {
            System.out.print("Nhập số giờ làm: ");
            double soGioLam = scanner.nextDouble();
            qlNhanVien.themNhanVien(maNV, tenNV, luongCoBan, luongThuong, soGioLam, "THUNGAN");
        } else {
            System.out.println("Loại nhân viên không hợp lệ! Vui lòng nhập BANHANG hoặc THUNGAN.");
        }
    } catch (InputMismatchException e) {
        System.out.println("Lỗi: Nhập không đúng kiểu dữ liệu. Vui lòng thử lại!");
        scanner.nextLine(); // Consume invalid input
    }
    break;

        case 2: // Xóa nhân viên
            System.out.print("Nhập mã nhân viên cần xóa: ");
            String maNVXoa = scanner.nextLine();
            qlNhanVien.xoaNhanVien(maNVXoa);
            break;

        case 3: // Cập nhật nhân viên
            try {
                System.out.print("Nhập mã nhân viên cần cập nhật: ");
                String maNVCapNhat = scanner.nextLine();
                System.out.print("Tên nhân viên: ");
                String tenNVCapNhat = scanner.nextLine();
                System.out.print("Lương cơ bản: ");
double luongCoBanCapNhat = scanner.nextDouble();
                System.out.print("Lương thưởng: ");
                double luongThuongCapNhat = scanner.nextDouble();
                scanner.nextLine(); // Consume newline

                System.out.print("Loại nhân viên (BANHANG/THUNGAN): ");
                String loaiCapNhat = scanner.nextLine().toUpperCase();

                if (loaiCapNhat.equals("BANHANG")) {
                    System.out.print("Nhập doanh thu mới: ");
                    double doanhThuMoi = scanner.nextDouble();
                    qlNhanVien.capNhatNhanVien(maNVCapNhat, tenNVCapNhat, luongCoBanCapNhat, luongThuongCapNhat, "BANHANG", doanhThuMoi);
                } else if (loaiCapNhat.equals("THUNGAN")) {
                    System.out.print("Nhập số giờ làm mới: ");
                    double soGioLamMoi = scanner.nextDouble();
                    qlNhanVien.capNhatNhanVien(maNVCapNhat, tenNVCapNhat, luongCoBanCapNhat, luongThuongCapNhat, "THUNGAN", soGioLamMoi);
                } else {
                    System.out.println("Loại nhân viên không hợp lệ! Vui lòng nhập BANHANG hoặc THUNGAN.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Lỗi: Nhập không đúng kiểu dữ liệu. Vui lòng thử lại!");
                scanner.nextLine(); // Consume invalid input
            }
            break;

        case 4: // Hiển thị nhân viên
            qlNhanVien.hienThiNhanVien();
            break;

        case 5: // Tìm kiếm nhân viên
            System.out.print("Nhập mã hoặc tên nhân viên cần tìm: ");
            String search = scanner.nextLine();
            qlNhanVien.timKiemNhanVien(search, search);
            break;

        case 6: // Lưu vào file
            try {
                qlNhanVien.luuFile();
            } catch (Exception e) {
                System.out.println("Lỗi khi lưu dữ liệu vào file: " + e.getMessage());
            }
            break;

        case 7: // Đọc từ file
            try {
                qlNhanVien.docFile();
            } catch (Exception e) {
                System.out.println("Lỗi khi đọc dữ liệu từ file: " + e.getMessage());
            }
            break;

        case 8: // Quay lại
            break;

        default:
            System.out.println("Lựa chọn không hợp lệ! Vui lòng nhập từ 1 đến 8.");
    }
    if(nhanVienChoice == 8)
    {
        break;
    }
}

            }else if (choice == 3) {
                System.out.println("Thoát chương trình.");
                break;
            }
        }
    }
}
