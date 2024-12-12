package model;

import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;

@Data
public class Grupo {
    private Long Id;
    private Admin supervisor;
    //lista de lances dados pelos clientes por fora das parcelas pagas.
    private HashMap<Cliente, Double> lances;
    private double valorTotal;
    private int qtdUsuarios;
    private double taxaAdm;
    private ArrayList<Cliente> pessoas;
    private Contemplacao contemplacao;
    private double valorArrecadadoAtualizado;
    private double valorRestante;
    private ArrayList<Contemplacao> contemplados;

}
