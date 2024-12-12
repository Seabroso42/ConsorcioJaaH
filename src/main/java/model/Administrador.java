package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Administrador extends Usuario {
    private String nome;
    private String cpf;
    private dataNascimento LocalDateTime;
    private ArrayList<Contrato> contrato;

    public Administrador(String nome, String cpf, LocalDate dataNascimento, ArrayList<Contrato> contrato) {
        this.nome = nome;
        this.cpf = cpf;
        this,dataNascimento = dataNascimento;
        this.contrato = contrato;
    }

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

    public dataNascimento getLocalDateTime() {
        return LocalDateTime;
    }

    public void setLocalDateTime(dataNascimento localDateTime) {
        LocalDateTime = localDateTime;
    }

    public ArrayList<Contrato> getContrato() {
        return contrato;
    }

    public void setContrato(ArrayList<Contrato> contrato) {
        this.contrato = contrato;
    }

    public void gerarAdmin (Administrador admin) {return admin}
}