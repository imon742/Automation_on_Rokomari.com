package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CheckOutPage;
import pages.ProductPage;
import pages.SignInPage;
import uitilities.DriverSetup;

public class TestSignIn extends DriverSetup {
    SignInPage signInPage = new SignInPage();
    ProductPage productPage = new ProductPage();
    CheckOutPage checkOutPage = new CheckOutPage();
    @Test(description = "Test with valid credentials")
    public void testLoginWithValidCredentials() throws InterruptedException {
        getBrowser().get(signInPage.signInPageURL);
        productPage.clickOnElement(productPage.popUpAdvertise);
        signInPage.clickOnElement(signInPage.signInButton);
        signInPage.clickOnElement(signInPage.google_Button);
        //Thread.sleep(3000);

        signInPage.writeOnAElement(signInPage.emailInputBox, signInPage.email);
        signInPage.clickOnElement(signInPage.nextButton);
        Thread.sleep(3000);

        signInPage.writeOnAElement(signInPage.passwordInputBox, signInPage.password);
        Thread.sleep(3000);
        signInPage.scrollIntoView(signInPage.nextButton);

        signInPage.clickOnElement(signInPage.nextButton);
       Thread.sleep(3000);


//        productPage.clickOnElement(productPage.popUpAdvertise);
        productPage.clickOnElement(productPage.bikeadvertise);
        productPage.hoverOnElement(productPage.hoverButtonলেখক);
        productPage.clickOnElement(productPage.writer_হুমায়ূন_আহমেদ);
        productPage.scrollIntoView(productPage.categories_সমকালীন_উপন্যাস);
        productPage.clickOnElement(productPage.categories_সমকালীন_উপন্যাস);
        productPage.scrollIntoView(productPage.categories_রচনা_সংকলন_ও_সমগ্র);
        productPage.clickOnElement(productPage.categories_রচনা_সংকলন_ও_সমগ্র);
        productPage.scrollIntoView(productPage.nextPage);
        productPage.clickOnElement(productPage.page2);

        productPage.scrollIntoView(productPage.book_অপেক্ষা);
        //  productPage.clickOnElement(productPage.book_অপেক্ষা);
        //  productPage.hoverOnElement(productPage.book_অপেক্ষা);
        productPage.moveToElement(productPage.book_অপেক্ষা);
        productPage.clickOnElement(productPage.addToCart);

        productPage.clickOnElement(productPage.cart_Button);
        productPage.scrollIntoView(productPage.placeOrderButton);
        productPage.clickOnElement(productPage.placeOrderButton);
        Thread.sleep(3000);
        checkOutPage.clearInputOnElement(checkOutPage.nameInputFiled);
        Thread.sleep(3000);

        checkOutPage.writeOnAElement(checkOutPage.nameInputFiled,"Nazmul Islam Emon");
        Thread.sleep(3000);

        checkOutPage.writeOnAElement(checkOutPage.phoneNumberInputFiled,"0171202222");
        Thread.sleep(3000);

        checkOutPage.writeOnAElement(checkOutPage.alternativePhoneNumberInputFiled,"01717202111");
        Thread.sleep(3000);
        checkOutPage.clickOnElement(checkOutPage.selectCity);
        Thread.sleep(3000);
       // checkOutPage.clickOnElement(checkOutPage.);



        //Check Out




    }

    @Test
    public void testWithValidCredentials(){
        signInPage.loadAWebPage(signInPage.signInPageURL);
        signInPage.clickOnElement(signInPage.signInButton);
        signInPage.clickOnElement(signInPage.google_Button);
        signInPage.writeOnAElement(signInPage.emailInputBox, signInPage.email);
        signInPage.clickOnElement(signInPage.nextButton);
        signInPage.writeOnAElement(signInPage.passwordInputBox, signInPage.password);
        signInPage.clickOnElement(signInPage.showPasswordCheckBox);
        signInPage.scrollIntoView(signInPage.nextButton);
        signInPage.clickOnElement(signInPage.nextButton);
    }
    @Test
    public void testWithInvalidEmail(){
        signInPage.loadAWebPage(signInPage.signInPageURL);
        signInPage.clickOnElement(signInPage.signInButton);
        signInPage.clickOnElement(signInPage.google_Button);
        signInPage.writeOnAElement(signInPage.emailInputBox, "19202103240@");
        signInPage.clickOnElement(signInPage.nextButton);
        Assert.assertTrue(signInPage.getElement(signInPage.error_message).isDisplayed());
        Assert.assertEquals(signInPage.getElementText(signInPage.error_message),"sahskj");


    }
}
