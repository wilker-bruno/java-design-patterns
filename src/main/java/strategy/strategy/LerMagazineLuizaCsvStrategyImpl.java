package strategy.strategy;

import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.bean.HeaderColumnNameMappingStrategy;
import strategy.layout.MagazineLuizaLayoutCSV;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class LerMagazineLuizaCsvStrategyImpl implements LerArquivoStrategy<MagazineLuizaLayoutCSV> {
    @Override
    public List<MagazineLuizaLayoutCSV> lerArquivo(InputStream arquivo) {
        HeaderColumnNameMappingStrategy<MagazineLuizaLayoutCSV> strategy = new HeaderColumnNameMappingStrategy<>();
        strategy.setType(MagazineLuizaLayoutCSV.class);

        CsvToBeanBuilder<MagazineLuizaLayoutCSV> csvBuilder =
                new CsvToBeanBuilder<>(new InputStreamReader(arquivo, StandardCharsets.UTF_8));

        return csvBuilder
                .withMappingStrategy(strategy)
                .withType(MagazineLuizaLayoutCSV.class)
                .withSeparator(',')
                .withIgnoreLeadingWhiteSpace(true)
                .build()
                .parse();
    }
}
