package strategy.strategy;

import strategy.mapper.MapearParaPedido;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public interface LerArquivoStrategy<T extends MapearParaPedido> {
    List<T> lerArquivo(InputStream arquivoInputStream) throws IOException;
}
