package pages;
import com.google.common.collect.Table;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebTablePage extends BasePage {
    public WebTablePage(WebDriver driver) {
        super(driver);
    }

    By ButtonElement = By.cssSelector(".accordion .element-group:nth-of-type(1) .header-text");

    By WebTableBtn= By.cssSelector(".show .btn-light:nth-of-type(4) .text");

    By AddBtn = By.id("addNewRecordButton");

    By RegForm = By.id("firstName");

    By SecondName = By.id("lastName");

    By Useremail = By.id("userEmail");

    By Agebox = By.id("age");

    By SalaryField = By.id("salary");

    By DepartmentField = By.id("department");

    By SubmittBtn = By.id("submit");


    public void leftButtonElement() {
        driver.findElement(ButtonElement).click();
        driver.manage().window().maximize();
    }

    public void setWebTableBtn(){
        WebDriverWait WebBtn = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebBtn.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".show .btn-light:nth-of-type(4) .text"))).click();

    }

    public void setAddBtn(){
        driver.findElement(AddBtn).click();
    }
    public void setRegForm(String arg){
        driver.findElement(RegForm).click();
        driver.findElement(RegForm).sendKeys("John");
    }
    public void setSecondName(String arg1){
        driver.findElement(SecondName).click();
        driver.findElement(SecondName).sendKeys("Doe");
    }

    public void setUseremail(String arg2){
        driver.findElement(Useremail).click();
        driver.findElement(Useremail).sendKeys("johndoe@example.com");
    }
    public void setAgebox(String arg3){
        driver.findElement(Agebox).click();
        driver.findElement(Agebox).sendKeys("40");
    }

    public void setSalaryField(String arg4){
        driver.findElement(SalaryField).click();
        driver.findElement(SalaryField).sendKeys("10000");
    }

    public void setDepartmentField(String arg4){
        driver.findElement(DepartmentField).click();
        driver.findElement(DepartmentField).sendKeys("QATesting");
    }

    public void setSubmittBtn(){
        driver.findElement(SubmittBtn).click();
    }





    }


