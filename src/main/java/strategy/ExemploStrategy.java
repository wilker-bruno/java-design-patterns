package strategy;

import strategy.entity.Pedido;
import strategy.mapper.MapearParaPedido;
import strategy.strategy.LerAmericanasXlsxStrategyImpl;
import strategy.strategy.LerArquivoStrategy;
import strategy.strategy.LerMagazineLuizaCsvStrategyImpl;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class ExemploStrategy {
    public static void main(String[] args) throws IOException {
        List<Pedido> americanaPedidos = converterArquivoParaPedidos(new LerAmericanasXlsxStrategyImpl(),
                new FileInputStream("src/main/resources/exemplo-americanas.xlsx"));
        System.out.println("--> Americanas");
        americanaPedidos.forEach(System.out::println);

        List<Pedido> magazineLuizaPedidos = converterArquivoParaPedidos(new LerMagazineLuizaCsvStrategyImpl(),
                new FileInputStream("src/main/resources/exemplo-magazine-luiza.csv"));
        System.out.println("--> Magazine Luiza");
        magazineLuizaPedidos.forEach(System.out::println);
    }

    private static <T extends MapearParaPedido> List<Pedido> converterArquivoParaPedidos(LerArquivoStrategy<T> strategy, InputStream arquivo) throws IOException {
        List<Pedido> pedidos = new ArrayList<>();
        List<T> objetosConvertidos = strategy.lerArquivo(arquivo);
        objetosConvertidos.forEach(objeto -> pedidos.add(objeto.mapearParaPedido()));
        return pedidos;
    }
}
