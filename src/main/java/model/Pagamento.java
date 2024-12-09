package model;

import java.util.ArrayList;

public class Pagamento {
    private long id;
    private int parcela;
    private Boolean status;
    private ArrayList<Boleto> boletos;
    private ArrayList<Pix> pixs;
    private ArrayList<CartaoDeCredito> cartoesDeCredito;

    public Pagamento(long id, int parcela, Boolean status, ArrayList<Boleto> boletos, ArrayList<Pix> pixs, ArrayList<CartaoDeCredito> cartoesDeCredito) {
        this.id = id;
        this.parcela = parcela;
        this.status = status;
        this.boletos = boletos;
        this.pixs = pixs;
        this.cartoesDeCredito = cartoesDeCredito;
    }
}
