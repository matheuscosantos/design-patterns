import models.factories.BicicletaFactory;
import models.factories.CarroFactory;
import models.factories.TransporteFactory;

public class Main {
    public static void main(String[] args) {
        TransporteFactory carroFactory = new CarroFactory();
        carroFactory.realizarEntrega();

        TransporteFactory bicicletaFactory = new BicicletaFactory();
        bicicletaFactory.realizarEntrega();
    }
}