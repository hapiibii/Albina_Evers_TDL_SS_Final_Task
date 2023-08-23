package pages;

import pages.objects.Button;
import pages.objects.TextField;

public class DialogBoxesPage {

    public Button createNewUser = new Button("Create new user", "id=create-user");
    public TextField name = new TextField("Name", "id=name", "Albina");
    public TextField email = new TextField("Email", "id=email", "awimbawe@gmail.com");
    public TextField password = new TextField("Password", "id-password", "password");

    public boolean initialized() {
        return createNewUser.isClicked();
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
