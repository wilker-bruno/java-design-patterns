package abstractFactory.factory;

public class ComputadorHighEndFactory implements ComputadorFactory {
    @Override
    public String createPlacaMae() {
        return "Asus ROG Maximus Z690 Hero";
    }

    @Override
    public String createProcessador() {
        return "Intel Core i9 12900K";
    }

    @Override
    public String createMemoriaRAM() {
        return "Kingston Fury Beast 32GB DDR5 5200Mhz";
    }

    @Override
    public String createPlacaVideo() {
        return "NVIDIA GeForce RTX 3090 24GB GDDR6X";
    }

    @Override
    public String createFonteAlimentacao() {
        return "Cooler Master V1000 Platinum 1000W";
    }

    @Override
    public String createArmazenamentoInterno() {
        return "SDD M2 Nvme Samsung Evo 970 500GB";
    }
}
