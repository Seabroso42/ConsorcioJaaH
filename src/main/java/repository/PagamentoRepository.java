package repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PagamentoRepository {
    private List<Pagamento> pagamentos = new ArrayList<>();

    public List<Pagamento> getAll() {
        return new ArrayList<>(pagamentos);
    }

    public Optional<Pagamento> getById(long id) {
        return pagamentos.stream()
                .filter(pagamento -> pagamento.getId() == id)
                .findFirst();
    }

    public void insert(Pagamento pagamento) {
        pagamentos.add(pagamento);
    }

    public boolean update(long id, Pagamento updatedPagamento) {
        Optional<Pagamento> existingPagamentoOpt = getById(id);
        if (existingPagamentoOpt.isPresent()) {
            Pagamento existingPagamento = existingPagamentoOpt.get();
            existingPagamento.setValor(updatedPagamento.getValor());
            existingPagamento.setStatus(updatedPagamento.getStatus());
            return true;
        }
        return false;
    }

    public boolean delete(long id) {
        return pagamentos.removeIf(pagamento -> pagamento.getId() == id);
    }
}