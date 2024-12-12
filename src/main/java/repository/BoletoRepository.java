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
        return boletos.stream()
                .filter(boleto -> boleto.getId() == id)
                .findFirst();
    }

    public void insert(Boleto boleto) {
        boletos.add(boleto);
    }

    public boolean update(long id, Boleto updatedBoleto) {
        Optional<Boleto> existingBoletoOpt = getById(id);
        if (existingBoletoOpt.isPresent()) {
            Boleto existingBoleto = existingBoletoOpt.get();
            existingBoleto.setCodigoBoleto(updatedBoleto.getCodigoBoleto());
            existingBoleto.setVencimento(updatedBoleto.getVencimento());
            existingBoleto.setPagador(updatedBoleto.getPagador());
            existingBoleto.setValor(updatedBoleto.getValor());
            existingBoleto.setStatus(updatedBoleto.getStatus());
            return true;
        }
        return false;
    }

    public boolean delete(long id) {
        return boletos.removeIf(boleto -> boleto.getId() == id);
    }
}