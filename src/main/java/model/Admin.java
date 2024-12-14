package model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
@EqualsAndHashCode(callSuper = true)
@Data
public class Admin extends Usuario {
    private ArrayList<Grupo> gruposVistoria;

    public Admin(){
        this.gruposVistoria = new ArrayList<>();
    }
    public Admin(String nome, Long CPF, String telefone, String email) {
        super(nome, CPF, telefone, email);
        this.gruposVistoria = new ArrayList<>();
    }

}