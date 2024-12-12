package repository;

import model.Boleto;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BoletoRepository {
    private List<Boleto> boletos = new ArrayList<>();

    public List<Boleto> getAll() {
        return new ArrayList<>(boletos);
    }

    public Optional<Boleto> getById(long id) {
        for (Boleto boleto : boletos) {
            if (boleto.getId() == id) {
                return Optional.of(boleto);
            }
        }
        return Optional.empty();
    }

    public void insert(Boleto boleto) {
        boletos.add(boleto);
    }

    public boolean update(long id, Boleto updatedBoleto) {
        for (int i = 0; i < boletos.size(); i++) {
            if (boletos.get(i).getId() == id) {
                boletos.set(i, updatedBoleto);
                return true;
            }
        }
        return false;
    }

    public boolean delete(long id) {
        for (int i = 0; i < boletos.size(); i++) {
            if (boletos.get(i).getId() == id) {
                boletos.remove(i);
                return true;
            }
        }
        return false;
    }
}