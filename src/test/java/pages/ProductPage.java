package pages;

import org.openqa.selenium.By;

public class ProductPage extends BasePage{


   public String  productPageURL = "https://www.saucedemo.com/inventory.html";

   public  By bikeLight = By.xpath("//div[normalize-space()='Sauce Labs Bike Light']");

   public By productTitle = By.xpath("//div[@class='inventory_details_name large_size']");
   public  By addToChatButton = By.id("add-to-cart-sauce-labs-bike-light");

   public By removeButton = By.xpath("//button[@id='remove-sauce-labs-bike-light']");

   public By cartCount = By.xpath("//span[@class='shopping_cart_badge']");

   public By shoppingCart = By.xpath("//a[@class='shopping_cart_link']");


   //Rokomari Start Here
   public String productPageURLRokomari = "https://www.rokomari.com/book";
   public By bikeadvertise = By.xpath("//span[@aria-hidden='true']");
   public By popUpAdvertise = By.xpath("//div[@id='js--entry-popup']//i[@class='ion-close-round']");


   public By hoverButtonলেখক = By.xpath("//a[@id='js--authors']");
   public By writer_হুমায়ূন_আহমেদ = By.xpath("//a[contains(text(),'হুমায়ূন আহমেদ')]");
   public By categories_সমকালীন_উপন্যাস = By.xpath("//label[@for='rok-filter-categoryIds-677']");

   public By categories_রচনা_সংকলন_ও_সমগ্র = By.xpath("//label[@for='rok-filter-categoryIds-1321']");
   public By nextPage = By.xpath("//a[normalize-space()='Next']");
   public By page2 = By.xpath("//a[normalize-space()='2']");
   public By searchBar = By.xpath("//input[@id='js--search']");
   public By searchButton = By.xpath("//button[@type='submit']");


   public By book_অপেক্ষা = By.xpath("//h4[contains(text(),'অপেক্ষা')]");
    public By addToCart = By.xpath("//div[@title='অপেক্ষা হুমায়ূন আহমেদ']//div[1]//div[3]//button[1]");
   public By cart_ButtonInMiddleOfUI = By.xpath("//*[name()='path' and contains(@d,'M394.044,1')]");
   public By cart_Button = By.xpath("//a[@id='js-cart-menu']//*[name()='svg']");

   public By placeOrderButton = By.xpath("//span[normalize-space()='Place Order']");
   public By orderAsAGiftButton = By.xpath("#js-continue-to-gift-shipping");







   public void addProductToCart(By locator){
     // clickOnElement(popUpAdvertise);
   //   clickOnElement(bikeadvertise);
      writeOnAElement_SendKeys(searchBar,"অপেক্ষা");
      clickOnElement(searchButton);
      scrollIntoView(locator);
      moveToElement(locator);
      clickOnElement(addToCart);
   }

}
