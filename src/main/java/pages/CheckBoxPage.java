package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CheckBoxPage extends BasePage {

    public CheckBoxPage(WebDriver driver){
        super(driver);
    }




    By ButtonElement = By.cssSelector("div:nth-of-type(1) > .group-header > .header-wrapper > .header-text");

    By CheckBox = By.id("item-1");

    By JustBox = By.cssSelector(".rct-checkbox");




    public void leftButtonElement(){driver.findElement(ButtonElement).click();
        driver.manage().window().maximize();
    }


    public void tickthatBox(){

        driver.findElement(CheckBox).click();


    }
    public void tickBox(){
        driver.findElement(JustBox).click();
    }
}
