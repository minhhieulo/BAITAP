package BaiTapLab;
import java.util.Scanner;
public class VietCtr {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int chon ;
        System.out.println("1. Giai phuong trinh bac 1: ");
        System.out.println("2. Giai phuong trinh bac 2: ");
        System.out.println("3. Tinh tien dien: ");
        chon = scanner.nextInt();
        switch (chon) {
            case 1:
                System.out.println("Giai phuong trinh bac 1: ");
                break;
            case 2:
                System.out.println("Giai phuong trinh bac 2: ");
            case 3:
                System.out.println("Tinh tien dien: ");
            default:
                System.out.println("Ban da nhap sai! ");
        }
    }
}