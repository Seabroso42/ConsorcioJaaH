package repository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CartaoDeCreditoRepository {
    private List<CartaoDeCredito> cartoesDeCredito = new ArrayList<>();

    public List<CartaoDeCredito> getAll() {
        return new ArrayList<>(cartoesDeCredito);
    }

    public Optional<CartaoDeCredito> getById(String id) {
        return cartoesDeCredito.stream()
                .filter(cartao -> cartao.getId().equals(id))
                .findFirst();
    }

    public void insert(CartaoDeCredito cartaoDeCredito) {
        cartoesDeCredito.add(cartaoDeCredito);
    }

    public boolean update(String id, CartaoDeCredito updatedCartaoDeCredito) {
        Optional<CartaoDeCredito> existingCartaoOpt = getById(id);
        if (existingCartaoOpt.isPresent()) {
            CartaoDeCredito existingCartao = existingCartaoOpt.get();
            existingCartao.setNumeroCartao(updatedCartaoDeCredito.getNumeroCartao());
            return true;
        }
        return false;
    }

    public boolean delete(String id) {
        return cartoesDeCredito.removeIf(cartao -> cartao.getId().equals(id));
    }
}