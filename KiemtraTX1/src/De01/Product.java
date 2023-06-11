package De01;
import java.util.*;
public class Product {
	protected String product_Id;
	protected String product_name;
	protected double product_price;
	protected int product_total;
	public Product() {
		
	}
	
	public Product(String product_Id, String product_name, double product_price, int product_total) {
		this.product_Id = product_Id;
		this.product_name = product_name;
		this.product_price = product_price;
		this.product_total = product_total;
	}
	 public void inputProduct() {
		    Scanner sc = new Scanner(System.in);
		    System.out.print("Nhap ma san pham: ");
		    product_Id = sc.nextLine();
		    System.out.print("Nhap ten san pham: ");
		    product_name = sc.nextLine();
		    System.out.print("Nhap gia san pham: ");
		    product_price = sc.nextDouble();
		    System.out.print("Nhap so luong: ");
		    product_total = sc.nextInt();
		  }
	public String getProduct_Id() {
		return product_Id;
	}
	public void setProduct_Id(String product_Id) {
		this.product_Id = product_Id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public double getProduct_price() {
		return product_price;
	}
	public void setProduct_price(double product_price) {
		this.product_price = product_price;
	}
	public int getProduct_total() {
		return product_total;
	}
	public void setProduct_total(int product_total) {
		this.product_total = product_total;
	}
	@Override
	public String toString() {
		return "Product{ id = "+ product_Id + ", name = " + product_name + ", price = " + product_price + ", total = "+ 
	    product_total + "}";
	}

}
