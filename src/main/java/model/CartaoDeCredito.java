package model;

public class CartaoDeCredito extends Pagamento {
    private long id;
    private int parcelas;
    private Pagamento pagamento;
    private String numeroCartao;

    public CartaoDeCredito(long id, int parcelas, Pagamento pagamento) {
        super(id, pagamento.getValor(), pagamento.getStatus());
        this.id = id;
        this.parcelas = parcelas;
        this.pagamento = pagamento;
    }

    public long getId() {
        return id;
    }

    public int getParcelas() {
        return parcelas;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }
}
