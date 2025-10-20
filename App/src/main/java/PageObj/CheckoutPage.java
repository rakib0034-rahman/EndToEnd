package PageObj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
    static WebDriver driver;
    public CheckoutPage(WebDriver driver) {
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "first-name")
    static WebElement firstName;
    @FindBy(id = "last-name")
    static WebElement lastname;
    @FindBy(id = "postal-code")
    static WebElement postCode;
    @FindBy(xpath = "//input[@type='submit']")
    static WebElement submit;
    public static void checkout(){
        firstName.sendKeys("zohran");
        lastname.sendKeys("Mamdani");
        postCode.sendKeys("nyc");
        submit.click();
        ConfirmationPage confirmationPage= new ConfirmationPage(driver);

    }

}
