import enums.TipoServico;
import model.*;
import repository.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //repositorios
        PagamentoRepository pagamentoRepository = PagamentoRepository.getInstance();
        ConsorcioRepository consorcioRepository= ConsorcioRepository.getInstance();
        RelatorioRepository relatorioRepository= RelatorioRepository.getInstance();
        ContratoRepository contratoRepository= ContratoRepository.getInstance();
        UsuarioRepository usuarioRepository= UsuarioRepository.getInstance();
        //first try
        Usuario usuario = new Cliente("Joao", 12345678901L, "123-456-7890", "joao.bolado@example.com");
        Relatorio relatorio = new Relatorio("Monthly Report", LocalDate.now());
        Pix pix = new Pix("john.doe@pix.com");
        // Create Cliente objects
        Cliente cliente1 = new Cliente("Alice", 12345678901L, "123-456-7890", "alice@example.com");
        Cliente cliente2 = new Cliente("Bob", 23456789012L, "234-567-8901", "bob@example.com");
        Cliente cliente3 = new Cliente("Charlie", 34567890123L, "345-678-9012", "charlie@example.com");
        Cliente cliente4 = new Cliente("Diana", 45678901234L, "456-789-0123", "diana@example.com");

        // fazendo Admin objects
        Admin admin1 = new Admin("Eve", 56789012345L, "567-890-1234", "eve@example.com");
        Admin admin2 = new Admin("Frank", 67890123456L, "678-901-2345", "frank@example.com");

        // criar Pagamento objects
        Pix pix1 = new Pix("alice@pix.com");
        Pix pix2 = new Pix("bob@pix.com");
        CartaoDeCredito cartao1 = new CartaoDeCredito(6,"1234-5678-9012-3456");
        CartaoDeCredito cartao2 = new CartaoDeCredito(24,"2345-6789-0123-4567");

        // Criar objetos Consorcio
        Consorcio consorcio1 = new Consorcio(14370.50, LocalDate.now(), "Carro");
        Consorcio consorcio2 = new Consorcio(5000, LocalDate.now().plusDays(1), "Geladeira da NASA");

        // Criar objetos Contrato
        Contrato contrato1 = new Contrato(admin1, TipoServico.CONTRATACAO);
        Contrato contrato2 = new Contrato(cliente2, TipoServico.VENDA);

        // Criar objetos Relatorio
        Relatorio relatorio1 = new Relatorio("Relatorio A", LocalDate.now());
        Relatorio relatorio2 = new Relatorio("Relatorio B", LocalDate.now().plusDays(1));

        // Add objects to repositories
        usuarioRepository.inserir(cliente1);
        usuarioRepository.inserir(cliente2);
        usuarioRepository.inserir(cliente3);
        usuarioRepository.inserir(cliente4);
        usuarioRepository.inserir(admin1);
        usuarioRepository.inserir(admin2);
        consorcioRepository.inserir(consorcio1);
        consorcioRepository.inserir(consorcio2);

        contratoRepository.inserir(contrato1);
        contratoRepository.inserir(contrato2);

        relatorioRepository.inserir(relatorio1);
        relatorioRepository.inserir(relatorio2);

        pagamentoRepository.inserir(pix1);
        pagamentoRepository.inserir(pix2);
        pagamentoRepository.inserir(cartao1);
        pagamentoRepository.inserir(cartao2);

        usuarioRepository.imprimirUsuarios();

        contratoRepository.imprimirContratos();

        relatorioRepository.imprimirRelatorios();

        consorcioRepository.imprimirConsorcios();

        for (Pagamento p : pagamentoRepository.getAll()) {
            System.out.println(p);
        }

    }
}
