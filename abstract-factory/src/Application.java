import models.Button;
import models.TextBox;
import models.factories.GUIFactory;

public class Application {
    private Button button;
    private TextBox textBox;

    public Application(GUIFactory factory){
        button = factory.createButton();
        textBox = factory.createTextBox();
    }

    public void render(){
        button.paint();
        textBox.render();
    }
}
