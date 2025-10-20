package PageObj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Arrays;
import java.util.List;

public class ProductPage1 {
    static WebDriver driver;
    public ProductPage1(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    static String productName="Sauce Labs Fleece Jacket";
    @FindBy(css = ".inventory_item_name")
    static List<WebElement> names;
    @FindBy(xpath = "//button[text()='Add to cart']")
    static List<WebElement> carts;
    @FindBy(css = ".shopping_cart_link")
    static WebElement cartButton;
    public static void getFleeceJacket(){
        for (int i=0; i<names.size(); i++){
          String product=  names.get(i).getText();
          if (productName.contains(product)){
             WebElement addToCart=  carts.get(i);
              addToCart.click();
          }


        }

    }
    public static void goToCart(){
        cartButton.click();
        CartPage cartPage= new CartPage(driver);

    }
}
