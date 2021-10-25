package strategy.layout;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvCustomBindByName;
import com.opencsv.bean.CsvDate;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import strategy.entity.Pedido;
import strategy.mapper.MapearParaPedido;
import utils.DoubleConverter;

import java.time.LocalDate;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class MagazineLuizaLayoutCSV implements MapearParaPedido {
    @CsvBindByName(column = "Cliente")
    private String cliente;

    @CsvBindByName(column = "CPF")
    private String cpf;

    @CsvDate(value = "dd/MM/yyyy")
    @CsvBindByName(column = "Data")
    private LocalDate data;

    @CsvBindByName(column = "Num Pedido")
    private Long numeroPedido;

    @CsvCustomBindByName(column = "Total", converter = DoubleConverter.class)
    private Double total;

    @Override
    public Pedido mapearParaPedido() {
        return Pedido
                .builder()
                .setClienteNome(this.cliente)
                .setClienteCPF(this.cpf)
                .setPedidoData(this.data)
                .setPedidoNumero(this.numeroPedido)
                .setPedidoValorTotal(this.total)
                .build();
    }
}
