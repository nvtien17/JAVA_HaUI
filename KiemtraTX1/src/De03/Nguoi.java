package De03;
import java.util.*;
public class Nguoi {
	protected String hoTen;
	protected String gioiTinh;
	protected String ngaySinh;
	protected String cCCD;
	public Nguoi() {
		
	}
	public Nguoi(String hoTen, String gioiTinh, String ngaySinh, String cCCD) {
		this.hoTen = hoTen;
		this.gioiTinh = gioiTinh;
		this.ngaySinh = ngaySinh;
		this.cCCD = cCCD;
	}
	
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public String getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public String getcCCD() {
		return cCCD;
	}
	public void setcCCD(String cCCD) {
		this.cCCD = cCCD;
	}
	
	public void Input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap ho ten : ");
		hoTen = scan.nextLine();
		System.out.println("Gioi tinh : ");
		gioiTinh = scan.nextLine();
		System.out.println("Ngay sinh : ");
		ngaySinh = scan.nextLine();
		System.out.println("So CCCD : ");
		cCCD = scan.nextLine();
	}
	
	public void Output() {
		System.out.println( hoTen +", "+ gioiTinh +", " + ngaySinh + ", " + cCCD);
	}
}
