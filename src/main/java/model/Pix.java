package model;

public class Pix {
    private long id;
    private double valor;
    private String codigoPix;
    private String chavePix;
    private String pagador;
    private Boolean status;
    private Pagamento pagamento;

    public Pix(long id, double valor, String codigoPix, String chavePix, String pagador, Boolean status, Pagamento pagamento) {
        this.id = id;
        this.valor = valor;
        this.codigoPix = codigoPix;
        this.chavePix = chavePix;
        this.pagador = pagador;
        this.status = status;
        this.pagamento = pagamento;
    }
}
