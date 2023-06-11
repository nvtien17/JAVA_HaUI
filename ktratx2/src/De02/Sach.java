package De02;

import java.io.Serializable;
import java.util.Scanner;

public class Sach implements Serializable{
	private String id;
	private String tenSach;
	private String tacGia;
	private int namXB;
	private String nhaXB;
	public Sach() {
		
	}
	/**
	 * @param id
	 * @param tenSach
	 * @param tacGia
	 * @param namXB
	 * @param nhaXB
	 */
	public Sach(String id, String tenSach, String tacGia, int namXB, String nhaXB) {
		super();
		this.id = id;
		this.tenSach = tenSach;
		this.tacGia = tacGia;
		this.namXB = namXB;
		this.nhaXB = nhaXB;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTenSach() {
		return tenSach;
	}
	public void setTenSach(String tenSach) {
		this.tenSach = tenSach;
	}
	public String getTacGia() {
		return tacGia;
	}
	public void setTacGia(String tacGia) {
		this.tacGia = tacGia;
	}
	public int getNamXB() {
		return namXB;
	}
	public void setNamXB(int namXB) {
		this.namXB = namXB;
	}
	public String getNhaXB() {
		return nhaXB;
	}
	public void setNhaXB(String nhaXB) {
		this.nhaXB = nhaXB;
	}
	public void Input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap ma sach : ");
		id = scan.nextLine();
		System.out.println("Nhap ten sach : ");
		tenSach = scan.nextLine();
		System.out.println("Nhap ten tac gia : ");
		tacGia = scan.nextLine();
		System.out.println("Nhap nha xuat ban : ");
		nhaXB = scan.nextLine();
		System.out.println("Nhap nam xuat ban : ");
		namXB = scan.nextInt();
	}
	public String toString() {
		return String.format("%-20s %-20s %-20s %-20s %-20d", id, tenSach, tacGia, nhaXB, namXB);
	}
}
