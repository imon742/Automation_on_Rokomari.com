package pages;

import org.openqa.selenium.By;

public class CheckOutPage extends  BasePage{
    //rokomari checkout
    public By nameInputFiled = By.xpath("//div[@class='shipping-form-container']//input[@id='name']");
    public By phoneNumberInputFiled = By.xpath("//fieldset[@class='group']//input[@id='phone']");
    public By alternativePhoneNumberInputFiled = By.xpath("//fieldset[@class='group']//input[@id='phone2']");
    public By selectCity = By.xpath("//select[@id='js--city']");
    public By cityDhaka = By.xpath("//option[contains(text(),'ঢাকা')]");
    public By addressInputFiled = By.xpath("//fieldset[@class='mb-0']//textarea[@id='address']");
    public By cashOnDelivaryRadioButton = By.xpath("//label[@for='COD']");
    public By bkashRadioButton = By.xpath("//label[@for='B_KASH']");
    public By nagadRadioButton = By.xpath("//label[@for='NAGAD']");
    public By rocketRadioButton = By.xpath("//label[@for='ROCKET']");
    public By sslRadioButton = By.xpath("//label[@for='SSL_COMMEREZ']");

    public By userInfo = By.xpath("//span[@class='user-name']");
    public By signOut = By.xpath("//a[@class='dropdown-item js--logout-button']");
}
