package model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Pix extends Pagamento {
    private String codigoPix;
    private String chavePix;
    private String pagador;

    public Pix(long id, double valor, String codigoPix, String chavePix, String pagador, Boolean status,Pagamento pagamento) {
        super(id, valor, status);
        this.codigoPix = codigoPix;
        this.chavePix = chavePix;
        this.pagador = pagador;
    }
    @Override
    public String toString() {
        return "\n{" + 
                "codigoPix='" + codigoPix + '\n' +
                ", chavePix='" + chavePix + '\n' +
                ", pagador='" + pagador + '\n' +
                ", id=" + getId() + '\n' +
                ", valor=" + getValor() + '\n' +
                ", status=" + getStatus() + '\n' +
                "} \n ";
    }

}
