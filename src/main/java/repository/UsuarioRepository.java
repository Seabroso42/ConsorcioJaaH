package repository;

import lombok.Data;
import model.Usuario;

@Data
public class UsuarioRepository {
    private Usuario[] usuarios;
    private int indice;
    private static UsuarioRepository instance;

    public static UsuarioRepository getInstance(){
        if (instance==null){
            instance = new UsuarioRepository();
        }
        return instance;
    }

    public UsuarioRepository() {
        usuarios = new Usuario[100];
        indice = 0;
    }

    public void inserir(Usuario usuario) {
        usuarios[indice] = usuario;
        indice = indice + 1;
    }

    public void atualizar(Usuario usuario)  {
        int i = getIndice(usuario.getCPF());
        if (i == indice) {
            System.out.println("Usuário Não Encontrado");
        } else {
            usuarios[i] = usuario;
        }
    }

    public void remover(Long cpf){
        int i = getIndice(cpf);
        if (i == indice) {
            System.out.println("Usuário Não Encontrado");
        } else {
            usuarios[i] = usuarios[indice - 1];
            indice = indice - 1;
        }
    }

    public Usuario procurar(Long cpf) {
        Usuario resposta = null;
        int i = getIndice(cpf);
        if (i == indice) {
            System.out.println("Usuário Não Encontrado");
        } else {
            resposta = usuarios[i];
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
            n = usuarios[i].getCPF();
            if (n.equals(cpf)) {
                achou = true;
            } else {
                i = i + 1;
            }
        }
        return i;
    }

    public void imprimirUsuarios() {
        for (int i = 0; i < indice; i++) {
            System.out.println("String:" + usuarios[i].getNome());
            System.out.println("CPF:" + usuarios[i].getCPF());
        }
    }
}
