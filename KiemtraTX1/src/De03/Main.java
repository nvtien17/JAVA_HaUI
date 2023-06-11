package De03;
import java.util.*;
public class Main {
	private static List<NhanSu> list = new ArrayList<>();
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		do {
			System.out.println("\t\t CHUONG TRINH QUAN LY NHAN SU");
			System.out.println("1. Nhap danh sach");
			System.out.println("2. Hien thi");
			System.out.println("3. Tim kiem");
			System.out.println("4. Thoat");
			System.out.println("Moi ban nhap lua chon: ");
			int choose = Integer.parseInt(scan.nextLine());
			switch(choose) {
			case 1 : 
				nhap();
				break;
			case 2 :
				xuat();
				break;
			case 3 :
				timkiem();
				break;
			case 4: 
				System.exit(0);
				break;
			default:
				System.out.println("chon lai");
				break;
			}
		}while(true);
		
	}
	public static void nhap() {
		int n;
		System.out.println("Nhap so phan tu : ");
		n = Integer.parseInt(scan.nextLine());
		for(int i = 0; i< n ; i++) {
			NhanSu a = new NhanSu();
			a.Input();
			list.add(a);
		}
	}
	public static void xuat() {
		System.out.println("Ho ten, Gioi tinh, Ngay sinh, CCCD , Ma Nhan vien, Nganh Nghe , he So Luong , luongCB ,  luong"  );
		for(NhanSu i : list) {
			i.Output();
		}
	}
	public static void timkiem() {
		System.out.println("Nhap ten nhan su can tim : ");
		String name = scan.nextLine();
		boolean flag = false;
		for(NhanSu i : list) {
			if(i.getHoTen().equals(name)) {
				i.Output();
				flag = true;
				
			}
		}
		if(!flag) {
			System.out.println("Khong co nhan su can tim kiem");
		}
		
	}

}
