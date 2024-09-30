package models.factories;

import models.Bicicleta;
import models.Transporte;

// A classe BicicletaFactory estende a classe abstrata TransporteFactory
// Ela é responsável por criar intâncias de Bicicleta, implementando o método abstato criarTranporte
public class BicicletaFactory extends TransporteFactory{
    @Override
    public Transporte criarTransporte() {
        return new Bicicleta();
    }
}
