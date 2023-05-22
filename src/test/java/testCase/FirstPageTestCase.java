package testCase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.BasePage;
import pages.FirsPage;

public class FirstPageTestCase extends BasePage {

    private FirsPage firstPage;

    @BeforeMethod

    public void setUp() {
        super.setUp();
        firstPage = new FirsPage(driver);
    }

    @Test
    public void gotoButtonLogin() throws InterruptedException {
        firstPage.clickOnLoginButton();
    }

    @Test
    public void loginDetailsandclickLoginButton() throws InterruptedException {
        firstPage.selectUserNameField("cameliaP");
        firstPage.selectPasswordField("T&st1234");
        firstPage.clickOnLoginButton();
        Assert.assertTrue(driver.getPageSource().contains("cameliaP"));
        Assert.assertTrue(driver.getPageSource().contains("T&st1234"));

    }

}


