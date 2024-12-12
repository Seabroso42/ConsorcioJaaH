package model;

import lombok.Data;

import java.time.LocalDate;
import java.util.ArrayList;
@Data
public class Admin extends Usuario {
    private String nome;
    private String cpf;
    private LocalDate dataNascimento;
    private ArrayList<Contrato> contrato;

    public Admin(String nome, String cpf, LocalDate dataNascimento, ArrayList<Contrato> contrato) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.contrato = contrato;
    }

}