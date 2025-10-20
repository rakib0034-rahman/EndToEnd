package PageObj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmationPage {
    static WebDriver driver;
    public ConfirmationPage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//button[@name='finish']")
    static WebElement finish;
    public static void submitOrder(){
        finish.click();
        ThankYouPage thankYouPage= new ThankYouPage(driver);
    }
}

