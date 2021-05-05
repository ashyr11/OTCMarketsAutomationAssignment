package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SecurityDetailsPage extends BasePage {

    @FindBy(xpath = "//a[text()='Security Details']")
    public WebElement securityDetailsTab;

    @FindBy(xpath = "(//div[@class='_8AXJn4ourf sc-htpNat jtWIOA sc-bdVaJa gRrvFh'])[1]/div[2]")
    public WebElement securityMarketCap;

    @FindBy(xpath = "(//div[@class='_8AXJn4ourf sc-htpNat jtWIOA sc-bdVaJa gRrvFh'])[1]/div[3]")
    public WebElement date;

}
