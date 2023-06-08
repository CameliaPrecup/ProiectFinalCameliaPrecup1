package testCase;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.BasePage;
import pages.FirstPage;
import pages.RadioButtonPage;

public class RadioButtonTestCase extends BasePage{

    private RadioButtonPage radioButtonPage;


        @BeforeMethod

        public void setUp() {
            super.setUp();
            radioButtonPage = new RadioButtonPage(driver);
    }

    @Test
    public void clickElementsbtn()throws InterruptedException{
        radioButtonPage.leftButtonElement();
        Assert.assertTrue(driver.getPageSource().contains("Elements"));

    }

    @Test
    public void clickRadioBtn()throws InterruptedException{
            radioButtonPage.leftButtonElement();
            radioButtonPage.setRadioBthn();
            Assert.assertTrue(driver.getPageSource().contains("Radio Button"));

    }
    @Test
    public void yesBtn()throws InterruptedException{
            radioButtonPage.leftButtonElement();
            radioButtonPage.setRadioBthn();
            radioButtonPage.istheYesBtn();
            Assert.assertFalse(driver.getPageSource().contains("You have selected Yes"));
    }

    @Test
    public void impressiveBtn()throws InterruptedException{
            radioButtonPage.leftButtonElement();
            radioButtonPage.setRadioBthn();
            radioButtonPage.istheImpressiveBtn();
            Assert.assertFalse(driver.getPageSource().contains("You have selected Impressive"));
    }

    @Test
    public void noBtn()throws InterruptedException{
            radioButtonPage.leftButtonElement();
            radioButtonPage.setRadioBthn();
            radioButtonPage.istheNoBtn();
            Assert.assertTrue(driver.getPageSource().contains("Radio Button"));


    }

}
