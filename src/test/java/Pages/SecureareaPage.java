package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SecureareaPage {
    //  We're entering atributes of webDriver, WebDriverWait and Web elements which are present on this web page
    WebDriver driver;
    WebDriverWait wdwait;
    WebElement SuccessfulLoginMessage;
    WebElement WelcomeMessage;
    WebElement logOutButton;
    public SecureareaPage(WebDriver driver, WebDriverWait wdwait) { // konstruktor za web driver, i web driver wait
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getSuccessfulLoginMessage() { //getter za loginmessage sa lokatorom
        return  driver.findElement(By.id("flash"));
    }
    public WebElement getWelcomeMessage() { return driver.findElement(By.className("subheader")); }
    public WebElement getLogOutButton() { //getter for logOutbutton with locator
        return driver.findElement(By.cssSelector(".button.secondary.radius"));}

//-----------------------------------------------------------------------------------------
    public void clickOnLogOutButton() { //radnja, akcija koju izvrsavamo
        this.getLogOutButton().click();
    }

}
