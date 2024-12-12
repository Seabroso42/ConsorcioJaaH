package model;

import java.time.LocalDate;

public class Boleto extends Pagamento {
    private String codigoBoleto;
    private LocalDate vencimento;
    private String pagador;
    
    
    
    public Boleto(long id, double valor, String codigoBoleto, LocalDate vencimento, String pagador, Boolean status, Pagamento pagamento) {
        super(id,valor,status);
        this.codigoBoleto = codigoBoleto;
        this.vencimento = vencimento;
        this.pagador = pagador;
    }


    public String getCodigoBoleto() {
        return codigoBoleto;
    }
    public void setCodigoBoleto(String codigoBoleto) {
        this.codigoBoleto = codigoBoleto;
    }
    public LocalDate getVencimento() {
        return vencimento;
    }
    public void setVencimento(LocalDate vencimento) {
        this.vencimento = vencimento;
    }
    public String getPagador() {
        return pagador;
    }
    public void setPagador(String pagador) {
        this.pagador = pagador;
    }

    
}
