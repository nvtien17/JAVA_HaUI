package De01;
import java.util.*;
public class RunMain {

	private static final MobileManagerImpl MBI = new MobileManagerImpl();
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("\t\t MENU QUAN LY SAN PHAM");
			System.out.println("1.Them mot san pham di dong vao kho");
			System.out.println("2.Hien thi danh sach san pham");
			System.out.println("3.Sua san pham trong kho");
			System.out.println("4.Xoa san pham trong kho");
			System.out.println("5.Tim kiem san pham theo ten");
			System.out.println("6.Sap xep san pham theo gia");
			System.out.println("7.Thoat chuong trinh");
			System.out.println("Moi ban chon chuc nang : ");
			int choose = scan.nextInt();
			switch(choose) {
				case 1:
					Mobile newMb = new Mobile();
					newMb.inputProduct();
					newMb.inputMobile();
					boolean add = MBI.addMobile(newMb);
					if(add) 
						System.out.println("Them thanh cong!");
					else
						System.out.println("Them that bai!");
					break;
				case 2:
					System.out.println("\t\tDANH SACH SAN PHAM");
					MBI.printAll();
					break;
				case 3:
					Mobile updateMB = new Mobile();
					updateMB.inputProduct();
					updateMB.inputMobile();
					boolean update = MBI.editMobile(updateMB);
					if(update) {
						System.out.println("Sua thanh cong!");
					}
					else {
						System.out.println("Sua khong thanh cong!");
					}
					break;
				case 4:
					System.out.println("Nhap ma san pham can xoa : ");
					Mobile delMB = new Mobile();
					scan.nextLine();
					delMB.setProduct_Id(scan.nextLine());
					boolean delete = MBI.delMobile(delMB);
					if(delete) {
						System.out.println("Xoa thanh cong!");
					}
					else {
						System.out.println("Xoa khong thanh cong!");
					}
					break;
				case 5:
					scan.nextLine();
					System.out.println("Nhap ten san pham can tim : ");
					String name = scan.nextLine();
					List<Mobile> mobile = MBI.searchMobile(name);
					System.out.println("\t\tThong tin san pham tim duoc");
					System.out.println(mobile);
					break;
				case 6:
					List<Mobile> result = MBI.sortedMobile(0);
					System.out.println(result);
					break;
				case 7:
					System.exit(0);
					break;
				default:
					System.out.println("Moi ban nhap lai chuc nang");
					break;
			}
		}while(true);
	}

}
