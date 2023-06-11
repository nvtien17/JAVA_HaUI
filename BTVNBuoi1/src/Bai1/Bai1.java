package Bai1;

import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int day, month, year;
		System.out.println("Nhập ngày sinh :" );
		day = scan.nextInt();
		System.out.println("Nhập tháng sinh :");
		month = scan.nextInt();
		System.out.println("Nhập năm sinh : ");
		year = scan.nextInt();
		if(day <= 0 || day > 31 || month <= 0 || month > 12) {
			System.out.println("Ngày hoặc tháng sinh không hợp lệ !");
		} else {
			if((day>=20 && month ==1) || (day<=18 && month ==2))
				System.out.println("Bảo Bình");
			else if((day>=19 && month ==2) || (day<=20 && month ==3))
				System.out.println("Song Ngư");
			else if((day>=21 && month ==3) || (day<=20 && month ==4))
				System.out.println("Bạch Dương");
			else if((day>=21 && month ==4) || (day<=20 && month ==5))
				System.out.println("Kim Ngưu");
			else if((day>=21 && month ==5) || (day<=21 && month ==6))
				System.out.println("Song Tử");
			else if((day>=22 && month ==6) || (day<=22 && month ==7))
				System.out.println("Cự Giải");
			else if((day>=23 && month ==7) || (day<=22 && month ==8))
				System.out.println("Sư Tử");
			else if((day>=23 && month ==8) || (day<=22 && month ==9))
				System.out.println("Xử Nữ");
			else if((day>=23 && month ==9) || (day<=23 && month ==10))
				System.out.println("Thiên Bình");
			else if((day>=24 && month ==10) || (day<=22 && month ==11))
				System.out.println("Bọ Cạp");
			else if((day>=23 && month ==11) || (day<=21 && month ==12))
				System.out.println("Nhân Mã");
			else if((day>=22 && month ==12) || (day<=19 && month ==1))
				System.out.println("Ma Kết");
		}
	}
}
