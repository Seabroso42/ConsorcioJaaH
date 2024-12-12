package model;

public class CartaoDeCredito extends Pagamento {
    private int parcelas;

    public int getParcelas() {
        return parcelas;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }

    public CartaoDeCredito(long id, int parcelas, Pagamento pagamento) {
        super(id, pagamento.getValor(), pagamento.getStatus());
        this.parcelas = parcelas;
    }
}
