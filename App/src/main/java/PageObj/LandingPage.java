package PageObj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
    static WebDriver driver;

    public LandingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "user-name")
    static WebElement username;
    @FindBy(id = "password")
    static WebElement password;
    @FindBy(id = "login-button")
    static WebElement loginButton;

    public static void setLoginButton() {
        username.sendKeys("standard_user");
        password.sendKeys("secret_sauce");
        loginButton.click();
        ProductPage productPage = new ProductPage(driver);
    }
}
