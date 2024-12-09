package model;

import java.time.LocalDate;

public class Boleto {
    private long id;
    private double valor;
    private String codigoBoleto;
    private LocalDate vencimento;
    private String pagador;
    private Boolean status;
    private Pagamento pagamento;

    public Boleto(long id, double valor, String codigoBoleto, LocalDate vencimento, String pagador, Boolean status, Pagamento pagamento) {
        this.id = id;
        this.valor = valor;
        this.codigoBoleto = codigoBoleto;
        this.vencimento = vencimento;
        this.pagador = pagador;
        this.status = status;
        this.pagamento = pagamento;
    }
}
