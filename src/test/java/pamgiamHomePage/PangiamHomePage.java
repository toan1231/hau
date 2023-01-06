package pamgiamHomePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PangiamHomePage {
    WebDriver driver;
    public PangiamHomePage(WebDriver driver){
        PageFactory.initElements(driver,this);

    }
    @FindBy(xpath = "(//*[@id='menu-item-211']/a/span)[1]")
    public WebElement ourProductServiceButton;
    @FindBy(xpath = "//*[@id='menu-item-187']/a/span")
    public WebElement pangiamBeaconButton;
    @FindBy(xpath = "//*[@id='menu-item-350']/a/span")
    public WebElement pangiamBeaconVeriScan;
    @FindBy(xpath = "//*[@id='menu-item-349']/a/span")
    public WebElement pangiamTrueFaceButton;
    @FindBy(xpath = "//*[@id='menu-item-348']/a/span")
    public WebElement pangiamMeridianButton;
    @FindBy(xpath = "//*[@id='menu-item-517']/a/span")
    public WebElement pangiamDARTMOUNTButton;
    @FindBy(xpath = "//*[@id='menu-item-599']/a/span")
    public WebElement pangiamConsultantServiceButton;

}
