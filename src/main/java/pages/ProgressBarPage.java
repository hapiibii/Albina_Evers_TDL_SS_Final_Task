package pages;

import org.openqa.selenium.WebDriver;
import pages.objects.Button;

public class ProgressBarPage {

    public Button randomProgressBarSection = new Button("Random Progress Bar", "xpath=//li[@id='Random Progress Bar']");
    public Button randomColorButton = new Button("Random Color", "id=colorButton");
    public Button randomValueButton = new Button("Random Value - Determine", "xpath=//button[@id='numButton']");
    private WebDriver driver;

    public ProgressBarPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public boolean randomProgressBarInitialized() {
        return randomProgressBarSection.isButtonPresent();
    }


}
