package testing;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Appiumtesting {
    static AppiumDriver<MobileElement> driver;


    @Test
    public static void test1() throws MalformedURLException {


        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        //  cap.setCapability("deviceName", "emulator-5554");
        //  cap.setCapability("platformName", "Android");

        cap.setCapability("appPackage", "org.chromium.webview_shell");
        cap.setCapability("appActivity", "org.chromium.webview_shell.WebViewBrowserActivity");
         URL url = new URL("http://127.0.0.1:4723/wd/hub");
         driver = new AppiumDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);
        MobileElement el1 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout");
        el1.click();
        MobileElement el2 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout");
        el2.click();
        MobileElement el3 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout");
        el3.click();
        MobileElement el4 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout");
        el4.click();
        MobileElement el5 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout");
        el5.click();

    }
}





