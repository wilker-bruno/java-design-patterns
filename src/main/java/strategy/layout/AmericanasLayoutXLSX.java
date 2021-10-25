package strategy.layout;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import strategy.entity.Pedido;
import strategy.mapper.MapearParaPedido;

import java.time.LocalDate;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class AmericanasLayoutXLSX implements MapearParaPedido {
    private String clienteNome;

    private String clienteCPF;

    private LocalDate pedidoData;

    private Long pedidoNumero;

    private Double pedidoValorTotal;

    @Override
    public Pedido mapearParaPedido() {
        return Pedido
                .builder()
                .setClienteNome(this.clienteNome)
                .setClienteCPF(this.clienteCPF)
                .setPedidoData(this.pedidoData)
                .setPedidoNumero(this.pedidoNumero)
                .setPedidoValorTotal(this.pedidoValorTotal)
                .build();
    }
}
