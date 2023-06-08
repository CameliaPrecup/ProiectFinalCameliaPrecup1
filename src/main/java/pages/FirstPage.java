package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FirstPage extends BasePage {

    private LoginPage loginPage;

    public FirstPage(WebDriver driver){
        super(driver);
        loginPage = new LoginPage(driver);
    }

    By UserNameField = By.id("userName");

    By PasswordField = By.id("password");

    By ButtonLogin = By.id("login");

    By SearchField = By.id("searchBox-wrapper");

    By InputSearch = By.id("searchBox");

    By BtnBacktoBookStore = By.id("addNewRecordButton");

    By Logout = By.id("submit");

    By BookStore = By.cssSelector("#item-2 > span");

    By FirstTitle = By.id("see-book-Git Pocket Guide");

    By FirstItem = By.xpath("//span[@id='see-book-Git Pocket Guide']/a[@href='/books?book=9781449325862']");







    //Methods to fill the text fields and click required buttons for setting up the new user

    public void setFirstItemafterlogin() {
        driver.findElement(FirstItem).click();
    }

    public void selectUserNameField(){
        driver.findElement(UserNameField).click();
    }
    public void sendKeysToUserNameField(String arg1){
        WebElement userNameField = driver.findElement(UserNameField);
        userNameField.sendKeys(arg1);

    }


    public void clickOnLoginButton(){
        driver.findElement(ButtonLogin).click();
    }

    public void selectSearchField(){
        driver.findElement(SearchField).click();
    }

    public void inputSearchField(String arg3) {
        driver.findElement(InputSearch).sendKeys(arg3);
    }



    public void logOut (){
        WebDriverWait Logout = new WebDriverWait(driver, Duration.ofSeconds(10));
       Logout.until(ExpectedConditions.visibilityOfElementLocated(By.id("submit"))).click();

    }


    public void clickonFirstItem(){
        driver.findElement(FirstTitle).click();
    }









}
