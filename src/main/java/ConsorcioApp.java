import model.Boleto;
import model.CartaoDeCredito;
import model.Pagamento;
import model.Pix;
import repository.BoletoRepository;
import repository.CartaoDeCreditoRepository;
import repository.PagamentoRepository;
import repository.PixRepository;

import java.time.LocalDate;

public class ConsorcioApp {
    public static void main(String[] args) {
        System.out.println("Hello Hell!");
        

        Pagamento pagamento = new Pagamento(1, 100.0, true);
        System.out.println("Pagamento ID: " + pagamento.getId());

       
        Pix pix = new Pix(2, 200.0, "codigoPix123", "chavePix123", "pagador1", true, pagamento);
        System.out.println("Pix Chave: " + pix.getChavePix());

        Boleto boleto = new Boleto(3, 300.0, "codigoBoleto123", LocalDate.now(), "pagador2", true, pagamento);
        System.out.println("Boleto Código: " + boleto.getCodigoBoleto());

        CartaoDeCredito cartaoDeCredito = new CartaoDeCredito(4, 12, pagamento);
        System.out.println("Cartão de Crédito Parcelas: " + cartaoDeCredito.getParcelas());


        PixRepository pixRepository = new PixRepository();
        pixRepository.insert(pix);
        System.out.println("PixRepository Size: " + pixRepository.getAll().size());

        BoletoRepository boletoRepository = new BoletoRepository();
        boletoRepository.insert(boleto);
        System.out.println("BoletoRepository Size: " + boletoRepository.getAll().size());

        
    }
}
