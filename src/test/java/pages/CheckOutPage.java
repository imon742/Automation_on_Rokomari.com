package pages;

import org.openqa.selenium.By;

public class CheckOutPage extends  BasePage{
    public By checkOut = By.id("checkout");
    public By firstNameField = By.id("first-name");
    public  By lastNameField = By.id("last-name");
    public By postalCode = By.id("postal-code");
    public By continueButton = By.id("continue");
    public By finishButton = By.id("finish");

    public By greetingsText = By.xpath("//h2[@class='complete-header']");


    //rokomari checkout
    public By nameInputFiled = By.xpath("//div[@class='shipping-form-container']//input[@id='name']");
    public By phoneNumberInputFiled = By.xpath("//fieldset[@class='group']//input[@id='phone']");
    public By alternativePhoneNumberInputFiled = By.xpath("//fieldset[@class='group']//input[@id='phone2']");
    public By selectCity = By.xpath("//select[@id='js--city']");




}
