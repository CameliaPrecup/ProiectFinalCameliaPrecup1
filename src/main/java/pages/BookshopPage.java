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


    By FirstTitle = By.id("see-book-Git Pocket Guide");

    By SearchBox = By.id("searchBox");

    By AddToYourCollection = By.cssSelector(".fullButton.text-right > button#addNewRecordButton");

    By DeleteOk = By.id("closeSmallModal-ok");

    By CancelDelete = By.id("closeSmallModal-cancel");

    By BackToBookStore = By.id(".text-left .btn-primary");

    By ProfileButton = By.id("item-3");





    By GoToStoreBtn = By.cssSelector("button#addNewRecordButton");

    By DeleteAccount = By.id("submit");

    public void addfirstTitle(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("see-book-Git Pocket Guide")));
        driver.findElement(By.id("see-book-Git Pocket Guide")).click();
    }




}







