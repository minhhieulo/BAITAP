package BaiTapLab;

import java.util.Scanner;

public class TienDien {
    
    public static void main(String[] args) {
        int SoDien, TienDien;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhap SoDien: ");
        SoDien = scanner.nextInt();
        if (SoDien <50){
        TienDien= SoDien*1000;
        System.out.println("TienDien= " + TienDien);
        }else{
        TienDien= 50*100+(SoDien-50)*1200;
        System.out.println("TienDien= " + TienDien);
        }
    }
    
}