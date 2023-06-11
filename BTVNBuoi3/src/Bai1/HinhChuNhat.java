package Bai1;

import java.util.Scanner;

public class HinhChuNhat {
	Scanner scan = new Scanner(System.in);
	private double width;
	private double lenght;
	public HinhChuNhat() {
		
	}

	public HinhChuNhat(double width, double lenght) {
		this.width = width;
		this.lenght = lenght;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLenght() {
		return lenght;
	}

	public void setLenght(double lenght) {
		this.lenght = lenght;
	}
	
	public void nhap() {
		do {
			System.out.println("Nhập chiều dài " );
			lenght = scan.nextDouble();
			System.out.println("Nhập chiều rộng ");
			width = scan.nextDouble();
		}while (lenght<=0 || width <=0);
	}
	public void xuat() {
		System.out.println("Chiều dài = " + lenght);
		System.out.println("Chiều rộng = "+ width);
	}
	public double dienTich() {
		return lenght * width ;
	}
	public double chuVi() {
		return (lenght + width)*2;
	}
	
	
	
}
