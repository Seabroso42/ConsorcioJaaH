package model;

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

    public String getCodigoPix() {
        return codigoPix;
    }

    public void setCodigoPix(String codigoPix) {
        this.codigoPix = codigoPix;
    }

    public String getChavePix() {
        return chavePix;
    }

    public void setChavePix(String chavePix) {
        this.chavePix = chavePix;
    }

    public String getPagador() {
        return pagador;
    }

    public void setPagador(String pagador) {
        this.pagador = pagador;
    }

}
