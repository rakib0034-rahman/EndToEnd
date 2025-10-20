package PageObj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.stream.Collectors;

public class ProductPage {
    static WebDriver driver;


   public ProductPage(WebDriver driver) {
       this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".inventory_item_name")
    static List<WebElement> list;
    @FindBy(xpath = "//button[text()='Add to cart']")
    static List<WebElement> carts;

    public static void getBackPack() {
        List<Integer> indexs = list.stream().filter(s -> s.getText().equalsIgnoreCase("Sauce Labs Backpack"))
                .map(list::indexOf).toList();
        for (Integer index : indexs) {
            WebElement cart = carts.get(index);
            cart.click();
        }
        ProductPage1 productPage1 = new ProductPage1(driver);
    }
}
