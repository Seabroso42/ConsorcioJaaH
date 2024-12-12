package model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
@EqualsAndHashCode(callSuper = true)
@Data
public class Cliente extends Usuario {
    private String nome;
    private String cpf;
    private String telefone;
    private ArrayList<Grupo> consorciosAtivos;

    public Cliente() {
    }

    public Cliente(String nome, String cpf, String telefone, ArrayList<Grupo> consorciosAtivos) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.consorciosAtivos = consorciosAtivos;


    }

    public void darLance(Grupo grupo, double valor) { }

}