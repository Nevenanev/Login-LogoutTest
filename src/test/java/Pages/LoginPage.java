package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    // We're entering atributes of webDriver, WebDriverWait and Web elements which are present on this web page
    WebDriver driver;
    WebDriverWait wdwait;
    WebElement usernameTextbox;
    WebElement passwordTextbox;
    WebElement loginButton;
    WebElement errorMessage;
    WebElement loggedOutMessage;
    public LoginPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getUsernameTextbox() { //getter za username textbox sa lokatorom
        return driver.findElement(By.id("username"));
    }

    public WebElement getPasswordTextbox() { //getter za password  textbox sa lokatorom
        return driver.findElement(By.id("password"));
    }

    public WebElement getLoginButton() { // getter za loginbutton sa lokatorom
        return driver.findElement(By.cssSelector(".fa.fa-2x.fa-sign-in"));
    }

    public WebElement getErrorMessage() { // getter za error message sa lokatorom
        return driver.findElement(By.cssSelector(".flash.error"));
    }

    public WebElement getLoggedOutMessage() {return  driver.findElement(By.cssSelector(".flash.success"));}

//-----------------------------------------------------------------------------
    public void insertUsername (String username){ //action which we'll apply on usernametextbox
        this.getUsernameTextbox().clear();
        this.getUsernameTextbox().sendKeys(username); }
    public void insertPassword (String password) { //action which we'll apply on passwordtextbox
        this.getPasswordTextbox().clear();
        this.getPasswordTextbox().sendKeys(password); }
   public void clickOnLoginButton () { //action which we'll do with login buttonom
        this.getLoginButton().click();
    }


}


