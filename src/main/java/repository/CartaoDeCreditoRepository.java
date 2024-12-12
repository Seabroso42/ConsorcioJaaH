package repository;

import model.CartaoDeCredito;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CartaoDeCreditoRepository {
    private List<CartaoDeCredito> cartoesDeCredito = new ArrayList<>();

    public List<CartaoDeCredito> getAll() {
        return new ArrayList<>(cartoesDeCredito);
    }

    public Optional<CartaoDeCredito> getById(long id) {
        for (CartaoDeCredito cartao : cartoesDeCredito) {
            if (cartao.getId() == id) {
                return Optional.of(cartao);
            }
        }
        return Optional.empty();
    }

    public void insert(CartaoDeCredito cartaoDeCredito) {
        cartoesDeCredito.add(cartaoDeCredito);
    }

    public boolean update(long id, CartaoDeCredito updatedCartaoDeCredito) {
        for (int i = 0; i < cartoesDeCredito.size(); i++) {
            if (cartoesDeCredito.get(i).getId() == id) {
                cartoesDeCredito.set(i, updatedCartaoDeCredito);
                return true;
            }
        }
        return false;
    }

    public boolean delete(long id) {
        for (int i = 0; i < cartoesDeCredito.size(); i++) {
            if (cartoesDeCredito.get(i).getId() == id) {
                cartoesDeCredito.remove(i);
                return true;
            }
        }
        return false;
    }
}