package PageObj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.stream.Collectors;

public class CartPage {
    static WebDriver driver;
    public CartPage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(css = ".cart_item .inventory_item_name")
    static List<WebElement> cartList;
    @FindBy(css = ".checkout_button")
    static WebElement checkoutButton;
    public static void confirmBackpack(){
        for (int i=0; i<cartList.size(); i++){
          String text=   cartList.get(i).getText();
            if (text.contains("Sauce Labs Backpack")){
               String bag=  cartList.get(i).getText();
                System.out.println(bag);

            }

        }
    }
    public static void goToCheckout(){
        checkoutButton.click();
        CheckoutPage checkoutPage= new CheckoutPage(driver);

    }

}
