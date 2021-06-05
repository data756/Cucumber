package classfiles;

import java.util.List;

public class SearchPage {
	
	public String displayProduct(Product product) {
		List<String> productList=product.getProductList();
		if(productList.contains(product.getProductName())) {
			System.out.println(productList.get(0));
			return product.getProductName();
		}
		else {
			return null;
		}
	}

}
