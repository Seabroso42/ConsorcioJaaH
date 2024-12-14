import repository.*;

public class Main {
    public static void main(String[] args) {
        //repositorios
        PagamentoRepository pagamentoRepository = PagamentoRepository.getInstance();
        ConsorcioRepository consorcioRepository= ConsorcioRepository.getInstance();
        RelatorioRepository relatorioRepository= RelatorioRepository.getInstance();
        ContratoRepository contratoRepository= ContratoRepository.getInstance();
        UsuarioRepository usuarioRepository= UsuarioRepository.getInstance();

    }
}
