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

import java.time.Duration;


public class BookshopPageCases extends BasePage {

    private BookshopPage bookshopPage;
    private LoginPage loginPage;

    @BeforeMethod

    public void setUp() {
        super.setUp();
        bookshopPage = new BookshopPage(driver);
        loginPage = new LoginPage(driver);

    }

    @Test

    public void firstBook() throws InterruptedException {
        loginPage.login("cameliaP","T&st1234");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("see-book-Git Pocket Guide")));
        driver.findElement(By.id("see-book-Git Pocket Guide")).click();
    }

    @Test

    public void addNewBook() throws InterruptedException {
        loginPage.login("cameliaP","T&st1234");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("see-book-Git Pocket Guide")));
        driver.findElement(By.id("see-book-Git Pocket Guide")).click();
        WebDriverWait button = new WebDriverWait(driver, Duration.ofSeconds(10));
        button.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div[9]/div[2]/button"))).click();





    }

}
