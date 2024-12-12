package repository;

import model.Consorcio;

public class ConsorcioRepository {
    private Consorcio[] consorcios;
    private int indice;

    public ConsorcioRepository() {
        consorcios = new Consorcio[100];
        indice = 0;
    }

    public void inserir(Consorcio consorcio) {
        consorcios[indice] = consorcio;
        indice = indice + 1;
    }

    public void atualizar(Consorcio consorcio)  {
        int i = getIndice(consorcio.getIdConsorcio());
        if (i == indice) {
            System.out.println("Consorcio Não Encontrado");
        } else {
            consorcios[i] = consorcio;
        }
    }

    public void remover(Long id){
        int i = getIndice(id);
        if (i == indice) {
            System.out.println("Consorcio Não Encontrado");
        } else {
            consorcios[i] = consorcios[indice - 1];
            indice = indice - 1;
        }
    }

    public Consorcio procurar(Long cpf) {
        Consorcio resposta = null;
        int i = getIndice(cpf);
        if (i == indice) {
            System.out.println("Consorcio Não Encontrado");
        } else {
            resposta = consorcios[i];
        }
        return resposta;
    }

    public boolean existe(Long cpf) {
        boolean resposta;
        int i = getIndice(cpf);
        if (i == indice) {
            resposta = false;
        } else {
            resposta = true;
        }
        return resposta;
    }

    private int getIndice(Long cpf) {
        Long n;
        boolean achou = false;
        int i = 0;
        while ((!achou) && (i < indice)) {
            n = consorcios[i].getIdConsorcio();
            if (n.equals(cpf)) {
                achou = true;
            } else {
                i = i + 1;
            }
        }
        return i;
    }

    public void imprimirConsorcios() {
        for (int i = 0; i < indice; i++) {
            System.out.println("Prêmio:" + consorcios[i].getPremiacao());
            System.out.println("Id:" + consorcios[i].getIdConsorcio());
        }
    }
}
