package BaiTapLab;
import java.util.Scanner;
public class GiaiThua {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n, i=1;
        int KetQua=1;
        System.out.println("Nhap so nguyen n: ");
        n= scanner.nextInt();
        while (i<=n){
            i++;
            KetQua= KetQua *i;
        }System.out.println("Giai thua la " + KetQua );
    }
}