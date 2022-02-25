package abstractFactory.factory;

public interface ComputadorFactory {
    String createPlacaMae();

    String createProcessador();

    String createMemoriaRAM();

    String createPlacaVideo();

    String createFonteAlimentacao();

    String createArmazenamentoInterno();
}
