package repository;

import lombok.Data;
import model.Contrato;

@Data
public class ContratoRepository {
    private Contrato[] contratos;
    private int indice;
    private static ContratoRepository instance;

    public static ContratoRepository getInstance(){
        if (instance==null){
            instance = new ContratoRepository();
        }
        return instance;
    }

    public ContratoRepository() {
        contratos = new Contrato[100];
        indice = 0;
    }

    public void inserir(Contrato contrato) {
        contratos[indice] = contrato;
        indice = indice + 1;
    }

    public void atualizar(Contrato contrato)  {
        int i = getIndice(contrato.getIdContrato());
        if (i == indice) {
            System.out.println("Relatório Não Encontrado");
        } else {
            contratos[i] = contrato;
        }
    }

    public void remover(Long idcontrato){
        int i = getIndice(idcontrato);
        if (i == indice) {
            System.out.println("Contrato Não Encontrado");
        } else {
            contratos[i] = contratos[indice - 1];
            indice = indice - 1;
        }
    }

    public Contrato procurar(Long idcontrato) {
        Contrato resposta = null;
        int i = getIndice(idcontrato);
        if (i == indice) {
            System.out.println("Contrato Não Encontrado");
        } else {
            resposta = contratos[i];
        }
        return resposta;
    }

    public boolean existe(Long idcontrato) {
        boolean resposta;
        int i = getIndice(idcontrato);
        if (i == indice) {
            resposta = false;
        } else {
            resposta = true;
        }
        return resposta;
    }

    private int getIndice(Long id) {
        Long n;
        boolean achou = false;
        int i = 0;
        while ((!achou) && (i < indice)) {
            n = contratos[i].getIdContrato();
            if (n.equals(id)) {
                achou = true;
            } else {
                i = i + 1;
            }
        }
        return i;
    }

    public void imprimirContratos() {
        for (int i = 0; i < indice; i++) {
            System.out.println("Cliente Vinculado:" + contratos[i].getUsuarioVinculado().getNome());
            System.out.println("Status dos pagamentos:" + String.valueOf(contratos[i].getStatusCliente()));
        }
    }
}
