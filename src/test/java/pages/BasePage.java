package pages;

import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.io.ByteArrayInputStream;

import static uitilities.DriverSetup.getBrowser;

public class BasePage {

    public WebElement getElement_findElement(By locator){
       return getBrowser().findElement(locator);
    }


    public void clickOnElement(By locator){
        getElement_findElement(locator).click();
    }

    public void writeOnAElement_SendKeys(By locator, String text){
        getElement_findElement(locator).sendKeys(text);
    }
    public void clearInputOnElement(By locator){
        getElement_findElement(locator).clear();}

    public void hoverOnElement_ClickAndHold(By locator){
        Actions actions = new Actions(getBrowser());
        actions.clickAndHold(getElement_findElement(locator)).build().perform();
    }
    public void moveToElement(By locator){
        Actions actions = new Actions(getBrowser());
        actions.moveToElement(getElement_findElement(locator)).build().perform();

    }
    public void scrollIntoView(By locator) {
        Actions actions = new Actions(getBrowser());
        actions.moveToElement(getElement_findElement(locator)).build().perform();
    }


    public void loadAWebPage_GetBrowserGet(String url){
        getBrowser().get(url);
    }

    public String getElementText_GetText(By locator){
        return getElement_findElement(locator).getText();
    }

    public void takeScreenShot(String name){
        Allure.addAttachment(name, new ByteArrayInputStream(((TakesScreenshot)getBrowser()).getScreenshotAs(OutputType.BYTES)));
    }
}
