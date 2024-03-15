package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SignInPage;
import uitilities.DriverSetup;

public class TestSignIn extends DriverSetup {
    SignInPage signInPage = new SignInPage();
    @Test(description = "Test with valid credentials")
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
        Assert.assertEquals(signInPage.getElementText_GetText(signInPage.userInfo),"Nazmul Islam");
        signInPage.doSignOut();
    }
    @Test(description = "Test with NULLInput")
    public void testWithNULLInput(){
        signInPage.loadAWebPage_GetBrowserGet(signInPage.signInPageURL);
        signInPage.clickOnElement(signInPage.signInButton);
        signInPage.writeOnAElement_SendKeys(signInPage.emailOrPhoneNumberInputBox,"");
        signInPage.clickOnElement(signInPage.nextButtonRokomari);
        Assert.assertTrue(signInPage.getElement_findElement(signInPage.message_error_RokomariEnd).isDisplayed());
        Assert.assertEquals(signInPage.getElementText_GetText(signInPage.message_error_RokomariEnd),"Please enter a valid email or phone number.");
    }
    @Test(description = "Test with invalid Email")
    public void testWithInvalidEmail(){
        signInPage.loadAWebPage_GetBrowserGet(signInPage.signInPageURL);
        signInPage.clickOnElement(signInPage.signInButton);
        signInPage.writeOnAElement_SendKeys(signInPage.emailOrPhoneNumberInputBox,"19202103240@");
        signInPage.clickOnElement(signInPage.nextButtonRokomari);
        Assert.assertTrue(signInPage.getElement_findElement(signInPage.message_error_RokomariEnd).isDisplayed());
        Assert.assertEquals(signInPage.getElementText_GetText(signInPage.message_error_RokomariEnd),"Invalid email! Please enter a valid email or phone number.");
    }
    @Test(description = "Test with valid Email Invalid OTP")
    public void testWithValidEmailInvalidOTP(){
        signInPage.loadAWebPage_GetBrowserGet(signInPage.signInPageURL);
        signInPage.clickOnElement(signInPage.signInButton);
        signInPage.writeOnAElement_SendKeys(signInPage.emailOrPhoneNumberInputBox,"nazmulislamemon007@gmail.com");
        signInPage.clickOnElement(signInPage.nextButtonRokomari);
        Assert.assertTrue(signInPage.getElement_findElement(signInPage.message_OTP_RokomariEnd).isDisplayed());
        Assert.assertEquals(signInPage.getElementText_GetText(signInPage.message_OTP_RokomariEnd),"OTP sent to your email. Please enter OTP bellow.");
        signInPage.writeOnAElement_SendKeys(signInPage.otpInputBox,"5555");
        signInPage.scrollIntoView(signInPage.loginButton);
        signInPage.clickOnElement(signInPage.loginButton);
        Assert.assertTrue(signInPage.getElement_findElement(signInPage.message_invalidOTP).isDisplayed());
        Assert.assertEquals(signInPage.getElementText_GetText(signInPage.message_invalidOTP),"Invalid OTP!");
    }
}
