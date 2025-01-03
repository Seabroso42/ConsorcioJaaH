package repository;

import lombok.Data;
import model.Pagamento;


@Data
public class PagamentoRepository {
    private Pagamento[] pagamentos;
    private int indice;
    private static PagamentoRepository instance;

    public static PagamentoRepository getInstance() {
        if (instance == null) {
            instance = new PagamentoRepository();
        }
        return instance;
    }

    public PagamentoRepository() {
        this.pagamentos = new Pagamento[100];
        this.indice = 0;

    }

    public void inserir(Pagamento pagamento) {
        pagamentos[indice] = pagamento;
        indice = indice + 1;
    }

    public void atualizar(Pagamento pagamento) {
        int i = getIndice(pagamento.getId());
        if (i == indice) {
            System.out.println("Pagamento Não Encontrado");
        } else {
            pagamentos[i] = pagamento;
        }
    }

    public void remover(Long id) {
        int i = getIndice(id);
        if (i == indice) {
            System.out.println("Pagamento Não Encontrado");
        } else {
            pagamentos[i] = pagamentos[indice - 1];
            indice = indice - 1;
        }
    }

    public Pagamento procurar(Long id) {
        Pagamento resposta = null;
        int i = getIndice(id);
        if (i == indice) {
            System.out.println("Pagamento Não Encontrado");
        } else {
            resposta = pagamentos[i];
        }
        return resposta;
    }
public boolean existe (Long id){
        boolean resposta;
        int i = getIndice(id);
        if (i == indice){
            resposta = false;
        }else{
            resposta = true;
        }
        return resposta;
}

 private int getIndice(Long id) {
        Long n;
        boolean achou = false;
        int i = 0;
        while ((!achou) && (i<indice)){
            n = pagamentos[i].getId();
            if (n.equals(id)){
                achou = true;
            }else{
                i = i + 1;
            }
        }
        return i;
    }
    public void imprimirPagamentos() {
        for (Pagamento pagamento : pagamentos) {
            System.out.println(pagamento);
        }
    }}