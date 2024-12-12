package model;

import lombok.Data;

@Data
public abstract class Usuario {
    private String nome;
    private Long CPF;
    private String telefone;
    private String email;

    public Usuario(){}

}
