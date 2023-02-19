package BaiTapLab;
import java.util.Scanner;
public class XoaPhanTu {
    public static void main(String[] args) {
        int n ;
        Scanner scanner= new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        n= scanner.nextInt();
        int DaySo[]= new int[n];
        System.out.println("Nhap gia tri cho mang: ");
        for (int i=0; i<n; i++){
            System.out.print("");
            DaySo[i]=scanner.nextInt();
        }
        int SoCanXoa;
        System.out.print("So can xoa la: ");
        SoCanXoa= scanner.nextInt();
        int i, j=0;
        for (i=0; i<DaySo.length;i++){
            if(SoCanXoa == DaySo[i]){
            } else{
               DaySo[j]=DaySo[i];
               j++;
            }
        }
        System.out.println("Day so moi");
        for (i=0;i<j;i++){
            System.out.print(DaySo[i]+" ");
        }
        System.out.println("");
        for(i=0;i<n-1;i++){
            for(int k=i+1;k<n;k++){
                if (DaySo[i]>DaySo[k]){
                    int temp;
                    temp=DaySo[i];
                    DaySo[i]=DaySo[k];
                    DaySo[k]=temp;
                }
            }
        }
        System.out.print("Day so sau khi duoc sap xep la: ");
        for( i=0;i<n-1;i++){
            System.out.print(DaySo[i]+" ");
        }
        System.out.println("");
    }
}
