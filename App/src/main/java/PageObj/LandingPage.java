package PageObj;

import Config.TestDataReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

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
    /*static String user= "standard_user";
    static String pass="secret_sauce";*/


    public static void setLoginButton() throws IOException {
        TestDataReader reader= new TestDataReader();
        reader.readFile();
        String user= reader.getProperties("username");
       String pass=  reader.getProperties("password");
        username.sendKeys(user);
        password.sendKeys(pass);
        loginButton.click();
        ProductPage productPage = new ProductPage(driver);

    }
}
