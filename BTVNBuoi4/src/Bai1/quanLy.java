package Bai1;

import java.util.Scanner;

public class quanLy {
	private int maQL;
	private String hoTen;
	/**
	 * 
	 */
	public quanLy() {
	
	}
	/**
	 * @param maQL
	 * @param hoTen
	 */
	public quanLy(int maQL, String hoTen) {
		this.maQL = maQL;
		this.hoTen = hoTen;
	}
	public void nhap() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhập mã quản lí : ");
		maQL = scan.nextInt();
		System.out.println("Nhập tên quản lí : ");
		scan.nextLine();
		hoTen = scan.nextLine();
	}
	public void xuat() {
		System.out.println("Mã quản lí : " + maQL);
		System.out.println("Họ tên quản lí : " + hoTen);
	}
	
}
