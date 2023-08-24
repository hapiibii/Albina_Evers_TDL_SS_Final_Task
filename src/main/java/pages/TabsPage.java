package pages;

import org.openqa.selenium.WebDriver;
import pages.objects.Button;

public class TabsPage {
    private WebDriver driver;
    public Button secondSectionButton = new Button("Section 2", "id=ui-id-3");
    public Button firstSectionButton = new Button("Section 1", "id=ui-id-1");

    public TabsPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean sectionOneInitialized() {
        return firstSectionButton.isButtonPresent();
    }
}
