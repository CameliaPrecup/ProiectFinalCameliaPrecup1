package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class LeftSideBar extends BasePage{

    public LeftSideBar(WebDriver driver){
        super(driver);

    }

    By ButtonElement = By.cssSelector(".accordion .element-group:nth-of-type(1) .header-text");

    By TextBoxBtn = By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[1]/span");


    By TextBoxFullName = By.id("userName");

    By EmailField = By.id("userEmail");

    By CurrentAddress = By.id("currentAddress");

    By PermanentAddress = By.id("permanentAddress");

    By SubmitBtn = By.id("submit");






    public void leftButtonElement(){driver.findElement(ButtonElement).click();
        driver.manage().window().maximize();
    }

    public void btnTextBox(){
        WebDriverWait Btn = new WebDriverWait(driver, Duration.ofSeconds(100));
        Btn.until(ExpectedConditions.elementToBeClickable(TextBoxBtn)).click();


    }
    public void fillUserName(String fullname){
        driver.findElement(ButtonElement).click();
        driver.manage().window().maximize();
        WebDriverWait Btn = new WebDriverWait(driver, Duration.ofSeconds(25));
        Btn.until(ExpectedConditions.elementToBeClickable(TextBoxBtn)).click();
        driver.findElement(TextBoxFullName).click();
        driver.findElement(TextBoxFullName).sendKeys(fullname);

    }

    public void emailAddress(String Email){
        driver.findElement(ButtonElement).click();
        driver.manage().window().maximize();
        WebDriverWait Btn = new WebDriverWait(driver, Duration.ofSeconds(25));
        Btn.until(ExpectedConditions.elementToBeClickable(TextBoxBtn)).click();
        driver.findElement(EmailField).click();
        driver.findElement(EmailField).sendKeys(Email);

    }

    public void setCurrentAddress(String Adresa){
        driver.findElement(ButtonElement).click();
        driver.manage().window().maximize();
        WebDriverWait Btn = new WebDriverWait(driver, Duration.ofSeconds(30));
        Btn.until(ExpectedConditions.elementToBeClickable(TextBoxBtn)).click();
        driver.findElement(CurrentAddress).click();
        driver.findElement(CurrentAddress).sendKeys(Adresa);

    }

    public void setPermanentAddress(String permanentAddress){
        driver.manage().window().maximize();
        driver.findElement(ButtonElement).click();
        WebDriverWait Btn = new WebDriverWait(driver, Duration.ofSeconds(35));
        Btn.until(ExpectedConditions.elementToBeClickable(TextBoxBtn)).click();
        driver.findElement(PermanentAddress).click();
        driver.findElement(PermanentAddress).sendKeys(permanentAddress);

    }
    public void setSubmitBtn(){
        driver.manage().window().maximize();
        driver.findElement(ButtonElement).click();
        driver.findElement(TextBoxBtn).click();
        driver.findElement(TextBoxFullName).sendKeys("Camelia Precup");
        driver.findElement(EmailField).sendKeys("cameliap@example.com");
        driver.findElement(CurrentAddress).sendKeys("Cluj");
        driver.findElement(PermanentAddress).sendKeys("Cluj Napoca");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)");
        driver.findElement(SubmitBtn).click();

    }









}
