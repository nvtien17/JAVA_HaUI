package De01;
import java.util.*;
public class Mobile extends Product{
	 private String producer;
	 private String type;

	 public Mobile() {
		 
	 }
	public Mobile(String producer, String type) {
		this.producer = producer;
		this.type = type;
	}
	public Mobile(String product_Id, String product_name, double product_price, int product_total, String producer, String type) {
		super(product_Id, product_name, product_price, product_total);
		this.producer = producer;
		this.type = type;
	}
	public void inputMobile() {
		    Scanner sc = new Scanner(System.in);
		    System.out.print("Nhap nha san xuat: ");
		    producer = sc.nextLine();
		    System.out.print("Nhap loai di dong: ");
		    type = sc.nextLine();
	}
	public String getProducer() {
		return producer;
	}
	public void setProducer(String producer) {
		this.producer = producer;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override 
	public String toString() {
		return "Mobile{ id = "+ product_Id + ", name = " + product_name + ", price = " + product_price + ", total = " + product_total 
				+ ", producer = "+ producer + ", type = " + type + "}";
	}
}
