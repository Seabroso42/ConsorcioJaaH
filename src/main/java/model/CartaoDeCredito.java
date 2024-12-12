package model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class CartaoDeCredito extends Pagamento {
    private int parcelas;
    private String numeroCartao;

    public CartaoDeCredito(){}
    public CartaoDeCredito(int parcelas) {
        this.parcelas = parcelas;
    }
}
