package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QuotePage extends BasePage {

    @FindBy(xpath = "//*[text()='Quote']")
    public WebElement quoteTab;

    @FindBy(xpath = "//label[text()='Open']/following-sibling::p")
    public WebElement open;

    @FindBy(xpath = "(//div[@class='_1G7n38q1bb sc-bdVaJa lbvrig'])[11]/p")
    public WebElement marketCap;

}
