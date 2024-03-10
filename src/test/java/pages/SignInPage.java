package pages;

import org.openqa.selenium.By;

public class SignInPage extends BasePage{

    public String email ="qa.nazmul.101@gmail.com";
    public String password = "SQA.742366742366";
    public String signInPageURL = "https://www.rokomari.com/";
    public String loginPageTitle = "Buy Book Online - Best Online Book Shop in Bangladesh | Rokomari.com";
    public By signInButton = By.xpath("//a[@class='logged-out-user-menu-btn btn btn-secondary']");
    public By google_Button = By.xpath("//button[@class='btn btn-social-google']");
    public By emailInputBox = By.xpath("//input[@id='identifierId']");
    public By passwordInputBox = By.xpath("//input[@name='Passwd']");
    public By showPasswordCheckBox = By.xpath("//input[@type='checkbox']");

    public By nextButton = By.xpath("//span[normalize-space()='Next']");
    public By error_message = By.xpath("//div[@class='o6cuMc Jj6Lae']");
    public By emailOrPhoneNumberInputBox = By.xpath("//input[@placeholder='Email or phone']");
    public By message_error_RokomariEnd = By.xpath("//p[@class='validation-text']");
    public By message_OTP_RokomariEnd = By.xpath("//p[@class='validation-text success']");
    public By nextButtonRokomari = By.xpath("//button[@id='js--btn-next']");
    public By otpInputBox = By.xpath("//input[@placeholder='OTP']");
    public By loginButton = By.xpath("//form[@id='otp-login-form']//button[@type='submit'][normalize-space()='Login']");
    public By message_invalidOTP = By.xpath("//p[normalize-space()='Invalid OTP!']");



    public void doSignIn(String email, String password){
        loadAWebPage_GetBrowserGet(signInPageURL);
        clickOnElement(signInButton);
        clickOnElement(google_Button);
        writeOnAElement_SendKeys(emailInputBox,email);
        scrollIntoView(nextButton);
        clickOnElement(nextButton);
        writeOnAElement_SendKeys(passwordInputBox,password);
        scrollIntoView(nextButton);
        clickOnElement(nextButton);


    }









}
