package pages;

import pages.objects.Button;

public class HomePage {

    public Button dialogBox = new Button("DialogBox", "xpath=//a[contains(text(), 'DialogBox')]");

    public boolean initialized() {
        return dialogBox.isClicked();
    }
}
