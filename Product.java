import java.util.Scanner;

public class Product {
	String productName;
	int price;
	int stock;
	Scanner scn = new Scanner(System.in);
	
	public Product(String productName, int price, int stock) {
		this.productName = productName;
		this.price = price;
		this.stock = stock;
	}
	
	public boolean sellProduct(int num) {
		if(this.stock>=num) {
			this.stock-=num;
			return true;}
		else
			return false;	
	}
}
