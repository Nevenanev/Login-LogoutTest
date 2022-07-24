package Base;

import Pages.LoginPage;
import Pages.SecureareaPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.time.Duration;

public class BaseTest {
    //Za svaku stranicu koju radimo navodimo atribute, kao i atribute za WebDriver i WebDriverWait
    public WebDriver driver;
    public WebDriverWait wdwait;
    public LoginPage loginpage;

    public SecureareaPage secureareaPage;
    public ExcelReader excelReader;

    public String loginUrl;

    @BeforeClass  // We're creating an object for each atribute
    public void setUp() throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
        loginpage = new LoginPage(driver, wdwait);
        excelReader = new ExcelReader("C:\\Users\\Korisnik\\Desktop\\LoginPodaci.xlsx");
        loginUrl = excelReader.getStringData("Login", 1, 4);
    }

    public void visibilityWait(WebElement element) {
        wdwait.until(ExpectedConditions.visibilityOf(element));
    }

    @AfterClass   // closing of tabs and closing of browser in the background
    public void tearDown() {
        //driver.close();
        //driver.quit();
    }

}
