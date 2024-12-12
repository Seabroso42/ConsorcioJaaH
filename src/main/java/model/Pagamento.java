package model;

import lombok.Data;

@Data
public abstract class Pagamento implements Processo {
    private long id;
    private Cliente pagador;
    private double valor;
    private Boolean status;

    public Pagamento(){}
    public Pagamento(long id, double valor, Boolean status) {
        this.id = id;
        this.valor = valor;
        this.status = status;
    }

    @Override
    public void sendRelatorio(){}

   
}
