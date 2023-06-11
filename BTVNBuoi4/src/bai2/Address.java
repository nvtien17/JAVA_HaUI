package bai2;

import java.util.Scanner;

public class Address {
	private static int currentId = 0 ;
	private int id;
	private String district;
	private String province;

	public Address() {
		this.id = currentId++;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public void nhap() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhập huyện : ");
		district = scan.nextLine();
		System.out.println("Nhập tỉnh : ");
		province = scan.nextLine();
	}
	public void xuat() {
		System.out.println(", Mã ĐC : " + id +", Huyện " + district + ", Tỉnh : " + province);
	}
 
}
