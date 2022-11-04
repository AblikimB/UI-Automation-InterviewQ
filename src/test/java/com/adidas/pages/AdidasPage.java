package com.adidas.pages;


import com.adidas.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdidasPage {

    public AdidasPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }



    @FindBy(xpath = "//a[.='Laptops']")
    public WebElement laptops;

    @FindBy(xpath = "//a[.='Sony vaio i5']")
    public WebElement sonyVaioI5;

    @FindBy(xpath = "//a[.='Dell i7 8gb']")
    public WebElement dellI78gb;

    @FindBy(xpath = "//a[@class='btn btn-success btn-lg']")
    public WebElement addToCartBtn;

    @FindBy(xpath = "//button[normalize-space()='Place Order']")
    public WebElement placeOrder;

    @FindBy(xpath = "//input[@id='name']")
    public WebElement nameInput;

    @FindBy(xpath = "//input[@id='country']")
    public WebElement countryInput;
    @FindBy(xpath = "//input[@id='city']")
    public WebElement cityInput;
    @FindBy(xpath = "//input[@id='card']")
    public WebElement cardInput;
    @FindBy(xpath = "//input[@id='month']")
    public WebElement monthInput;
    @FindBy(xpath = "//input[@id='year']")
    public WebElement yearInput;

    @FindBy(xpath = "//button[.='Purchase']")
    public WebElement purchaseButton;

    @FindBy(xpath = "/html/body/div[10]/p")
    public WebElement confirmationMessage;

    @FindBy(xpath = "/html/body/div[10]/p/text()[2]")
    public WebElement actualAmount;

    @FindBy(xpath = "/html/body/div[10]/div[7]/div/button")
    public WebElement okButton;





    ///html/body/div[10]/p/text()[1]




}
