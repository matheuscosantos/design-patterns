package models.factories;

import models.Button;
import models.MacButton;
import models.MacTextBox;
import models.TextBox;

// Fábrica concreta para o tema Mac
public class MacFactory implements GUIFactory{
    @Override
    public Button createButton() { return new MacButton(); }

    @Override
    public TextBox createTextBox() {
        return new MacTextBox();
    }
}
