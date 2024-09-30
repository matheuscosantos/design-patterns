package models.factories;

import models.Transporte;

public abstract class TransporteFactory {

    // Método abstrato que será implementado pelas subclasses
    // Cada subclasse irá definir como Transporte será criado
    public abstract Transporte criarTransporte();

    // Método concreto que realiza a entrega
    // Ele utiliza o método criarTransporte() para obter um instância de Transporte
    // e em seguida chama o método entrega() dessa instância
    public void realizarEntrega(){
        Transporte transporte = criarTransporte();
        transporte.entregar();
    }
}
