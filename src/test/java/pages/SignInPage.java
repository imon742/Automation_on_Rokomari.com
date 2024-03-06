package pages;

import org.openqa.selenium.By;

public class SignInPage extends BasePage{

    public String email ="qa.nazmul.101@gmail.com";
    public String password = "SQA.742366742366";
    public String  loginPageURL = "https://www.rokomari.com/";
    public String loginPageTitle = "Buy Book Online - Best Online Book Shop in Bangladesh | Rokomari.com";
    public By signInButton = By.xpath("//a[@class='logged-out-user-menu-btn btn btn-secondary']");
    public By google_Button = By.xpath("//button[@class='btn btn-social-google']");
    public By emailInputBox = By.xpath("//input[@id='identifierId']");
    public By passwordInputBox = By.xpath("//input[@name='Passwd']");
    public By showPasswordCheckBox = By.xpath("//input[@type='checkbox']");

    public By nextButton = By.xpath("//span[normalize-space()='Next']");









}
