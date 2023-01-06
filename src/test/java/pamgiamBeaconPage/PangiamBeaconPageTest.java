package pamgiamBeaconPage;

import Utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;
import pamgiamHomePage.PangiamHomePage;

public class PangiamBeaconPageTest {
    WebDriver driver;
    PangiamHomePage pangiamHomePage;
    Actions actions;
    PangiamBeaconPage pangiamBeaconPage;

    @BeforeClass
    public void start(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        System.out.println("Pangiam functionality verification started");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("our test finished");
    }
    @BeforeMethod
    public void setup() throws InterruptedException {

        driver=new ChromeDriver();
        System.out.println("test is being executed");
        driver.get("https://pangiam.com");
        driver.manage().window().maximize();
        pangiamHomePage=new PangiamHomePage(driver);
        pangiamBeaconPage=new PangiamBeaconPage(driver);
        actions=new Actions(driver);
        Thread.sleep(2000);

    }
    @AfterMethod
    public void teardown() throws InterruptedException {
        driver.quit();
        System.out.println("Test executed");
    }
    @Test
    public void pangiamFunction() throws InterruptedException {

        actions.moveToElement(pangiamHomePage.ourProductServiceButton).perform();
        pangiamHomePage.pangiamBeaconButton.click();
        driver.findElement(By.xpath("//*[@id='hs-eu-cookie-confirmation-button-group']/a")).click();
        driver.findElement(By.xpath("//*[@id=\"wt-cli-accept-all-btn\"]")).click();

    }
}
