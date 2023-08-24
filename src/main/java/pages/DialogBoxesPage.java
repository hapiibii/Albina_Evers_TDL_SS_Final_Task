package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.objects.Button;
import pages.objects.TextField;

public class DialogBoxesPage {

    public Button createNewUser = new Button("Create new user", "id=create-user");
    public Button dismissButton = new Button("Close ad", "xpath=//*[@id='dismiss-button']");
    public TextField name = new TextField("Name", "id=name", "Albina");
    public TextField email = new TextField("Email", "id=email", "awimbawe@gmail.com");
    public TextField password = new TextField("Password", "id-password", "password");
    private WebDriver driver;

    public DialogBoxesPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean dismissButtonInitialized() {
        return dismissButton.isButtonPresent();
    }

    public boolean createButtonInitialized() {
        return createNewUser.isButtonPresent();
    }

    public void createNewUser() {
        this.name.clearField();
        this.name.setValue();
        this.email.clearField();
        this.email.setValue();
        this.password.clearField();
        this.password.setValue();
    }

    public void clickDismissButtonButtonWithWait() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(dismissButton.getWebElement(dismissButton.getLocator()))).click();

    }

}
