package model;

import java.util.ArrayList;

public class Grupo {
    private Long Id;
    private double valorTotal;
    private Long qtdUsuarios;
    private double taxaAdm;
    private ArrayList<Pessoa> pessoas;
    private Contemplacao contemplacao;
    private double valorArreadadoAtualizado;
    private double valorRestante;
    private ArrayList<Contemplacao> contemplados;

    public Grupo(Long Id, double valorTotal, Long qtdUsuarios, double taxaAdm, ArrayList<Pessoa> pessoas, Contemplacao contemplacao, double valorArreadadoAtualizado, double valorRestante, ArrayList<Contemplacao> contemplados) {
        this.Id = Id;
        this.valorTotal = valorTotal;
        this.qtdUsuarios = qtdUsuarios;
        this.taxaAdm = taxaAdm;
        this.pessoas = pessoas;
        this.contemplacao = contemplacao;
        this.valorArreadadoAtualizado = valorArreadadoAtualizado;
        this.valorRestante = valorRestante;
        this.contemplados = contemplados;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Long getQtdUsuarios() {
        return qtdUsuarios;
    }

    public void setQtdUsuarios(Long qtdUsuarios) {
        this.qtdUsuarios = qtdUsuarios;
    }

    public double getTaxaAdm() {
        return taxaAdm;
    }

    public void setTaxaAdm(double taxaAdm) {
        this.taxaAdm = taxaAdm;
    }

    public ArrayList<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(ArrayList<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    public Contemplacao getContemplacao() {
        return contemplacao;
    }

    public void setContemplacao(Contemplacao contemplacao) {
        this.contemplacao = contemplacao;
    }

    public double getValorArreadadoAtualizado() {
        return valorArreadadoAtualizado;
    }

    public void setValorArreadadoAtualizado(double valorArreadadoAtualizado) {
        this.valorArreadadoAtualizado = valorArreadadoAtualizado;
    }

    public double getValorRestante() {
        return valorRestante;
    }

    public void setValorRestante(double valorRestante) {
        this.valorRestante = valorRestante;
    }

    public ArrayList<Contemplacao> getContemplados() {
        return contemplados;
    }

    public void setContemplados(ArrayList<Contemplacao> contemplados) {
        this.contemplados = contemplados;
    }
}
