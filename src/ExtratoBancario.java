import lombok.Data;

import java.util.Date;

@Data
public class ExtratoBancario {

    private String nomeBanco;
    private String nomeCliente;
    private int conta;
    private int agencia;
    private Date data;
    private Double valor;
    private String operacao;
    private Double saldoFinal;
}
