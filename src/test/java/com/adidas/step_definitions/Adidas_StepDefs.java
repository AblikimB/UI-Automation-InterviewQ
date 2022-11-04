package com.adidas.step_definitions;

import com.adidas.pages.AdidasPage;
import com.adidas.pages.BasePage_Adidas;
import com.adidas.utilities.BrowserUtils;
import com.adidas.utilities.ConfigurationReader;
import com.adidas.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;


public class Adidas_StepDefs extends BasePage_Adidas {

    AdidasPage adidasPage = new AdidasPage();
    BasePage_Adidas basePage_adidas = new BasePage_Adidas();

    @Given("Customer navigation through product categories: Phones, Laptops and Monitors")
    public void customer_navigation_through_product_categories_phones_laptops_and_monitors() {
        Driver.getDriver().get(ConfigurationReader.getProperty("shop"));

    }

    @When("Navigate to {string} → {string} and click on Add to cart. Accept pop up confirmation.")
    public void navigate_to_and_click_on_add_to_cart_accept_pop_up_confirmation(String category, String product) {

        basePage_adidas.selectProduct(category, product);
        adidasPage.addToCartBtn.click();
        BrowserUtils.waitFor(3);
        Alert alert = Driver.getDriver().switchTo().alert();
        alert.accept();

    }

    @And("Navigate to homePage → {string} → {string} and click on Add to cart. Accept pop up confirmation.")
    public void navigateToHomePageAndClickOnAddToCartAcceptPopUpConfirmation(String category, String product) {
        basePage_adidas.homeButton.click();
        basePage_adidas.selectProduct(category, product);
        adidasPage.addToCartBtn.click();
        BrowserUtils.waitFor(3);
        Alert alert = Driver.getDriver().switchTo().alert();
        alert.accept();
    }

    @When("Navigate to Cart → Delete {string} from cart.")
    public void navigate_to_cart_delete_from_cart(String product) {
        basePage_adidas.deleteFromCart(product);

    }

    @When("Click on Place order.")
    public void click_on_place_order() {
        BrowserUtils.waitFor(2);
        adidasPage.placeOrder.click();
    }

    @And("User enters {string} to name")
    public void userEntersToName(String name) {
        adidasPage.nameInput.sendKeys(name);
    }

    @And("User enters {string} to country")
    public void userEntersToCountry(String country) {
        adidasPage.countryInput.sendKeys(country);
    }

    @And("user enters {string} to city")
    public void userEntersToCity(String city) {
        adidasPage.cityInput.sendKeys(city);
    }

    @And("User enters {string} to cardNumber")
    public void userEntersToCardNumber(String cardNumber) {
        adidasPage.cardInput.sendKeys(cardNumber);
    }

    @And("User enters {string} to month")
    public void userEntersToMonth(String month) {
        adidasPage.monthInput.sendKeys(month);
    }

    @And("User enters {string} to year")
    public void userEntersToYear(String year) {
        adidasPage.yearInput.sendKeys(year);
    }


    @When("Click on Purchase")
    public void click_on_purchase() {
        // Write code here that turns the phrase above into concrete actions
        BrowserUtils.waitFor(1);
        adidasPage.purchaseButton.click();
    }

    @When("Capture and log purchase Id and Amount.")
    public void capture_and_log_purchase_id_and_amount() {
        // Write code here that turns the phrase above into concrete actions
        BrowserUtils.waitFor(2);
        String text = adidasPage.confirmationMessage.getText();
      //  System.out.println(text);
       String idText = text.substring(0,text.indexOf('A'));
       // System.out.println(idText);
        String amountText = text.substring(text.indexOf('A'),text.indexOf('D')+1);
      //  System.out.println(amountText);
    }

    @When("Assert purchase amount equals expected.")
    public void assert_purchase_amount_equals_expected() {
        // Write code here that turns the phrase above into concrete actions
        String text = adidasPage.confirmationMessage.getText();
        String expectedAmount = "Amount: 790 USD";
        String actualAmount = text.substring(text.indexOf('A'),text.indexOf('D')+1);
        System.out.println(actualAmount);

       Assert.assertEquals(expectedAmount,actualAmount);
    }

    @Then("Click on Ok")
    public void click_on_ok() {
        // Write code here that turns the phrase above into concrete actions
        adidasPage.okButton.click();
    }


    @And("user enters name {string}")
    public void userEntersName(String arg0) {
        adidasPage.nameInput.sendKeys(arg0);
    }

    @And("user enters country {string}")
    public void userEntersCountry(String arg0) {
        adidasPage.countryInput.sendKeys(arg0);
    }

    @And("user enters cityName {string}")
    public void userEntersCityName(String arg0) {
        adidasPage.cityInput.sendKeys(arg0);
    }

    @And("user enters creditCard number {string}")
    public void userEntersCreditCardNumber(String arg0) {
        adidasPage.cardInput.sendKeys(arg0);
    }

    @And("user enters month {string}")
    public void userEntersMonth(String arg0) {
        adidasPage.monthInput.sendKeys(arg0);
    }

    @And("user enters year {string}")
    public void userEntersYear(String arg0) {
        adidasPage.yearInput.sendKeys(arg0);
    }
}
