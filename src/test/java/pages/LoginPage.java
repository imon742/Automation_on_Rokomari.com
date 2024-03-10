package pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{
    public String  loginPageURL = "https://www.saucedemo.com";
    public String loginPageTitle = "Swag Labs";
    public By emailInputBox =  By.xpath("//input[@id='user-name']");
    public By passwordInputBox =  By.xpath("//input[@id='password']");
    public By errorMsg =  By.xpath("//h3[@data-test='error']");
    public By loginButton =  By.xpath("//input[@id='login-button']");

    public void doLogin(String email, String password){
        loadAWebPage_GetBrowserGet(loginPageURL);
        writeOnAElement_SendKeys(emailInputBox, email);
        writeOnAElement_SendKeys(passwordInputBox, password);
        clickOnElement(loginButton);

    }
}
