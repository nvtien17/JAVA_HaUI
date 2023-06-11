package De04;
import java.util.*;
public class Diem {
	public double diemMon1, diemMon2, diemMon3, diemTB;
	static Scanner scan = new Scanner(System.in);
	public Diem() {
		
	}
	/**
	 * @param diemMon1
	 * @param diemMon2
	 * @param diemMon3
	 * @param diemTB
	 */
	public Diem(double diemMon1, double diemMon2, double diemMon3) {
		this.diemMon1 = diemMon1;
		this.diemMon2 = diemMon2;
		this.diemMon3 = diemMon3;
		this.diemTB = (diemMon1+diemMon2+diemMon3)/3;
	}
	
	public double getDiemMon1() {
		return diemMon1;
	}
	public void setDiemMon1(double diemMon1) {
		this.diemMon1 = diemMon1;
	}
	public double getDiemMon2() {
		return diemMon2;
	}
	public void setDiemMon2(double diemMon2) {
		this.diemMon2 = diemMon2;
	}
	public double getDiemMon3() {
		return diemMon3;
	}
	public void setDiemMon3(double diemMon3) {
		this.diemMon3 = diemMon3;
	}
	public double getDiemTB() {
		return (diemMon1+diemMon2+diemMon3)/3;
	}
	public void setDiemTB(double diemTB) {
		this.diemTB = diemTB;
	}
	public void Input() {
		System.out.println("Nhap diem mon thu nhat : ");
		diemMon1 = scan.nextDouble();
		System.out.println("Nhap diem mon thu 2 : ");
		diemMon2 = scan.nextDouble();
		System.out.println("Nhap diem mon thu 3 : ");
		diemMon3 = scan.nextDouble();
	}
	public void Output() {
		System.out.format("%-10.2f %-10.2f %-10.2f", diemMon1, diemMon2, diemMon3);
	}
}
