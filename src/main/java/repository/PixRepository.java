package repository;

import model.Pix;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PixRepository {
    private List<Pix> pixList = new ArrayList<>();

    public List<Pix> getAll() {
        return new ArrayList<>(pixList);
    }

    public Optional<Pix> getById(long id) {
        return pixList.stream()
                .filter(pix -> pix.getId() == id)
                .findFirst();
    }

    public void insert(Pix pix) {
        pixList.add(pix);
    }

    public boolean update(long id, Pix updatedPix) {
        Optional<Pix> existingPixOpt = getById(id);
        if (existingPixOpt.isPresent()) {
            Pix existingPix = existingPixOpt.get();
            existingPix.setCodigoPix(updatedPix.getCodigoPix());
            existingPix.setChavePix(updatedPix.getChavePix());
            existingPix.setPagador(updatedPix.getPagador());
            existingPix.setValor(updatedPix.getValor());
            existingPix.setStatus(updatedPix.getStatus());
            return true;
        }
        return false;
    }

    public boolean delete(long id) {
        return pixList.removeIf(pix -> pix.getId() == id);
    }
}