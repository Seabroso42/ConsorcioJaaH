package model;

public class CartaoDeCredito {
    private long id;
    private int parcelas;
    private Pagamento pagamento;

    public CartaoDeCredito(long id, int parcelas, Pagamento pagamento) {
        this.id = id;
        this.parcelas = parcelas;
        this.pagamento = pagamento;
    }
}
