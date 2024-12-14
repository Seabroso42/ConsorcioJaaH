package repository;

import lombok.Data;
import model.Pagamento;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Data
public class PagamentoRepository {
    private List<Pagamento> pagamentos = new ArrayList<>();
    private static PagamentoRepository instance;

    public static PagamentoRepository getInstance(){
        if (instance==null){
            instance = new PagamentoRepository();
        }
        return instance;
    }

    public List<Pagamento> getAll() {
        return new ArrayList<>(pagamentos);
    }

    public Optional<Pagamento> getById(long id) {
        for (Pagamento pagamento : pagamentos) {
            if (pagamento.getId() == id) {
                return Optional.of(pagamento);
            }
        }
        return Optional.empty();
    }

    public void inserir(Pagamento pagamento) {
        pagamentos.add(pagamento);
    }

    public boolean update(long id, Pagamento updatedPagamento) {
        for (int i = 0; i < pagamentos.size(); i++) {
            if (pagamentos.get(i).getId() == id) {
                pagamentos.set(i, updatedPagamento);
                return true;
            }
        }
        return false;
    }

    public boolean delete(long id) {
        for (int i = 0; i < pagamentos.size(); i++) {
            if (pagamentos.get(i).getId() == id) {
                pagamentos.remove(i);
                return true;
            }
        }
        return false;
    }
}