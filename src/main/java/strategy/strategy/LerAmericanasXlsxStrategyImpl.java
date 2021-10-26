package strategy.strategy;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import strategy.layout.AmericanasLayoutXLSX;

import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class LerAmericanasXlsxStrategyImpl implements LerArquivoStrategy<AmericanasLayoutXLSX> {
    @Override
    public List<AmericanasLayoutXLSX> lerArquivo(InputStream arquivoInputStream) throws IOException {
        List<AmericanasLayoutXLSX> americanasXLSX = new ArrayList<>();

        Workbook workbook = WorkbookFactory.create(arquivoInputStream);
        Sheet sheet = workbook.getSheetAt(0);

        for (int rowPos = 1; rowPos < sheet.getPhysicalNumberOfRows(); rowPos++) {
            Row row = sheet.getRow(rowPos);
            AmericanasLayoutXLSX americanasLayoutXLSX = new AmericanasLayoutXLSX();
            americanasLayoutXLSX.setClienteNome(String.valueOf(row.getCell(0)));
            americanasLayoutXLSX.setClienteCPF(String.valueOf(row.getCell(1)));
            americanasLayoutXLSX.setPedidoData(converterParaLocalDate(String.valueOf(row.getCell(2))));
            americanasLayoutXLSX.setPedidoNumero(Long.valueOf(String.valueOf(row.getCell(3))));
            americanasLayoutXLSX.setPedidoValorTotal(Double.parseDouble(String.valueOf(row.getCell(4))));
            americanasXLSX.add(americanasLayoutXLSX);
        }

        return americanasXLSX;
    }

    private LocalDate converterParaLocalDate(String data) {
        return LocalDate.parse(data, DateTimeFormatter.ofPattern("dd-MMM-yyyy"));
    }
}
