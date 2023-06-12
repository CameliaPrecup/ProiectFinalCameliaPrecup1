package testCase;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.BasePage;
import pages.FirstPage;
import pages.LeftSideBar;
import pages.LoginPage;

import java.time.Duration;

public class LeftSideBarTestCases extends BasePage {

    private LeftSideBar leftSideBar;

    @BeforeMethod

    public void setUp() {
        super.setUp();

        leftSideBar = new LeftSideBar(driver);


    }

    @Test
    public void goToLeftSideButtonElement()throws InterruptedException {
        leftSideBar.leftButtonElement();
        Assert.assertTrue(driver.getPageSource().contains("Elements"));

    }

    @Test
    public void goToTextBtn()throws InterruptedException{
        leftSideBar.leftButtonElement();
        leftSideBar.btnTextBox();
        Assert.assertTrue(driver.getPageSource().contains("Text Box"));
    }

    @Test
    public void fullNameField()throws InterruptedException{
        leftSideBar.fillUserName("Camelia Precup");
        Assert.assertTrue(driver.getPageSource().contains("Full Name"));

    }
    @Test
    public void emailAddressField()throws InterruptedException{
        leftSideBar.emailAddress("cameliap@example.com");
        Assert.assertTrue(driver.getPageSource().contains("Email"));
    }
    @Test
    public void currentAddressField()throws InterruptedException{
        leftSideBar.setCurrentAddress("Cluj");
        Assert.assertTrue(driver.getPageSource().contains("Current Address"));
    }
    @Test
    public void permanentAddress()throws InterruptedException{
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        leftSideBar.setPermanentAddress("ClujNapoca");

        Assert.assertTrue(driver.getPageSource().contains("Permanent Address"));
    }
    @Test
    public void submitButton()throws InterruptedException{
        leftSideBar.setSubmitBtn();
        Assert.assertTrue(driver.getPageSource().contains("Submit"));
    }

}
