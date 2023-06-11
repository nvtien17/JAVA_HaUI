package De04;

import java.util.Scanner;

public class SinhVien extends Nguoi{
	Scanner scan = new Scanner(System.in);
	private String maSv;
	private String nganhNghe;
	private Diem diem;
	public SinhVien() {
		
	}
	/**
	 * @param maSv
	 * @param nganhNghe
	 * @param diem
	 */
	public SinhVien(String maSv, String nganhNghe, Diem diem) {
		this.maSv = maSv;
		this.nganhNghe = nganhNghe;
		this.diem = diem;
	}
	
	/**
	 * @param hoTen
	 * @param gioiTinh
	 * @param ngaySinh
	 * @param cCCD
	 */
	public SinhVien(String hoTen, String gioiTinh, String ngaySinh, String cCCD, String maSV, String nganhNghe, Diem diem) {
		super(hoTen, gioiTinh, ngaySinh, cCCD);
		// TODO Auto-generated constructor stub
		this.maSv = maSv;
		this.nganhNghe = nganhNghe;
		this.diem = diem;
	}
	public String getMaSv() {
		return maSv;
	}
	public void setMaSv(String maSv) {
		this.maSv = maSv;
	}
	public String getNganhNghe() {
		return nganhNghe;
	}
	public void setNganhNghe(String nganhNghe) {
		this.nganhNghe = nganhNghe;
	}
	
	public Diem getDiem() {
		return diem;
	}
	public void setDiem(Diem diem) {
		this.diem = diem;
	}
	@Override 
	public void Input() {
		super.Input();
		System.out.println("Nhap ma SV : ");
		maSv = scan.nextLine();
		System.out.println("Nhap nganh nghe : ");
		nganhNghe = scan.nextLine();
		System.out.println("Nhap diem sinh vien : ");
		diem = new Diem();
		diem.Input();
	}
	@Override
	public void Output() {
		super.Output();
		System.out.format("%-10s %-10s %-10.2f %-10.2f %-10.2f", maSv, nganhNghe, diem.diemMon1, diem.diemMon2, diem.diemMon3);
		
		System.out.println();
	}
}
