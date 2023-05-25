package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

        private By usernameField = By.id("userName");
        private By passwordField = By.id("password");
        private By loginButton = By.id("login");

        public LoginPage(WebDriver driver) {
            super(driver);
        }

        public void login(String username, String password) {
            driver.findElement(loginButton).click();
            driver.findElement(usernameField).sendKeys(username);
            driver.findElement(passwordField).sendKeys(password);
            driver.findElement(loginButton).click();
        }
    }


