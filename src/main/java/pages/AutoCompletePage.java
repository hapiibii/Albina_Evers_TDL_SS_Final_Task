package pages;

import org.openqa.selenium.WebDriver;
import pages.objects.Button;
import pages.objects.TextField;

public class AutoCompletePage {
    public TextField searchField = new TextField("Search", "xpath=//input[@id='search']", "and");
    public Button andersAndersson = new Button("anders andersson", "id=ui-id-22");
    private WebDriver driver;

    public AutoCompletePage(WebDriver driver)
    {
        this.driver = driver;
    }

    public boolean searchFieldInitialized() {
        return searchField.isFieldPresent();
    }
}
