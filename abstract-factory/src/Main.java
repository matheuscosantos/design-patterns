import models.factories.GUIFactory;
import models.factories.MacFactory;
import models.factories.WindowsFactory;

public class Main {
    public static void main(String[] args) {
        GUIFactory factory;

        String os = "Windows";
        if (os.equals("Windows")){
            factory = new WindowsFactory();
        }else{
            factory = new MacFactory();
        }

        Application app = new Application(factory);
        app.render();
    }
}