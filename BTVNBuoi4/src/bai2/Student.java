package bai2;

import java.util.Scanner;

public class Student {
	private static int currentID = 0;
	private int id;
	private String name;
	private int age;
	private Address x;
	/**
	 * @param id
	 */
	public Student() {
		this.id = currentID++;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getX() {
		return x;
	}

	public void setX(Address x) {
		this.x = x;
	}

	public void nhap() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhập tên sinh viên : ");
		name = scan.nextLine();
		System.out.println("Nhập tuổi : ");
		age = scan.nextInt();
		x = new Address();
		x.nhap();
	}
	public void xuat() {
		System.out.print("Mã SV : "+ id + ", Tên : " + name + ", Tuổi : " + age);
		x.xuat();
	}
	
}
