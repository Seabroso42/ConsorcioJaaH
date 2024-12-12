package model;

import java.util.ArrayList;

public class Pagamento {
    private long id;
    private double valor;
    private Boolean status;


    public Pagamento(long id, double valor, Boolean status) {
        this.id = id;
        this.valor = valor;
        this.status = status;
    }


    public long getId() {
        return id;
    }


    public void setId(long id) {
        this.id = id;
    }


    public double getValor() {
        return valor;
    }


    public void setValor(double valor) {
        this.valor = valor;
    }


    public Boolean getStatus() {
        return status;
    }


    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "\n{" + 
                "id=" + id + '\n' +
                ", valor=" + valor + '\n' +
                ", status=" + status + '\n' +
                "} \n ";
    }
   
}
