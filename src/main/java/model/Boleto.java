package model;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;

@EqualsAndHashCode(callSuper = true)
@Data
public class Boleto extends Pagamento {
    private String codigoBoleto;
    private LocalDate vencimento;
    
    public Boleto(){}
    
    public Boleto(long id, double valor, String codigoBoleto, LocalDate vencimento, Boolean status, Pagamento pagamento) {
        super(id,valor,status);
        this.codigoBoleto = codigoBoleto;
        this.vencimento = vencimento;
    }

    @Override
    public String toString() {
        return "\n{" + 
                "codigoBoleto='" + codigoBoleto + '\n' +
                ", vencimento=" + vencimento + '\n' +
                ", pagador='" + pagador + '\n' +
                ", id=" + getId() + '\n' +
                ", valor=" + getValor() + '\n' +
                ", status=" + getStatus() + '\n' +
                "} \n ";
    }
    
}
