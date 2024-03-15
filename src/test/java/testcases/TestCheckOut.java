package testcases;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CheckOutPage;
import pages.ProductPage;
import pages.SignInPage;
import uitilities.DriverSetup;

public class TestCheckOut extends DriverSetup {
    SignInPage signInPage = new SignInPage();
    ProductPage productPage = new ProductPage();
    CheckOutPage checkOutPage = new CheckOutPage();

    @Test
    @Description("Test product checkout")

    public void testCheckOutAuto() throws InterruptedException {
        productPage.addProductToCart(productPage.book_অপেক্ষা);
        checkOutPage.clearInputOnElement(checkOutPage.nameInputFiled);
        checkOutPage.writeOnAElement_SendKeys(checkOutPage.nameInputFiled,"Nazmul Islam Emon");
        checkOutPage.writeOnAElement_SendKeys(checkOutPage.phoneNumberInputFiled,"0171202222");
        checkOutPage.writeOnAElement_SendKeys(checkOutPage.alternativePhoneNumberInputFiled,"01717202111");
        checkOutPage.clickOnElement(checkOutPage.selectCity);
        checkOutPage.moveToElement(checkOutPage.selectCity);
        checkOutPage.clickOnElement(checkOutPage.cityDhaka);
        checkOutPage.scrollIntoView(checkOutPage.addressInputFiled);
        checkOutPage.writeOnAElement_SendKeys(checkOutPage.addressInputFiled,"Dhaka bangladesh");
        checkOutPage.scrollIntoView(checkOutPage.cashOnDelivaryRadioButton);
        checkOutPage.clickOnElement(checkOutPage.cashOnDelivaryRadioButton);
        checkOutPage.scrollIntoView(checkOutPage.bkashRadioButton);
        checkOutPage.clickOnElement(checkOutPage.bkashRadioButton);
        checkOutPage.clickOnElement(checkOutPage.nagadRadioButton);
        checkOutPage.clickOnElement(checkOutPage.rocketRadioButton);
        checkOutPage.scrollIntoView(checkOutPage.sslRadioButton);
        checkOutPage.clickOnElement(checkOutPage.sslRadioButton);
        productPage.removeFromCart(productPage.removeBook);
        productPage.removeFromCart(productPage.removeBook);
        checkOutPage.clickOnElement(checkOutPage.userInfo);
        checkOutPage.clickOnElement(checkOutPage.signOut);

    }
}
