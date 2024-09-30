package models.factories;

import models.Carro;
import models.Transporte;

// A classe CarroFactory estende a classe abstrata TransporteFactory
// Ela é responsável por criar intâncias de Carro, implementando o método abstato criarTranporte
public class CarroFactory extends TransporteFactory{
    @Override
    public Transporte criarTransporte() {
        return new Carro();
    }
}
