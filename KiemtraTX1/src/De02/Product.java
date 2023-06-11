package De02;
import java.util.*;
public class Product {
	protected String id;
	protected String name;
	protected double price;
	protected int total;
	public Product() {
		
	}
	public Product(String id, String name, double price, int total) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.total = total;
	}
	public void Input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap ma : ");
		id = scan.nextLine();
		System.out.println("Nhap ten : ");
		name = scan.nextLine();
		System.out.println("Nhap gia : ");
		price = scan.nextDouble();
		System.out.println("Nhap so luong : ");
		total = scan.nextInt();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public String toString() {
		return 
	}
}
