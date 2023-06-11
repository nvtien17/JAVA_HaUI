package De04;
import java.util.*;
public class Main {
	static Scanner scan = new Scanner(System.in);
	private static List<SinhVien> list = new ArrayList<>();
	public static void main(String[] args) {
		do {
			System.out.println("\t\t CHUONG TRINH QUAN LY SINH VIEN");
			System.out.println("1. Nhap danh sach sinh vien");
			System.out.println("2. Hien thi danh sach sinh vien");
			System.out.println("3. Tim kiem sinh vien");
			System.out.println("4. Sap xep sinh vien theo diem trung binh tang dan");
			System.out.println("5. Thoat chuong trinh");
			System.out.println("Moi ban chon chuc nang : ");
			int choose = scan.nextInt();
			switch(choose) {
				case 1 :
					NhapSV();
					break;
				case 2 :
					System.out.println("\t\t----DANH SACH SINH VIEN-------");
					HienThi();
					break;
				case 3 :
					TimKiem();
					break;
				case 4 :
					SapXep();
					break;
				case 5 :
					System.out.println("Ban da thoat chuong trinh!");
					System.exit(0);
					break;
				default:
					System.out.println("Moi ban chon lai chuc nang : ");
					break;
			}
		}while(true);
	}
	public static void NhapSV() {
		System.out.println("Nhap so sinh vien n = ");
		int n = scan.nextInt();
		do {
			if(n<0)
				System.out.println("Nhap gia tri n > 0 :");
			else {
				for(int i = 0; i < n; i++) {
					SinhVien sv = new SinhVien();
					System.out.println("Nhap sinh vien thu "+ (i+1));
					sv.Input();
					list.add(sv);
				}
			}
		}while(n<0);
	}
	public static void HienThi() {
		System.out.format("%-10s %-10s %-10s %-10s", "Ho ten", "Gioi tinh", "Ngay sinh", "CCCD");
		System.out.format("%-10s %-10s %-10s %-10s %-10s", "Ma SV", "Nganh Nghe", "Diem mon 1", "Diem mon 2", "Diem mon 3");
		System.out.println();
		for(var i : list) {
			i.Output();
		}
	}
	public static void TimKiem() {
		boolean flag = false;
		scan.nextLine();
		System.out.println("Nhap ten sinh vien muon tim kiem : ");
		String name = scan.nextLine();
		for(var i : list) {
			if(i.getHoTen().equals(name)) {
				flag = true;
				break;
			}
		}
		if(!flag) {
			System.out.println("Khong co sinh vien nao co ten "+ name);
		}else {
			System.out.println("Thong tin sinh vien tim duoc");
			for(var i : list) {
				if(i.hoTen.equals(name))
					i.Output();
			}
		}
	}
	public static void SapXep() {
		Collections.sort(list, (i1 , i2) -> Double.compare(i1.getDiem().getDiemTB(), i2.getDiem().getDiemTB()));
//		{
//			@Override
//			public int compare(SinhVien sv1, SinhVien sv2) {
//				double diem1 = sv1.getDiem().getDiemTB();
//				double diem2 = sv2.getDiem().getDiemTB();	
//				if(diem1 < diem2) {
//					return -1;
//				}
//				else if(diem1 > diem2) {
//					return 1;
//				}
//				return 0;
//			}
//		});
				HienThi();
	}
}
