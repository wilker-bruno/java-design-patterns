package abstractFactory.factory;

public class ComputadorEntradaFactory implements ComputadorFactory {
    @Override
    public String createPlacaMae() {
        return "MSI MAG B550 Tomahawk AMD AM4";
    }

    @Override
    public String createProcessador() {
        return "AMD Ryzen 5 5600G";
    }

    @Override
    public String createMemoriaRAM() {
        return "Kingston Fury Beast 16GB DDR4 3200Mhz";
    }

    @Override
    public String createPlacaVideo() {
        return null;
    }

    @Override
    public String createFonteAlimentacao() {
        return "Corsair 550W 80 Plus Bronze";
    }

    @Override
    public String createArmazenamentoInterno() {
        return "SSD M2 WD Green 480GB";
    }
}
