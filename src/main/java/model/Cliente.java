package model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
@EqualsAndHashCode(callSuper = true)
@Data
public class Cliente extends Usuario {

    private ArrayList<Grupo> consorciosAtivos;

    public Cliente() {
    }

    public Cliente(ArrayList<Grupo> consorciosAtivos) {
        super();
        this.consorciosAtivos = consorciosAtivos;
    }

    public void darLance(Grupo grupo, Double valor) { }

}