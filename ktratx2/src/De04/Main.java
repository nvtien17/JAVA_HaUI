package De04;
import java.util.*;
import java.io.*;
public class Main {
	static List<SinhVien> listSV = new ArrayList<>();
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		do {
			System.out.println("CHUONG TRINH QLSV");
			System.out.println("-----------------");
			System.out.println("1. Nhap");
			System.out.println("2. Hien thi");
			System.out.println("3. Sap xep");
			System.out.println("4. Tim kiem");
			System.out.println("5. Thoat");
			System.out.print("Chon chuc nang:");
			int choose = sc.nextInt();
			switch (choose) {
			case 1: 			
				nhap();
				break;
			case 2: 
				hienThi();
				break;
			case 3: 
				sapXep();
				break;
			case 4: 
				timKiem();
				break;
			case 5: 
				System.out.println("program exit");
				System.exit(5);
				break;
			default:
				System.out.println("khong co lua chon nay");
			}
		}while(true);
	}
	public static void WriteFile() {
		try {
			FileOutputStream fos = new FileOutputStream("Book.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(listSV);
			oos.close();
			fos.close();
			System.out.println("Luu du lieu vao tep thanh cong!");
		} catch (IOException e) {
			System.out.println("Luu du lieu that bai "+e.getMessage());
		}
	}
	public static void ReadFile() {
		try {
			FileInputStream fis = new FileInputStream("Book.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			while(fis.available()>0) {
				listSV = (ArrayList<SinhVien>) ois.readObject();
				for(var i : listSV) {
					System.out.println(i);
				}
			}
			ois.close();
			fis.close();

		}catch(FileNotFoundException e) {
			e.getStackTrace();
		}catch(Exception e) {
			e.getStackTrace();
		}
	}
}
