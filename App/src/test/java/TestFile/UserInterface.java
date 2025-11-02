package TestFile;

import PageObj.*;
import TestCom.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.IOException;

import static TestCom.BaseTest.driver;


import PageObj.*;
import TestCom.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.IOException;

import static TestCom.BaseTest.driver;

/**
 * Test class for user interface flow of an e-commerce application
 * Tests the complete purchase flow from login to order confirmation
 */
public class UserInterface extends BaseTest {

    /**
     * Executes end-to-end test of purchase flow
     * Steps:
     * 1. Initialize application
     * 2. Login to the application
     * 3. Add products to cart (Backpack and Fleece Jacket)
     * 4. Navigate to cart
     * 5. Verify items and checkout
     * 6. Complete order and verify confirmation
     *
     * @throws IOException if there's an error during test execution
     */
    @Test
    public void testPurchaseFlow() throws IOException {
        // Initialize application
        BaseTest.app();

        // Login
        LandingPage.setLoginButton();

        // Add products to cart
        addProductsToCart();

        // Proceed to checkout
        processCheckout();

        // Verify order confirmation
        verifyOrderConfirmation();
    }

    /**
     * Helper method to add products to cart
     */
    private void addProductsToCart() {
        ProductPage.getBackPack();
        ProductPage1.getFleeceJacket();
        ProductPage1.goToCart();
    }

    /**
     * Helper method to process checkout
     */
    private void processCheckout() {
        CartPage.confirmBackpack();
        CartPage.goToCheckout();
        CheckoutPage.checkout();
    }

    /**
     * Helper method to verify order confirmation
     */
    private void verifyOrderConfirmation() {
        ConfirmationPage.submitOrder();
        ThankYouPage.thankU();
    }
}
