package Bai1;

public class Main {
    public static void main(String[] args) {
        Rectangle hcn = new Rectangle();

        hcn.setSize();
        System.out.printf("Dien tich hinh chu nhat la: ", hcn.acreage());
        System.out.printf("Chu vi hinh chu nhat la: ", hcn.perimeter());

    }
}