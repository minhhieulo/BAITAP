package BaiTapLab;
import java.util.Scanner;
public class XepLoai {
    public static void main(String[] args) {
        double DiemTb;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhap diem trung binh: ");
        DiemTb= scanner.nextDouble();
        if (DiemTb >10){
            System.out.println("Ban nhap sai, vui long nhap lai! ");
        }else if (DiemTb<=10) if(DiemTb>=9){
            System.out.println("Xep loai xuat sac ");
        }else if (DiemTb>=8){
            System.out.println("Xep loai gioi ");
        }else if (DiemTb>=7){
            System.out.println("Xep loai kha ");
        }else if (DiemTb >=6){
            System.out.println("Xep loai trung binh khá ");
        }else if (DiemTb >=5){
            System.out.println("Xep loai trung binh ");
        }else {
            System.out.println("Xep loai yeu ");
        }
    }
}