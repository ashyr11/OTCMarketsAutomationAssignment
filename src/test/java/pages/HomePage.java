package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(xpath = "(//input[@placeholder='Quote'])[1]")
    public WebElement quoteInput;

    @FindBy(xpath = "//div[@class='Rnxv8ImvYu']")
    public WebElement quoteInputClick;

    @FindBy(xpath = "//h1[@class='_2D4XgQ0gJK']")
    public WebElement companySymbol;

    @FindBy(xpath = "//h1[@class='_1rzoYNl62n']")
    public WebElement companyName;




}
