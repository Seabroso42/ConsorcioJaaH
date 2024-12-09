package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Contemplacao {
    private LocalDate dataSorteio;
    private ArrayList<Grupo> grupos;

    public Contemplacao(LocalDate dataSorteio, ArrayList<Grupo> grupos) {
        this.dataSorteio = dataSorteio;
        this.grupos = grupos;
    }

    public LocalDate getDataSorteio() {
        return dataSorteio;
    }

    public void setDataSorteio(LocalDate dataSorteio) {
        this.dataSorteio = dataSorteio;
    }

    public ArrayList<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(ArrayList<Grupo> grupos) {
        this.grupos = grupos;
    }
}
