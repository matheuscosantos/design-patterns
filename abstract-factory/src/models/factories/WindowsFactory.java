package models.factories;

import models.Button;
import models.TextBox;
import models.WindowsButton;
import models.WindowsTextBox;

// Fábrica concreta para o tema Windows
public class WindowsFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public TextBox createTextBox() {
        return new WindowsTextBox();
    }
}
