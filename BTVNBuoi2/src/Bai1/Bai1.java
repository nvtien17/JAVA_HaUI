package Bai1;

import java.util.Scanner;

public class Bai1 {
	public static float TBCChan(int n, int a[]){
		int tongchan=0;
		int dem=0;
		for(int i=0;i<n;i++) {
			if((i+1)%2==0) {
				tongchan += a[i];
				dem++;
			}
		}
		return (float)tongchan/dem;
	}
	public static int VT(int n, int a[]) {
		int d=0;
		int min = a[0];
		for(int i=0;i<n;i++) {
			if(a[i]<min)
				min=a[i];
		}
		for(int j=0;j<n;j++) {
			if(a[j]==min)
				d=j;
				break;
		}
		return d+1;
	}
	public static int checkSCP(int n, int a[]) {
		for(int i=0; i<n; i++) {
			int sqr = (int) Math.sqrt(a[i]);
			if(sqr*sqr == a[i])
				return 1;
		} 
		return 0;
	}
	public static void HTSCP( int n, int a[]) {
		if(checkSCP(n,a) == 1) {
			System.out.println("Số chính phương trong mảng là :");
			for(int j=0;j<n;j++) {
				int sqrt= (int) Math.sqrt(a[j]);
				if(sqrt*sqrt == a[j])
					System.out.print(a[j]+" ");
			}
		}
		else System.out.println("Mảng k có số chính phương");
	}
	public static int checkSNT(int n) {
		if(n<2) return 0;
		else {
			for(int i=2;i<n;i++) {
				if(n%i==0)
					return 0;
			}
			return 1;
		}
	}
	public static void HTSNT(int n, int a[]) {
		int d=0;
		for(int i=0;i<n;i++) {
			if(checkSNT(a[i])==1)
				d++;
		}
		if(d>0) {
			System.out.println("\nCác số nguyên tố có trong mảng là : ");
			for(int i=0;i<n;i++) {
				if(checkSNT(a[i])==1)
					System.out.print(a[i]+" ");
			}
		}
		else System.out.println("\nMảng không có số nguyên tố!");
	}
	public static void Saptang(int n,int a[]) {
		for(int i=0;i<n-1;i++)
			for(int j=n-1;j>i;j--) {
				if(a[j]<a[j-1]) {
					int tg=a[j];
					a[j]=a[j-1];
					a[j-1]=tg;
				}
			}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap so phan tu cua mang : n =  ");
		int n = scan.nextInt();
		int a[]= new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("a[" +i +"] =");
			a[i]= scan.nextInt();
		}
		System.out.print("Mảng vừa nhập là : ");
		for(int value: a) {
			System.out.print(value + " ");
		}
		System.out.println("\nTBC các phần tử ở vị trí chẵn của mảng là : " + TBCChan(n,a));
		System.out.println("Phần tử nhỏ nhất nằm ở vị trí thứ  " + VT(n,a));
		HTSCP(n,a);
		HTSNT(n,a);
		System.out.println("\nDãy sau khi sắp tăng : ");
		Saptang(n,a);
		for(int value: a) {
			System.out.print(value + " ");
		}
	}
}

