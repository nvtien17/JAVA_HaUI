package Bai3;

import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap so nguyen n : ");
		int n = scan.nextInt();
		int t=0;
		for(int i = 1; i<=n; i++) {
			if(n % i == 0)
				t += i;
		}
		System.out.println("Tổng các ước của n là : " + t);
	}
}
