import model.*;
import repository.*;

public class Main {
    public static void main(String[] args) {
        //repositorios
        PagamentoRepository pagamentoRepository = new PagamentoRepository();
        ConsorcioRepository consorcioRepository= new ConsorcioRepository();
        RelatorioRepository relatorioRepository= new RelatorioRepository();
        ContratoRepository contratoRepository= new ContratoRepository();
        UsuarioRepository usuarioRepository= new UsuarioRepository();
        //turminha do barulho
        Admin funcionario= new Admin();
        Grupo galera= new Grupo();
        Usuario qualquer= new Cliente();
        Cliente jorge= new Cliente();
        Usuario maria= new Cliente();

        Consorcio megaSena = new Consorcio();


        //alguns pagamentos
        Pagamento pagamento1 = new Pix();
        Pix pix2 = new Pix();

        Boleto pagamento2 = new Boleto();
        Boleto boleto = new Boleto();
        Boleto boleto2 = new Boleto();
        Boleto boleto3 = new Boleto();

        CartaoDeCredito pagamento3 = new CartaoDeCredito();
        CartaoDeCredito cd2 = new CartaoDeCredito();

        //relatorios
        Relatorio relatorioConsorcio= new Relatorio();
        Relatorio relatorioPagamento= new Relatorio();
        Relatorio relatorioMulta= new Relatorio();

        //contratos
        Contrato contratoAdmin= new Contrato();
        Contrato contratoContemplacao= new Contrato();




        System.out.println("Boleto Código: " + boleto.getCodigoBoleto());


        pagamentoRepository.insert(pagamento1);
        pagamentoRepository.insert(pagamento2);
        pagamentoRepository.insert(pagamento3);
        System.out.println("Boleto: " + pagamentoRepository.getById(boleto.getId()));
        System.out.println("Boleto: " + pagamentoRepository.getById(boleto2.getId()));
        System.out.println("Boleto: " + pagamentoRepository.getById(boleto3.getId()));

    }
}
