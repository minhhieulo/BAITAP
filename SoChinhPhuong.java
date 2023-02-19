package BaiTapLab;

import java.util.Scanner;
public class SoChinhPhuong {
    public static void main(String[] args) {
        int n;
        double KetQua ;
        System.out.println("Nhap so can kiem tra n ");
        Scanner scanner = new Scanner(System.in);
        n= scanner.nextInt();
        KetQua= Math.sqrt(n);
        if (KetQua== (int)KetQua){
            System.out.println("So nay la so chinh phuong ");
        }else{
            System.out.println("So nay khong phai la so chinh phuong ");
        }
    }
}
