package testCase;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.BasePage;
import pages.CheckBoxPage;
import pages.FirstPage;

public class CheckBoxTestCase extends BasePage {

    private CheckBoxPage checkBoxPage;
    @BeforeMethod

    public void setUp() {
        super.setUp();
        checkBoxPage = new CheckBoxPage(driver);
    }

    @Test
    public void setCheckBoxPage() throws InterruptedException{
        checkBoxPage.leftButtonElement();
        checkBoxPage.tickthatBox();
        Assert.assertTrue(driver.getPageSource().contains("Home"));

    }

    @Test
    public void ticktheBox()throws InterruptedException{
        checkBoxPage.leftButtonElement();
        checkBoxPage.tickthatBox();
        checkBoxPage.tickBox();
        Assert.assertTrue(driver.getPageSource().contains("You have selected :"));



    }

}
