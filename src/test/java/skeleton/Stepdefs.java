package skeleton;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.Map;

import static org.junit.Assert.assertEquals;

public class Stepdefs {
    Checkout checkout = new Checkout();

    @When("^I sell (\\d+) (\\w+)$")
    public void i_sell_espressos(int quantity, String product) throws Throwable {
        checkout.updateTotal(product, quantity);
    }

    @Then("^the total should be £(\\d+)$")
    public void the_total_should_be_£(int total) throws Throwable {
        assertEquals(checkout.getTotal(), total);
    }

    @Given("^the following products$")
    public void the_following_products(Map<String, Integer> products) throws Throwable {
        checkout.setPrices(products);
    }
}