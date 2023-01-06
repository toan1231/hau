package pamgiamHomePage;

import Utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;
import pamgiamBeaconPage.PangiamBeaconPage;

public class PangiamHomePageTest {
    WebDriver driver;
    PangiamHomePage pangiamHomePage;
    PangiamBeaconPage pangiamBeaconPage;
    Actions actions;

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
        driver.get(ConfigurationReader.getProperty("pangiamBeacon.properties","pangiam.url"));
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

       String actualOurProductServiceButton=pangiamHomePage.ourProductServiceButton.getText();
       String expectedPangiamOurProductServiceButton="OUR PRODUCTS & SERVICES";
       Assert.assertEquals(actualOurProductServiceButton,expectedPangiamOurProductServiceButton);
       actions.moveToElement(pangiamHomePage.ourProductServiceButton).perform();
       Thread.sleep(2000);


       String actualTextPangiamBeacon= pangiamHomePage.pangiamBeaconButton.getText();
       String expectedTextPangiamBeacon="Pangiam Beacon";
       Assert.assertEquals(actualTextPangiamBeacon,expectedTextPangiamBeacon);


       String actualPangiamVeriScanButton=pangiamHomePage.pangiamBeaconVeriScan.getText();
       String expectedPangiamVeriScanButton="Pangiam veriScan";
       Assert.assertEquals(actualPangiamVeriScanButton,expectedPangiamVeriScanButton);

       String actualPangiamTrueFace=pangiamHomePage.pangiamTrueFaceButton.getText();
       String expectedPangiamTrueFaceButton="Pangiam Trueface";
       Assert.assertEquals(actualPangiamTrueFace,expectedPangiamTrueFaceButton);

       String actualPangiamMeridianButton=pangiamHomePage.pangiamMeridianButton.getText();
       String expectedPangiamMeridianButton="Pangiam Meridian";
       Assert.assertEquals(actualPangiamMeridianButton,expectedPangiamMeridianButton);

       String actualPangiamProjectDARTMOUNTButton=pangiamHomePage.pangiamDARTMOUNTButton.getText();
       String expectedPangiamProjectDARTMOUNT="Pangiam Project DARTMOUTH";
       Assert.assertEquals(actualPangiamProjectDARTMOUNTButton,expectedPangiamProjectDARTMOUNT);

       String actualPangiamConsultantServiceButton=pangiamHomePage.pangiamConsultantServiceButton.getText();
       String expectedPangiamConsultantServiceButton="Consulting Services";
       Assert.assertEquals(actualPangiamConsultantServiceButton,expectedPangiamConsultantServiceButton);
    }
    }

