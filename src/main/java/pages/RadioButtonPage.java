package pages;
import  org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RadioButtonPage extends BasePage {
    public RadioButtonPage(WebDriver driver){
        super(driver);
    }


    By ButtonElement = By.cssSelector("div:nth-of-type(1) > .group-header > .header-wrapper > .header-text");

    By RadioBthn = By.xpath("//div[@id='app']/div[@class='body-height']/div[@class='container playgound-body']//div[@class='accordion']/div[1]/div/ul[@class='menu-list']/li[3]/span[@class='text']");

    By YesBtn = By.xpath("//div[@id='app']/div[@class='body-height']/div[@class='container playgound-body']/div[@class='row']/div[2]/div[2]/div[2]/label[@class='custom-control-label']");

    By ImpressiveBtn = By.cssSelector("[for='impressiveRadio']");

    By NoBtn = By.cssSelector("[for='noRadio']");

    public void leftButtonElement(){driver.findElement(ButtonElement).click();
        driver.manage().window().maximize();

    }

    public void setRadioBthn(){
        driver.findElement(RadioBthn).click();
    }

    public void istheYesBtn(){
        driver.findElement(YesBtn).click();
    }

    public void istheImpressiveBtn(){
        driver.findElement(ImpressiveBtn).click();
    }

    public void istheNoBtn(){
        WebDriverWait NoBtn = new WebDriverWait(driver, Duration.ofSeconds(20));
        NoBtn.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[for='noRadio']"))).click();
    }







}
