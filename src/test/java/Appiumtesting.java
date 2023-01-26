import io.appium.java_client.AppiumDriver;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Appiumtesting {
    static AppiumDriver<MobileElement> driver;


@Test
    public static void test1() throws MalformedURLException {



        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554");
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
      //  cap.setCapability("deviceName", "emulator-5554");
      //  cap.setCapability("platformName", "Android");

        cap.setCapability("appPackage", "com.android.calculator2");
        cap.setCapability("appActivity", ".Calculator");
       // URL url = new URL("http://127.0.0.1:4723/wd/hub");
       AndroidDriver<AndroidElement> dc = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);
    MobileElement el1 = (MobileElement) dc.findElementById("com.android.calculator2:id/digit_7");
    el1.click();
    MobileElement el2 = (MobileElement) dc.findElementByAccessibilityId("plus");
    el2.click();
    MobileElement el3 = (MobileElement) dc.findElementById("com.android.calculator2:id/digit_5");
    el3.click();
    MobileElement el4 = (MobileElement) dc.findElementByAccessibilityId("equals");
    el4.click();
    MobileElement el5 = (MobileElement) dc.findElementById("com.android.calculator2:id/result");
    el5.click();


    }

    }





