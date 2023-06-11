package De02;
import java.util.*;
import java.io.*;
public class Main {
	static List<Sach> list = new ArrayList<>();
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		do {
			System.out.println("\t\tCHUONG TRINH QUAN LY THU VIEN");
			System.out.println("1. Nhap");
			System.out.println("2. Hien thi");
			System.out.println("3. Sap xep");
			System.out.println("4. Tim kiem");
			System.out.println("5. Thoat");
			System.out.println("Moi ban chon chuc nang : ");
			int choose = scan.nextInt();
			switch(choose) {
				case 1:
					Nhap();
					break;
				case 2:
					HienThi();
					break;
				case 3:
					SapXep();
					break;
				case 4:
					TimKiem();
					break;
				case 5:
					System.out.println("Ban da thoat chuong trinh!");
					System.exit(0);
					break;
				default:
					System.out.println("Moi ban chon lai chuc nang!");
					break;
			}
		}while(true);
	}
	public static void Nhap() {
		int n;
		System.out.println("Nhap so luong sach : ");
		do {
			n = scan.nextInt();
			if(n<=0) {
				System.out.println("Nhap lai so luong (n > 0) :");
			}
		}while(n<=0);
		for(int i = 0; i< n; i++) {
			System.out.println("Nhap cuon sach thu "+(i+1));
			Sach book = new Sach();
			book.Input();
			list.add(book);
		}
		WriteFile();
	}
	public static void HienThi() {
		if(list.isEmpty()) {
			System.out.println("Danh sach sach rong!");
		}else {
			System.out.format("%-20s %-20s %-20s %-20s %-20s","Ma sach","Ten sach","Tac gia","Nha XB","Nam XB");
			System.out.println();
		}
		ReadFile();
	}
	public static void TimKiem() {
		System.out.println("Nhap ma sach muon tim kiem : ");
		scan.nextLine();
		String key = scan.nextLine();
		boolean flag = false;
		for(var i : list) {
			if(i.getId().equals(key)) {
				flag = true;
			}
		}
		if(!flag) {
			System.out.println("Khong co cuon sach nao co ma "+ key);
		}else {
			System.out.println("\t\tTHONG TIN CUON SACH");
			System.out.format("%-20s %-20s %-20s %-20s %-20s","Ma sach","Ten sach","Tac gia","Nha XB","Nam XB");
			System.out.println();
			for(var i : list) {
				if(i.getId().equals(key)) {
					System.out.println(i);
				}
			}
		}
	}
	public static void SapXep() {
		Collections.sort(list, (x, y) -> Integer.compare(x.getNamXB(), y.getNamXB()));
		System.out.println("\t\t DANH SACH SACH SAP XEP TANG DAN THEO NAM XB");
		System.out.format("%-20s %-20s %-20s %-20s %-20s","Ma sach","Ten sach","Tac gia","Nha XB","Nam XB");
		System.out.println();
		for(var i : list) {
			System.out.println(i);
		}
	}
	public static void WriteFile() {
		try {
			FileOutputStream fos = new FileOutputStream("book.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(list);
			oos.close();
			fos.close();
			System.out.println("Luu du lieu vao tep thanh cong!");
		}catch(IOException e) {
			System.out.println("Luu du lieu that bai "+ e.getMessage());
		}
	}
	public static void ReadFile() {
		try {
			FileInputStream fis = new FileInputStream("book.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			while(fis.available()>0) {
				list = (ArrayList<Sach>) ois.readObject();
				for(var i : list) {
					System.out.println(i);
				}
			}
			ois.close();
			fis.close();
			System.out.println("Doc du lieu thanh cong!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
