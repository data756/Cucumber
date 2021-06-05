package stepDefinitions;

import classfiles.Product;
import classfiles.SearchPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class SearchSteps {

	Product product;
	SearchPage searchPage;

	@Given("I have a search	field on Amazon page")
	public void i_have_a_search_field_on_amazon_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("I am on Search Page");
	}

	@When("^I search for the product with name \"([^\"]+)\" and Price is (\\d+)$")
	public void i_search_for_the_product_with_name_and_price_is(String productName, Integer price) {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("The product is " + productName + " and " + price);
		product = new Product(productName, price);
		
	}

	@Then("product with name {string} should be displayed.")
	public void product_with_name_should_be_displayed(String productName) {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("The product name from the search page is " + productName);

		searchPage = new SearchPage();
		String searchPageName=searchPage.displayProduct(product);
		System.out.println("Product name is "+ searchPageName);
		Assert.assertEquals(product.getProductName(), searchPageName);
	}
}
