package repository;

import lombok.Data;
import model.Consorcio;
import model.Grupo;

@Data
public class GrupoRepository {
    private Grupo[] grupos;
    private int indice;
    private static GrupoRepository instance;

    public static GrupoRepository getInstance() {
        if (instance == null) {
            instance = new GrupoRepository();
        }
        return instance;
    }

    private GrupoRepository() {
        grupos = new Grupo[100];
        indice = 0;
    }

    public void inserir(Grupo grupo) {
        grupos[indice] = grupo;
        indice++;
    }

    public void atualizar(Grupo grupo) {
        int i = getIndice(grupo.getId());
    }

    public void remover(Long id) {
        int i = getIndice(id);
        if (i == indice) {
            System.out.println("Grupo Não Encontrado!");
        } else {
            grupos[i] = grupos[indice - 1];
            indice = indice - 1;
        }
    }

    public Grupo procurar(Long id) {
        Grupo resposta = null;
        int i = getIndice(id);
        if (i == indice){
            System.out.println("Grupo não Encontrado!");
        }
        else {
            resposta = grupos[i];
        }
        return resposta;
    }

    public boolean existe(Long id){
        boolean resposta;
        int i = getIndice(id);
        if (i == indice){
            resposta = false;
        }  else {
            resposta = true;
        }
        return resposta;
    }


    private int getIndice(Long id) {
        Long l;
        boolean achou = false;
        int i = 0;
        while ((!achou) && (i < indice)) {
            l = grupos[i].getId();
            if (l.equals(id)) {
                achou = true;
            } else {
                l = l + 1;
            }
        }
        return i;
    }

    public void inprimirGrupos(){
        for(Grupo grupo : grupos){
            System.out.println(grupo);
        }
    }
}
