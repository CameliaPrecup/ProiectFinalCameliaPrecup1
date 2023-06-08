package testCase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.BasePage;
import pages.BookshopPage;
import pages.LoginPage;
import org.openqa.selenium.JavascriptExecutor;

import java.time.Duration;


public class BookshopPageCases extends BasePage {

    private BookshopPage bookshopPage;
    private LoginPage loginPage;

    JavascriptExecutor js = (JavascriptExecutor) driver;

    @BeforeMethod

    public void setUp() {
        super.setUp();
        bookshopPage = new BookshopPage(driver);
        loginPage = new LoginPage(driver);

    }

    @Test

    public void login() throws InterruptedException {
        loginPage.login("cameliaP", "T&st1234");
        Assert.assertFalse(driver.getPageSource().contains("Log out"));

    }

    @Test

    public void addfirstbook() throws InterruptedException {
        loginPage.login("cameliaP", "T&st1234");
        driver.manage().window().maximize();
        bookshopPage.addfirstTitle();
        Assert.assertTrue(driver.getPageSource().contains("Book Store"));
    }

    @Test
    public void addBookToCollection() throws InterruptedException {
        loginPage.login("cameliaP", "T&st1234");
        driver.manage().window().maximize();
        bookshopPage.addfirstTitle();
        WebDriverWait btn = new WebDriverWait(driver, Duration.ofSeconds(50));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        btn.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".fullButton.text-right > button#addNewRecordButton"))).click();
        WebDriverWait popup = new WebDriverWait(driver, Duration.ofSeconds(50));
        popup.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();

        Assert.assertTrue(driver.getPageSource().contains("9781449325862"));


    }

    @Test

    public void clickonPopUp() throws InterruptedException {
        loginPage.login("cameliaP", "T&st1234");
        driver.manage().window().maximize();
        bookshopPage.addfirstTitle();
        WebDriverWait btn = new WebDriverWait(driver, Duration.ofSeconds(50));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        btn.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".text-left .btn-primary"))).click();
        WebDriverWait popup = new WebDriverWait(driver, Duration.ofSeconds(100));
        popup.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();




    }


    }















