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

        signInPage.writeOnAElement_SendKeys(signInPage.emailInputBox, signInPage.email);
        signInPage.clickOnElement(signInPage.nextButton);
        Thread.sleep(3000);

        signInPage.writeOnAElement_SendKeys(signInPage.passwordInputBox, signInPage.password);
        Thread.sleep(3000);
        signInPage.scrollIntoView(signInPage.nextButton);

        signInPage.clickOnElement(signInPage.nextButton);
       Thread.sleep(3000);


//        productPage.clickOnElement(productPage.popUpAdvertise);
        productPage.clickOnElement(productPage.bikeadvertise);
        productPage.hoverOnElement_ClickAndHold(productPage.hoverButtonলেখক);
        productPage.clickOnElement(productPage.writer_হুমায়ূন_আহমেদ);
        productPage.scrollIntoView(productPage.categories_সমকালীন_উপন্যাস);
        productPage.clickOnElement(productPage.categories_সমকালীন_উপন্যাস);
        productPage.scrollIntoView(productPage.categories_রচনা_সংকলন_ও_সমগ্র);
        productPage.clickOnElement(productPage.categories_রচনা_সংকলন_ও_সমগ্র);
        productPage.scrollIntoView(productPage.nextPage);
        productPage.clickOnElement(productPage.page2);
        productPage.writeOnAElement_SendKeys(productPage.searchBar,"অপেক্ষা");
        productPage.clickOnElement(productPage.searchButton);


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

        checkOutPage.writeOnAElement_SendKeys(checkOutPage.nameInputFiled,"Nazmul Islam Emon");
        Thread.sleep(3000);

        checkOutPage.writeOnAElement_SendKeys(checkOutPage.phoneNumberInputFiled,"0171202222");
        Thread.sleep(3000);

        checkOutPage.writeOnAElement_SendKeys(checkOutPage.alternativePhoneNumberInputFiled,"01717202111");
        Thread.sleep(3000);
        checkOutPage.clickOnElement(checkOutPage.selectCity);
        Thread.sleep(3000);
       // checkOutPage.clickOnElement(checkOutPage.);



        //Check Out




    }

    @Test
    public void testWithValidCredentials(){
        signInPage.loadAWebPage_GetBrowserGet(signInPage.signInPageURL);
        signInPage.clickOnElement(signInPage.signInButton);
        signInPage.clickOnElement(signInPage.google_Button);
        signInPage.writeOnAElement_SendKeys(signInPage.emailInputBox, signInPage.email);
        signInPage.clickOnElement(signInPage.nextButton);
        signInPage.writeOnAElement_SendKeys(signInPage.passwordInputBox, signInPage.password);
        signInPage.clickOnElement(signInPage.showPasswordCheckBox);
        signInPage.scrollIntoView(signInPage.nextButton);
        signInPage.clickOnElement(signInPage.nextButton);
    }
    @Test
    public void testWithNULLInput(){
        signInPage.loadAWebPage_GetBrowserGet(signInPage.signInPageURL);
        signInPage.clickOnElement(signInPage.signInButton);
        signInPage.writeOnAElement_SendKeys(signInPage.emailOrPhoneNumberInputBox,"");
        signInPage.clickOnElement(signInPage.nextButtonRokomari);
        Assert.assertTrue(signInPage.getElement_findElement(signInPage.message_error_RokomariEnd).isDisplayed());
        Assert.assertEquals(signInPage.getElementText_GetText(signInPage.message_error_RokomariEnd),"Please enter a valid email or phone number.");
    }
    @Test
    public void testWithInvalidEmail(){
        signInPage.loadAWebPage_GetBrowserGet(signInPage.signInPageURL);
        signInPage.clickOnElement(signInPage.signInButton);
//        signInPage.clickOnElement(signInPage.google_Button);
//        signInPage.writeOnAElement(signInPage.emailInputBox, "19202103240@");
//        signInPage.clickOnElement(signInPage.nextButton);
        signInPage.writeOnAElement_SendKeys(signInPage.emailOrPhoneNumberInputBox,"19202103240@");
        signInPage.clickOnElement(signInPage.nextButtonRokomari);
        Assert.assertTrue(signInPage.getElement_findElement(signInPage.message_error_RokomariEnd).isDisplayed());
        Assert.assertEquals(signInPage.getElementText_GetText(signInPage.message_error_RokomariEnd),"Invalid email! Please enter a valid email or phone number.");
    }
    @Test
    public void testWithValidEmailInvalidOTP() throws InterruptedException {
        signInPage.loadAWebPage_GetBrowserGet(signInPage.signInPageURL);
        signInPage.clickOnElement(signInPage.signInButton);
        signInPage.writeOnAElement_SendKeys(signInPage.emailOrPhoneNumberInputBox,"nazmulislamemon007@gmail.com");
        signInPage.clickOnElement(signInPage.nextButtonRokomari);
        Assert.assertTrue(signInPage.getElement_findElement(signInPage.message_OTP_RokomariEnd).isDisplayed());
        Assert.assertEquals(signInPage.getElementText_GetText(signInPage.message_OTP_RokomariEnd),"OTP sent to your email. Please enter OTP bellow.");
        signInPage.writeOnAElement_SendKeys(signInPage.otpInputBox,"5555");
        signInPage.scrollIntoView(signInPage.loginButton);


        signInPage.clickOnElement(signInPage.loginButton);
        Thread.sleep(2000);

        Assert.assertTrue(signInPage.getElement_findElement(signInPage.message_invalidOTP).isDisplayed());
        Assert.assertEquals(signInPage.getElementText_GetText(signInPage.message_invalidOTP),"Invalid OTP!");
    }
}
