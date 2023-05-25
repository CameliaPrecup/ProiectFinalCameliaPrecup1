package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BookshopPage extends BasePage {

    private LoginPage loginPage;

    public BookshopPage(WebDriver driver) {
        super(driver);
        loginPage = new LoginPage(driver);
    }

    By UserNameField = By.id("userName");
    By PasswordField = By.id("password");
    By ButtonLogin = By.id("login");
    By FirstTitle = By.id("see-book-Git Pocket Guide");

    By SearchBox = By.id("searchBox");

    By AddToYourCollection = By.cssSelector("#addNewRecordButton");

    By DeleteOk = By.id("closeSmallModal-ok");

    By CancelDelete = By.id("closeSmallModal-cancel");

    By BackToBookStore = By.id("addNewRecordButton");

    By ProfileButton = By.id("item-3");


    By DeleteButton = By.id("delete-record-undefined");

    By ExtendedConfirmationButton = By.id("google_esf");

    By GoToStoreBtn = By.id("gotoStore");

    By DeleteAccount = By.id("submit");




}






