package Bai1;

import java.util.Scanner;

public class phongMay {
	private int maPhong ;
	private String tenPhong;
	private float dienTich;
	private may x;
	private quanLy y;
	
	public phongMay() {
	
	}

	public void nhap() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhập mã phòng : ");
		maPhong = scan.nextInt();
		System.out.println("Tên phòng : ");
		scan.nextLine();
		tenPhong = scan.nextLine();
		System.out.println("Diện tích : ");
		dienTich = scan.nextFloat();
		scan.nextLine();
		x = new may();
		x.nhap();
		y = new quanLy();
		y.nhap();
	}
	public void xuat() {
		System.out.println("\t THÔNG TIN PHÒNG MÁY");
		System.out.println("Mã phòng : " + maPhong);
		System.out.println("Tên phòng : " + tenPhong);
		System.out.println("Diện tích : "+ dienTich);
		x.xuat();
		y.xuat();
	}
	
}
