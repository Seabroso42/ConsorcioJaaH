import model.Boleto;
import model.CartaoDeCredito;
import model.Pagamento;
import model.Pix;
import repository.PagamentoRepository;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        PagamentoRepository pagamentoRepository = new PagamentoRepository();


        Pagamento pagamento1 = new Pix();
        Pix pix2 = new Pix();

        Boleto pagamento2 = new Boleto();
        Boleto boleto2 = new Boleto();

        CartaoDeCredito pagamento3 = new CartaoDeCredito();
        CartaoDeCredito cd2 = new CartaoDeCredito();



        System.out.println("Boleto Código: " + boleto.getCodigoBoleto());
        System.out.println("Boleto ID: " + boleto.getId());


        pagamentoRepository.insert(pagamento1);
        pagamentoRepository.insert(pagamento2);
        pagamentoRepository.insert(pagamento3);
        // System.out.println("Boleto: " + boletoRepository.getById(boleto.getId()).get());
        // System.out.println("Boleto: " + boletoRepository.getById(boleto2.getId()).get());
        // System.out.println("Boleto: " + boletoRepository.getById(boleto3.getId()).get());

    }
}
