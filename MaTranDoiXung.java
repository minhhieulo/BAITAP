package BaiTapLab;
import java.util.Scanner;
public class MaTranDoiXung {
	public static void nhapMang(double a[][], int n) {
		Scanner scanner= new Scanner(System.in);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("a["+i+"]["+j+"] = ");
				a[i][j]=scanner.nextDouble();
			}
		}
	}
	
	public static void xuatMang(double a[][],int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j]+"    ");
			}
			System.out.println("");
		}
	}
	
	public static boolean kiemTraDoiXung(double a[][],int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(a[i][j] != a[j][i]) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
	 double a[][] = new double[100][100];
	 int n;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.print("Nhap so dinh n: ");
			n = sc.nextInt();
		} while (n < 2 || n > 100);
		
		nhapMang(a, n);
		if(kiemTraDoiXung(a, n)==true) {
			System.out.println("");
			System.out.println("Ma tran đoi xung :");
			xuatMang(a, n);
		}else {
			System.out.println("Khong phai la ma tran doi xung");
		}
		
	}
}