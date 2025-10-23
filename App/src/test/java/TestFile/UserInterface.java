package TestFile;

import PageObj.*;
import TestCom.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.IOException;

import static TestCom.BaseTest.driver;

public class UserInterface extends BaseTest {


    @Test
    public void test() throws IOException {
        BaseTest.app();
        LandingPage.setLoginButton();
        ProductPage.getBackPack();
        ProductPage1.getFleeceJacket();
        ProductPage1.goToCart();
        CartPage.confirmBackpack();
        CartPage.goToCheckout();
        CheckoutPage.checkout();
        ConfirmationPage.submitOrder();
        ThankYouPage.thankU();

    }
}