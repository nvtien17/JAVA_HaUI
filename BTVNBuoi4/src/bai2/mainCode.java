package bai2;

import java.util.Scanner;

public class mainCode {
	public static void nhap(int n, Student st[]) {
		for(int i = 0; i < n ; i++) {
			st[i] = new Student();
			System.out.println("Nhập sinh viên thứ " + (i+1));
			st[i].nhap();
		}
	}
	public static void xuat(int n, Student st[]) {
		for(Student value : st ) {
			value.xuat();
		}
	}
	public static void timKiem(int n, Student st[]) {
		Scanner scan = new Scanner(System.in);
		int id;
		System.out.println("Nhập id của sinh viên cần tìm : ");
		id = scan.nextInt();
		int d = 0;
		for(int i = 0; i < n; i++) {
			if(st[i].getId() == id ) {
				d++;
				st[i].xuat();
			}
		}
		if(d == 0) {
			System.out.println("Không có sinh viên cần tìm!");
		}
	}
	public static void sua(int n, Student st[]) {
		for(Student value : st) {
			if(value.getX().getProvince().equals("Thanh Hóa")) {
				value.getX().setProvince("Hải Phòng");
			}
		}
		System.out.println("\tTHÔNG TIN SINH VIÊN SAU KHI SỬA");
		xuat(n,st);
	}
	public static void xoa(int n, Student st[]) {
		int id;
		System.out.println("Nhập id của sinh viên cần xóa : ");
		Scanner scan = new Scanner(System.in);
		id = scan.nextInt();
		int d = 0;
		for(int i = 0 ; i < n; i++) {
			if(st[i].getId() == id) {
				for(int j= i; j<n ; j++) {
					st[j]= st[j+1];
					j--;
				}
			}
		}
		if(d==0) {
			System.out.println("Không có sinh viên cần xóa");
		}
	
		System.out.println("DANH SÁCH SINH VIÊN SAU KHI XÓA");
		xuat(n,st);
	}
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n;
		do {
			System.out.println("Nhập số phần tử của mảng : n = ");
			n = scan.nextInt();
		}while(n <= 0);
		Student[] st = new Student[n];
		nhap(n,st);
		System.out.println("\t THÔNG TIN SINH VIÊN");
		xuat(n,st);
//		timKiem(n,st);
//		sua(n,st);
		xoa(n,st);
	}
}
