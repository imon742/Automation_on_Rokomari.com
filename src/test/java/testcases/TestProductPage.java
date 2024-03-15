package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ProductPage;
import uitilities.DriverSetup;

public class TestProductPage extends DriverSetup {
    ProductPage productPage = new ProductPage();
    @Test(description = "Select Lekhok Then Humayen Ahamed Then browse throw Page")
    public void testRokomariFilterAndPages() {
        getBrowser().get(productPage.productPageURLRokomari);
        productPage.clickOnElement(productPage.popUpAdvertise);
        productPage.clickOnElement(productPage.bikeadvertise);
        productPage.hoverOnElement_ClickAndHold(productPage.hoverButtonলেখক);
        productPage.clickOnElement(productPage.writer_হুমায়ূন_আহমেদ);
        productPage.scrollIntoView(productPage.categories_সমকালীন_উপন্যাস);
        productPage.clickOnElement(productPage.categories_সমকালীন_উপন্যাস);
        productPage.scrollIntoView(productPage.categories_রচনা_সংকলন_ও_সমগ্র);
        productPage.clickOnElement(productPage.categories_রচনা_সংকলন_ও_সমগ্র);
        productPage.scrollIntoView(productPage.nextPage);
        productPage.clickOnElement(productPage.page2);
        productPage.scrollIntoView(productPage.nextPage);
        productPage.clickOnElement(productPage.nextPage);
        productPage.scrollIntoView(productPage.book_অপেক্ষা);
        productPage.moveToElement(productPage.book_অপেক্ষা);
        productPage.clickOnElement(productPage.addToCart);
        productPage.clickOnElement(productPage.cart_Button);
        productPage.clickOnElement(productPage.removeBook);
    }

}
