package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.objects.Button;

public class HomePage {

    public Button dialogBoxButton = new Button("DialogBox", "xpath=//a[contains(text(), 'DialogBox')]");
    private WebDriver driver;

    public HomePage(WebDriver driver)
    {
        //PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public boolean initialized() {
        return dialogBoxButton.isButtonPresent();
    }
    public void clickDialogBoxButtonWithWait() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(dialogBoxButton.getWebElement(dialogBoxButton.getLocator()))).click();

    }
}
