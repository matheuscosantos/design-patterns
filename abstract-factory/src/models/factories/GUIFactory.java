package models.factories;

import models.Button;
import models.TextBox;

public interface GUIFactory {
    Button createButton();
    TextBox createTextBox();
}
