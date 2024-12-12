package repository;

import model.Relatorio;

public class RelatorioRepository {

    private Relatorio[] relatorios;
    private int indice;
    private RelatorioRepository instance;


    public RelatorioRepository() {
        relatorios = new Relatorio[100];
        indice = 0;
    }

    public void inserir(Relatorio relatorio) {
        relatorios[indice] = relatorio;
        indice = indice + 1;
    }

    public void atualizar(Relatorio relatorio)  {
        int i = getIndice(relatorio.getTitulo());
        if (i == indice) {
            System.out.println("Relatório Não Encontrado");
        } else {
            relatorios[i] = relatorio;
        }
    }

    public void remover(String titulo){
        int i = getIndice(titulo);
        if (i == indice) {
            System.out.println("Relatório Não Encontrado");
        } else {
            relatorios[i] = relatorios[indice - 1];
            indice = indice - 1;
        }
    }

    public Relatorio procurar(String titulo) {
        Relatorio resposta = null;
        int i = getIndice(titulo);
        if (i == indice) {
            System.out.println("Conta Não Encontrada");
        } else {
            resposta = relatorios[i];
        }
        return resposta;
    }

    public boolean existe(String titulo) {
        boolean resposta;
        int i = getIndice(titulo);
        if (i == indice) {
            resposta = false;
        } else {
            resposta = true;
        }
        return resposta;
    }

    private int getIndice(String titulo) {
        String n;
        boolean achou = false;
        int i = 0;
        while ((!achou) && (i < indice)) {
            n = relatorios[i].getTitulo();
            if (n.equals(titulo)) {
                achou = true;
            } else {
                i = i + 1;
            }
        }
        return i;
    }

    public void imprimirRelatorios() {
        for (int i = 0; i < indice; i++) {
            System.out.println("Título do Relatório: " + relatorios[i].getTitulo());
        }
    }

}
