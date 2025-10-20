package PageObj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ThankYouPage {
    WebDriver driver;
    public ThankYouPage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);


    }
    @FindBy(tagName = "h2")
    static WebElement thank;
    public static void thankU(){
       String text= thank.getText();
      Boolean bbb=  text.contains("Thank you for your order!");
        System.out.println(bbb);

    }


}
