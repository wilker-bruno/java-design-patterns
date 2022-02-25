package abstractFactory.entity;

import abstractFactory.factory.ComputadorFactory;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Computador {
    private String placaMae;
    private String memoriaRAM;
    private String processador;
    private String placaVideo;
    private String fonteAlimentacao;
    private String armazenamentoInterno;

    public Computador(ComputadorFactory factory) {
        this.placaMae = factory.createPlacaMae();
        this.memoriaRAM = factory.createMemoriaRAM();
        this.processador = factory.createProcessador();
        this.placaVideo = factory.createPlacaVideo();
        this.fonteAlimentacao = factory.createFonteAlimentacao();
        this.armazenamentoInterno = factory.createArmazenamentoInterno();
    }

    public void printComponentes() {
        System.out.println("Placa-mãe: " + this.placaMae);
        System.out.println("Processador: " + this.processador);
        System.out.println("Memória RAM: " + this.memoriaRAM);
        System.out.println("Placa de Vídeo: " + this.placaVideo);
        System.out.println("Fonte de Alimentação: " + this.fonteAlimentacao);
        System.out.println("Armazenamento Interno: " + this.armazenamentoInterno);
    }
}
