package classfiles;

import java.util.ArrayList;
import java.util.List;

public class Product {

	private String productName;
	private int price;
	
	public Product(String productName, int price) {
		this.price=price;
		this.productName=productName;	
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public List<String> getProductList(){
		System.out.println("Running getProductList method");
		List<String> productList= new ArrayList<>();
		productList.add(" Predator 300 ");
		productList.add("product 2");
		productList.add("product 3");
		System.out.println(productList.get(0));
		return productList;
	}
	
}
