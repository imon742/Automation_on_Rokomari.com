package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProductPage;
import uitilities.DriverSetup;

public class TestProductPage extends DriverSetup {
    LoginPage loginPage = new LoginPage();
    ProductPage productPage = new ProductPage();
    @Test
    public void testProductDetails(){
        loginPage.doLogin("standard_user", "secret_sauce");
        productPage.clickOnElement(productPage.bikeLight);
        Assert.assertEquals(productPage.getElementText(productPage.productTitle), "Sauce Labs Bike Light");
    }

    @Test
    public void testAddCart(){
        loginPage.doLogin("standard_user", "secret_sauce");
        productPage.clickOnElement(productPage.bikeLight);
        productPage.clickOnElement(productPage.addToChatButton);
        Assert.assertTrue(productPage.getElement(productPage.removeButton).isDisplayed());
        Assert.assertEquals(productPage.getElementText(productPage.cartCount), "1");
    }
    //Rokomari product page
    @Test
    public void testRokomariFilterAndPages(){
        getBrowser().get(productPage.productPageURLRokomari);
        productPage.clickOnElement(productPage.popUpAdvertise);
        productPage.clickOnElement(productPage.bikeadvertise);
        productPage.hoverOnElement(productPage.hoverButtonলেখক);
        productPage.clickOnElement(productPage.writer_হুমায়ূন_আহমেদ);
        productPage.scrollIntoView(productPage.categories_সমকালীন_উপন্যাস);
        productPage.clickOnElement(productPage.categories_সমকালীন_উপন্যাস);
        productPage.scrollIntoView(productPage.categories_রচনা_সংকলন_ও_সমগ্র);
        productPage.clickOnElement(productPage.categories_রচনা_সংকলন_ও_সমগ্র);
        productPage.scrollIntoView(productPage.nextPage);
        productPage.clickOnElement(productPage.page2);
        productPage.hoverOnElement(productPage.book_গৌরীপুর_জংশন);
        productPage.moveToElement(productPage.book_গৌরীপুর_জংশন);
        productPage.hoverOnElement(productPage.addToCart);
        productPage.clickOnElement(productPage.addToCart);
        productPage.clickOnElement(productPage.cart_Buton);

    }

}
