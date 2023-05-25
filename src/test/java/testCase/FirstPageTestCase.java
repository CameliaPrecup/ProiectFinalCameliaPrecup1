package testCase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.BasePage;
import pages.FirstPage;
import pages.LoginPage;

import java.time.Duration;


public class FirstPageTestCase extends BasePage {

    private FirstPage firstPage;
    private LoginPage loginPage;

    @BeforeMethod

    public void setUp() {
        super.setUp();
        firstPage = new FirstPage(driver);
        loginPage = new LoginPage(driver);

    }

    @Test
    public void goToSearchField() {
        firstPage.selectSearchField();
    }

    @Test
    public void writeIntoSearchField() throws InterruptedException {
        firstPage.selectSearchField();
        firstPage.inputSearchField("Git Pocket Guide");
    }

    @Test
    public void nonExistentSearch() throws InterruptedException {
        firstPage.selectSearchField();
        firstPage.inputSearchField("Learn Selenium");
        WebElement element = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/div[6]/div/div[3]" +
                ""));
        Assert.assertTrue(driver.getPageSource().contains("No rows found"));

    }


    @Test
    public void gotoButtonLogin() throws InterruptedException {
        firstPage.clickOnLoginButton();
    }

    @Test
    public void gotoUserNameField() throws InterruptedException {
        firstPage.clickOnLoginButton();
        firstPage.selectUserNameField();
        firstPage.sendKeysToUserNameField("cameliaP");
        Assert.assertTrue(driver.getPageSource().contains("cameliaP"));

    }
    @Test
    public void LogOut() throws InterruptedException{
        loginPage.login("cameliaP", "T&st1234");
        firstPage.logOut();
    }

    @Test
    public void selectFirstItem()throws InterruptedException{
        firstPage.clickonFirstItem();

    }
    @Test
    public void returnToBookStore()throws InterruptedException{
        firstPage.clickonFirstItem();
        WebDriverWait Btnn = new WebDriverWait(driver,Duration.ofSeconds(20));
        Btnn.until(ExpectedConditions.presenceOfElementLocated(By.name("Back To Book Store"))).click();
    }


    @Test
    public void clickOnGoToBookStoreMenu() throws InterruptedException{
        loginPage.login("cameliaP", "T&st1234");
        firstPage.logOut();
        WebDriverWait Button = new WebDriverWait(driver,Duration.ofSeconds(10));
        Button.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[6]/div/ul/li[2]/span"))).click();
    }

}


