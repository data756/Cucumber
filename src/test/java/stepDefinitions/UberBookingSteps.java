package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UberBookingSteps {

	@Given("User wants to select a car type from {string} from Uber App")
	public void user_wants_to_select_a_car_type_from_from_uber_app(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println(" step 1");
	}

	@When("user select car {string} and pick up point {string} and drop location is {string}")
	public void user_select_car_and_pick_up_point_and_drop_location_is(String carType, String pickUpPoint, String dropLocation) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Step 2");
	}

	@Then("driver starts the Journey")
	public void driver_starts_the_journey() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Step 3");
	}

	@Then("Driver ends the Journey")
	public void driver_ends_the_journey() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Step 4 ");
	}

	@Then("User pays {int} USD")
	public void user_pays_usd(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Step 5");
	}
	
}
