package models;

public class Carro implements Transporte{
    @Override
    public void entregar() {
        System.out.println("Entrega feita por carro.");
    }
}
