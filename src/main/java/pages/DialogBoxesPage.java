package pages;

import org.openqa.selenium.WebDriver;
import pages.objects.Button;
import pages.objects.TextField;

public class DialogBoxesPage {

    public Button createNewUser = new Button("Create new user", "xpath=//button[@id='create-user']");
    public TextField name = new TextField("Name", "id=name", "Albina");
    public TextField email = new TextField("Email", "id=email", "awimbawe@gmail.com");
    public TextField password = new TextField("Password", "id=password", "password");
    public Button messageBoxTab = new Button("Message Box", "xpath=//li[@id='Message Box']");
    public Button okButton = new Button("OK", "xpath=//button[contains(text(), 'Ok')]");
    private WebDriver driver;

    public DialogBoxesPage(WebDriver driver) {
        this.driver = driver;
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

}
