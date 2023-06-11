package De03;
import java.util.*;
public class NhanSu extends Nguoi implements Luong{
	Scanner scan = new Scanner(System.in);
	private String maNV;
	private String nganhNghe;
	private double heSoLuong;
	private double luongCB ;
	private double luong;
	
	
	public String getMaNV() {
		return maNV;
	}
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	public String getNganhNghe() {
		return nganhNghe;
	}
	public void setNganhNghe(String nganhNghe) {
		this.nganhNghe = nganhNghe;
	}
	public double getHeSoLuong() {
		return heSoLuong;
	}
	public void setHeSoLuong(double heSoLuong) {
		this.heSoLuong = heSoLuong;
	}
	public double getLuongCB() {
		return luongCB;
	}
	public void setLuongCB(double luongCB) {
		this.luongCB = luongCB;
	}
	public double getLuong() {
		return luong;
	}
	public void setLuong(double luong) {
		this.luong = luong;
	}
	public double luong() {
		return luongCB*heSoLuong;
	}
	public NhanSu() {
		
	}
	
	public NhanSu(String hoTen,String gioiTinh, String ngaySinh,String cCCD,String maNV, String nganhNghe, double heSoLuong, double luongCB, double luong) {
		super(hoTen,gioiTinh,ngaySinh,cCCD);
		this.maNV = maNV;
		this.nganhNghe = nganhNghe;
		this.heSoLuong = heSoLuong;
		this.luongCB = luongCB;
		this.luong = luong;
	}
	@Override
	public void Input() {
		System.out.println("Nhap ho ten : ");
		hoTen = scan.nextLine();
		System.out.println("Gioi tinh : ");
		gioiTinh = scan.nextLine();
		System.out.println("Ngay sinh : ");
		ngaySinh = scan.nextLine();
		System.out.println("So CCCD : ");
		cCCD = scan.nextLine();
		System.out.println("Nhap ma nhan vien : ");
		maNV = scan.nextLine();
		System.out.println("Nhap nganh nghe : ");
		nganhNghe = scan.nextLine();
		System.out.println("He so luong : ");
		heSoLuong = scan.nextDouble();
		System.out.println("Luong co ban : ");
		luongCB = scan.nextDouble();
	}
	@Override
	public void Output() {
		System.out.println(hoTen +", "+ gioiTinh +", " + ngaySinh + ", " + cCCD + ", "+ maNV + ", "+ nganhNghe + ", " + heSoLuong + ", " + luongCB + ", "+ luongCB*heSoLuong);
	}
	@Override
	public void nhapHSLuong() {
		// TODO Auto-generated method stub
		System.out.println("nhap he so luong : ");
		heSoLuong = Double.parseDouble(scan.nextLine());
	}
	@Override
	public double hienHSLuong() {
		// TODO Auto-generated method stub
		return heSoLuong;
	}
}
