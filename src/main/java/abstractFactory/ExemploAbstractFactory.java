package abstractFactory;

import abstractFactory.entity.Computador;
import abstractFactory.factory.ComputadorEntradaFactory;
import abstractFactory.factory.ComputadorFactory;
import abstractFactory.factory.ComputadorHighEndFactory;

public class ExemploAbstractFactory {
    private static ComputadorFactory getFactory(String tipoComputador) {
        if ("entrada".equalsIgnoreCase(tipoComputador))
            return new ComputadorEntradaFactory();
        if ("high end".equalsIgnoreCase(tipoComputador))
            return new ComputadorHighEndFactory();

        throw new IllegalArgumentException("Não há fábrica para o tipo desejado!");
    }

    public static void main(String[] args) {
        ComputadorFactory factory = getFactory("entrada");
        Computador pcGamer = new Computador(factory);
        pcGamer.printComponentes();
    }
}
