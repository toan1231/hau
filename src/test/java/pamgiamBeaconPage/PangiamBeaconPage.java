package pamgiamBeaconPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PangiamBeaconPage {
    WebDriver driver;
    public PangiamBeaconPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id=\"fws_63b7679e9c580\"]/div[2]/div[1]/div/div/p/text()")

    public WebElement pangiamBeaconMessage;

}
