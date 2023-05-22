package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FirsPage extends BasePage {

    public FirsPage(WebDriver driver){
        super(driver);
    }

    By UserNameField = By.id("userName");

    By PasswordField = By.id("password");

    By ButtonLogin = By.id("login");

    //Methods to fill the text fields and click required buttons for setting up the new user

    public void selectUserNameField(String arg1){
        driver.findElement(UserNameField).sendKeys(arg1);
    }
    public void selectPasswordField(String arg2){
        driver.findElement(PasswordField).sendKeys(arg2);}
    public void clickOnLoginButton(){driver.findElement(ButtonLogin).click();}





}
