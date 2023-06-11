package De01;
import java.util.*;
import java.io.Serializable;
public class SinhVien implements Serializable{
	private String hoTen;
	private String maSV;
	private String gioiTinh;
	private int namSinh;
	public SinhVien() {
		
	}

	public SinhVien(String hoTen, String maSV, String gioiTinh, int namSinh) {
		this.hoTen = hoTen;
		this.maSV = maSV;
		this.gioiTinh = gioiTinh;
		this.namSinh = namSinh;
	}

	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getMaSV() {
		return maSV;
	}
	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}
	public String getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public int getNamSinh() {
		return namSinh;
	}
	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma sinh vien: ");
        String maSV = sc.nextLine();
		System.out.print("Nhap ho ten: ");
        String hoTen = sc.nextLine();
        System.out.print("Nhap gioi tinh: ");
        String gioiTinh = sc.nextLine();
        System.out.print("Nhap nam sinh: ");
        int namSinh = sc.nextInt();
	}
	
	@Override
    public String toString() {
        return String.format("%-20s %-20s %-20s %-20d", maSV, hoTen, gioiTinh, namSinh);
    }

	
}
