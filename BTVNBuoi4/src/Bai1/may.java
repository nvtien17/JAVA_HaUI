package Bai1;

import java.util.Scanner;

public class may {
	private int maMay;
	private String kieuMay;
	private String tinhTrang;
	/**
	 * 
	 */
	public may() {
		
	}
	/**
	 * @param maMay
	 * @param kieuMay
	 * @param tinhTrang
	 */
	public may(int maMay, String kieuMay, String tinhTrang) {
		this.maMay = maMay;
		this.kieuMay = kieuMay;
		this.tinhTrang = tinhTrang;
	}
	public void nhap() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap ma may : ");
		maMay = scan.nextInt();
		System.out.println("Kieu may : ");
		scan.nextLine();
		kieuMay = scan.nextLine();
		System.out.println("Tinh trang may :");
		tinhTrang = scan.nextLine();
	}
	public void xuat() {
		System.out.println("Mã máy : " + maMay);
		System.out.println("Kiểu máy : " + kieuMay);
		System.out.println("Tình trạng máy : " + tinhTrang);
	}
}
