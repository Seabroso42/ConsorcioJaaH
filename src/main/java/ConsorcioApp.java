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

        CartaoDeCreditoRepository cartaoDeCreditoRepository = new CartaoDeCreditoRepository();
        cartaoDeCreditoRepository.insert(cartaoDeCredito);
        System.out.println("CartaoDeCreditoRepository Size: " + cartaoDeCreditoRepository.getAll().size());

        PagamentoRepository pagamentoRepository = new PagamentoRepository();
        pagamentoRepository.insert(pagamento);
        System.out.println("PagamentoRepository Size: " + pagamentoRepository.getAll().size());

        pix.setChavePix("novaChavePix123");
        pixRepository.update(pix.getId(), pix);
        System.out.println("Pix Updated Chave: " + pixRepository.getById(pix.getId()).get().getChavePix());

        pixRepository.delete(pix.getId());
        System.out.println("PixRepository Size after delete: " + pixRepository.getAll().size());

        boleto.setCodigoBoleto("novoCodigoBoleto123");
        boletoRepository.update(boleto.getId(), boleto);
        System.out.println("Boleto Updated Código: " + boletoRepository.getById(boleto.getId()).get().getCodigoBoleto());

        boletoRepository.delete(boleto.getId());
        System.out.println("BoletoRepository Size after delete: " + boletoRepository.getAll().size());

        cartaoDeCredito.setParcelas(24);
        cartaoDeCreditoRepository.update(cartaoDeCredito.getId(), cartaoDeCredito);
        System.out.println("Cartão de Crédito Updated Parcelas: " + cartaoDeCreditoRepository.getById(cartaoDeCredito.getId()).get().getParcelas());

        cartaoDeCreditoRepository.delete(cartaoDeCredito.getId());
        System.out.println("CartaoDeCreditoRepository Size after delete: " + cartaoDeCreditoRepository.getAll().size());

        pagamento.setValor(150.0);
        pagamentoRepository.update(pagamento.getId(), pagamento);
        System.out.println("Pagamento Updated Valor: " + pagamentoRepository.getById(pagamento.getId()).get().getValor());

        pagamentoRepository.delete(pagamento.getId());
        System.out.println("PagamentoRepository Size after delete: " + pagamentoRepository.getAll().size());
    }
}