package Bai2;

import java.util.Scanner;

public class bai2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a,b,c;
		System.out.println("Nhap a b c : ");
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		if(a+b <= c || a+c <= b || b+c <= a)
			System.out.println("3 cạnh a b c không thể tạo thành tam giác!");
		else {
			if(a*a + b*b == c*c || a*a + c*c == b*b || c*c + b*b == a*a)
				System.out.println("3 cạnh a b c tạo thành tam giác vuông");
			else if(a == b && b == c)
				System.out.println("3 cạnh a b c tạo thành tam giác đều");
			else if(a == b || a == c || c == b)
				System.out.println("3 cạnh a b c tạo thành tam giác cân");
			else if((a == b & a == Math.sqrt(c)) || (a == c && a == Math.sqrt(b)) || (b == c && b == Math.sqrt(a)))
				System.out.println("3 cạnh a b c tạo thành tam giác vuông cân");
			else System.out.println("3 cạnh a b c tạo thành tam giác thường");
		}
	}
}
