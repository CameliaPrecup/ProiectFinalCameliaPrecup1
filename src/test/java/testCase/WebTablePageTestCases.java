package testCase;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.BasePage;
import pages.FirstPage;
import pages.LoginPage;
import pages.WebTablePage;

public class WebTablePageTestCases extends BasePage {
    private WebTablePage webTablePage;
    @BeforeMethod

    public void setUp() {
        super.setUp();
        webTablePage = new WebTablePage(driver);


    }

    @Test
    public void clikonWebTablesBtn()throws InterruptedException{
        webTablePage.leftButtonElement();
        webTablePage.setWebTableBtn();
        Assert.assertTrue(driver.getPageSource().contains("Web Tables"));
    }

    @Test
    public void clickonAddBtn()throws InterruptedException{
        webTablePage.leftButtonElement();
        webTablePage.setWebTableBtn();
        webTablePage.setAddBtn();
        Assert.assertTrue(driver.getPageSource().contains("Registration Form"));
    }
    @Test
    public void addFirstName()throws InterruptedException{
        webTablePage.leftButtonElement();
        webTablePage.setWebTableBtn();
        webTablePage.setAddBtn();
        webTablePage.setRegForm("John");
        Assert.assertTrue(driver.getPageSource().contains("Registration Form"));
    }
    @Test
    public void addSecondName()throws InterruptedException{
        webTablePage.leftButtonElement();
        webTablePage.setWebTableBtn();
        webTablePage.setAddBtn();
        webTablePage.setSecondName("Doe");
        Assert.assertTrue(driver.getPageSource().contains("Last Name"));
    }

    @Test
    public void addEmail()throws InterruptedException{
        webTablePage.leftButtonElement();
        webTablePage.setWebTableBtn();
        webTablePage.setAddBtn();
        webTablePage.setUseremail("johndoe@example.com");
        Assert.assertTrue(driver.getPageSource().contains("Email"));
    }

    @Test
    public void addAge()throws InterruptedException{
        webTablePage.leftButtonElement();
        webTablePage.setWebTableBtn();
        webTablePage.setAddBtn();
        webTablePage.setAgebox("40");
        Assert.assertTrue(driver.getPageSource().contains("Age"));


    }

    @Test
    public void addSalary()throws InterruptedException{
        webTablePage.leftButtonElement();
        webTablePage.setWebTableBtn();
        webTablePage.setAddBtn();
        webTablePage.setSalaryField("10000");
        Assert.assertTrue(driver.getPageSource().contains("Salary"));



    }
    @Test
    public void addDepartment()throws InterruptedException{
        webTablePage.leftButtonElement();
        webTablePage.setWebTableBtn();
        webTablePage.setAddBtn();
        webTablePage.setDepartmentField("QATesting");
        Assert.assertTrue(driver.getPageSource().contains("Department"));

    }

    @Test
    public void submittForm()throws InterruptedException{
        webTablePage.leftButtonElement();
        webTablePage.setWebTableBtn();
        webTablePage.setAddBtn();
        webTablePage.setRegForm("John");
        webTablePage.setSecondName("Doe");
        webTablePage.setUseremail("johndoe@example.com");
        webTablePage.setAgebox("40");
        webTablePage.setSalaryField("10000");
        webTablePage.setDepartmentField("QATesting");
        webTablePage.setSubmittBtn();
        Assert.assertTrue(driver.getPageSource().contains("Web Tables"));

    }



}
