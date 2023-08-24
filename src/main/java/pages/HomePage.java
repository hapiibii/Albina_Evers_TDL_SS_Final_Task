package pages;

import org.openqa.selenium.WebDriver;
import pages.objects.Button;

public class HomePage {

    public Button dialogBoxButton = new Button("DialogBox", "xpath=//a[contains(text(), 'DialogBox')]");
    public Button tabsButton = new Button("Tabs", "xpath=//a[text()='Tabs']");
    public Button progressBarButton = new Button("ProgressBar", "xpath=//a[contains(text(), 'ProgressBar')]");

    private WebDriver driver;

    public HomePage(WebDriver driver)
    {
        this.driver = driver;
    }

    public boolean dialogBoxButtonInitialized() {
        return dialogBoxButton.isButtonPresent();
    }
}
