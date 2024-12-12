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

        Pagamento pagamento = new Pagamento(1, 100.0, true);
        BoletoRepository boletoRepository = new BoletoRepository();
        PixRepository pixRepository = new PixRepository();
        PagamentoRepository pagamentoRepository = new PagamentoRepository();
        CartaoDeCreditoRepository cartaoDeCreditoRepository = new CartaoDeCreditoRepository();


        Pix pix = new Pix(2, 200.0, "codigoPix123", "chavePix123", "pagador1", true, pagamento);
        Pix pix2 = new Pix(3, 500.0, "codigoPix1234", "chavePix1234", "pagador2", true, pagamento);
        Pix pix3 = new Pix(4, 2800.0, "codigoPix1235", "chavePix1235", "pagador3", true, pagamento);

        Boleto boleto = new Boleto(1, 300.0, "codigoBoleto123", LocalDate.now(), "pagador2", true, pagamento);
        Boleto boleto2 = new Boleto(2, 500.0, "codigoBoleto1234", LocalDate.now(), "pagador3", true, pagamento);
        Boleto boleto3 = new Boleto(3, 700.0, "codigoBoleto1235", LocalDate.now(), "pagador5", true, pagamento);
        
        Pagamento pagamento1 = new Pagamento(1, 200, false);
        Pagamento pagamento2 = new Pagamento(1, 200, false);
        Pagamento pagamento3 = new Pagamento(1, 200, false);
        
        System.out.println("Boleto Código: " + boleto.getCodigoBoleto());
        System.out.println("Boleto ID: " + boleto.getId());
        
        boletoRepository.insert(boleto);
        boletoRepository.insert(boleto2);
        boletoRepository.insert(boleto3);
        pixRepository.insert(pix);
        pixRepository.insert(pix2);
        pixRepository.insert(pix3);
        pagamentoRepository.insert(pagamento1);
        pagamentoRepository.insert(pagamento2);
        pagamentoRepository.insert(pagamento3);
        // System.out.println("Boleto: " + boletoRepository.getById(boleto.getId()).get());
        // System.out.println("Boleto: " + boletoRepository.getById(boleto2.getId()).get());
        // System.out.println("Boleto: " + boletoRepository.getById(boleto3.getId()).get());
        System.out.println("Tudo boleto: " + boletoRepository.getAll());
        System.out.println("Deletando algo" + boletoRepository.delete(2));
        System.out.println("Tudo boleto: " + boletoRepository.getAll());
        System.out.println("Tudo Pix: " + pixRepository.getAll());
        pix3.setValor(16700);
        pixRepository.update(3, pix3);
        System.out.println("Pix 3: " + pixRepository.getById(pix3.getId()).get().getValor());
        System.out.println("");
    }
}