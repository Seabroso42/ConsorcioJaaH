package model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
@EqualsAndHashCode(callSuper = true)
@Data
public class Cliente extends Usuario {

    private ArrayList<Grupo> consorciosAtivos;
    private ArrayList<Contrato> historicoContratos;

    public Cliente(){
        this.consorciosAtivos = new ArrayList<>();
        this.historicoContratos = new ArrayList<>();
    }

    public Cliente(String nome, Long CPF, String telefone, String email) {
        super(nome, CPF, telefone, email);
        this.consorciosAtivos = new ArrayList<>();
        this.historicoContratos = new ArrayList<>();
    }


    public void darLance(Grupo grupo, Double valor) { }

}