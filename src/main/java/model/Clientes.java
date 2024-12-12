package model;

import java.util.ArrayList;

public class Clientes extends Usuario {
    private String nome;
    private String cpf;
    private String telefone;
    private ArrayList<Grupo> consorciosAtivos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public ArrayList<Grupo> getConsorciosAtivos() {
        return consorciosAtivos;
    }

    public void setConsorciosAtivos(ArrayList<Grupo> consorciosAtivos) {
        this.consorciosAtivos = consorciosAtivos;
    }

    public Clientes(String nome, String cpf, String telefone, ArrayList<Grupo> consorciosAtivos) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.consorciosAtivos = consorciosAtivos;


    }

}