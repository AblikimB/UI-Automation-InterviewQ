package com.adidas.pages;


import com.adidas.utilities.BrowserUtils;
import com.adidas.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BasePage_Adidas {

    public BasePage_Adidas() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindAll(@FindBy(xpath = "//a[@class='list-group-item']"))
    public List<WebElement> categories;


    @FindBy(xpath = "//li[@class='nav-item active']//a[@class='nav-link']")
    public WebElement homeButton;

    @FindBy(xpath = "//a[@id='cartur']")
    public WebElement cart;




    public void selectProduct(String category, String product){
        for (WebElement each:categories) {
            if(each.getText().equals(category)){
                each.click();
            }
        }
        BrowserUtils.waitFor(3);
        Driver.getDriver().findElement(By.xpath("//a[.='" + product +"']")).click();
    }

    public void deleteFromCart(String product){
        cart.click();
        Driver.getDriver().findElement(By.xpath("//tr[@class='success']//td[.='" + product +"']/following-sibling::td[2]//a[.='Delete']")).click();

    }

}
