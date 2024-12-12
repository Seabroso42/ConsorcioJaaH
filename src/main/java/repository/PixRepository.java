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
        for (Pix pix : pixList) {
            if (pix.getId() == id) {
                return Optional.of(pix);
            }
        }
        return Optional.empty();
    }

    public void insert(Pix pix) {
        pixList.add(pix);
    }

    public boolean update(long id, Pix updatedPix) {
        for (int i = 0; i < pixList.size(); i++) {
            if (pixList.get(i).getId() == id) {
                pixList.set(i, updatedPix);
                return true;
            }
        }
        return false;
    }

    public boolean delete(long id) {
        for (int i = 0; i < pixList.size(); i++) {
            if (pixList.get(i).getId() == id) {
                pixList.remove(i);
                return true;
            }
        }
        return false;
    }
}