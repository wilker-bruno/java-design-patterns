package strategy.entity;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder(setterPrefix = "set")
public class Pedido {
    private String clienteNome;
    private String clienteCPF;
    private LocalDate pedidoData;
    private Long pedidoNumero;
    private Double pedidoValorTotal;
}
