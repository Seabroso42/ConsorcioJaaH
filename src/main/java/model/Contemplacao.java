package model;

import lombok.Data;

import java.time.LocalDate;
import java.util.ArrayList;
@Data
public class Contemplacao {
    private LocalDate dataSorteio;
    private ArrayList<Grupo> grupos;

    public Contemplacao(LocalDate dataSorteio, ArrayList<Grupo> grupos) {
        this.dataSorteio = dataSorteio;
        this.grupos = grupos;
    }

}
