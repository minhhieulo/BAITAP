package BaiTapLab;

import java.util.Scanner;

public class GiaiPhuongTrinhBac2{

    public static void main(String[] args) {
        int a, b, c;
        double delta, x1, x2, x;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so a vao: ");
        a = scanner.nextInt();
        System.out.println("Nhap so b vao: ");
        b = scanner.nextInt();
        System.out.println("Nhap so c vao: ");
        c = scanner.nextInt();
        if (a == 0) {
            System.out.println("Giai phuong trinh bac 1: ");
        } else {
                delta = b * b - 4 * a * c;
                System.out.println("Tinh delta: \ndelta =: " + delta);
            if (delta < 0) {
                System.out.println("Phuong trinh vo nghiem: ");
            } else if (delta == 0) {
                x = -b / 2 * a;
                System.out.println("Phuong trinh co nghiem kep x=: " + x);
            } else {
                x1 = ((-b) + Math.sqrt(delta)) / (2 * a);
                x2 = ((-b) - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phuong trinh co hai nghiem phan biet: ");
                System.out.println("x1= " + x1);
                System.out.println("x2= " + x2);
            } 
        }
    }
}