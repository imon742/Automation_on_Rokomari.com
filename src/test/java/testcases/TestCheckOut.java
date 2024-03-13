package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CheckOutPage;
import pages.LoginPage;
import pages.ProductPage;
import pages.SignInPage;
import uitilities.DriverSetup;

public class TestCheckOut extends DriverSetup {
    LoginPage loginPage = new LoginPage();
    SignInPage signInPage = new SignInPage();
    ProductPage productPage = new ProductPage();
    CheckOutPage checkOutPage = new CheckOutPage();

    @Test
    public void purchaseProduct(){
        loginPage.doLogin("standard_user", "secret_sauce");
        productPage.addProductToCart(productPage.bikeLight);
        productPage.clickOnElement(productPage.shoppingCart);
        checkOutPage.clickOnElement(checkOutPage.checkOut);
        checkOutPage.writeOnAElement_SendKeys(checkOutPage.firstNameField, "Jhon");
        checkOutPage.writeOnAElement_SendKeys(checkOutPage.lastNameField, "Right");
        checkOutPage.writeOnAElement_SendKeys(checkOutPage.postalCode, "2315");
        checkOutPage.clickOnElement(checkOutPage.continueButton);
        checkOutPage.clickOnElement(checkOutPage.finishButton);
        Assert.assertEquals(checkOutPage.getElementText_GetText(checkOutPage.greetingsText), "Thank you for your order!");

    }
    @Test
    public void testCheckOutAuto(){

       // signInPage.doSignIn(signInPage.email, signInPage.password);
        productPage.addProductToCart(productPage.book_অপেক্ষা);
    }
}
