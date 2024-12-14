package model;

import enums.StatusCliente;
import enums.TipoServico;
import lombok.Data;

@Data
public class Contrato implements Processo{
    private Long idContrato;
    private Cliente clienteVinculado;
    private TipoServico tipoServico;
    private StatusCliente statusCliente;

    public Contrato() {
    }
    public Contrato( Cliente clienteVinculado, TipoServico tipoServico) {
        this.clienteVinculado = clienteVinculado;
        this.tipoServico = tipoServico;
        this.statusCliente = StatusCliente.PAGANTE;
    }


    @Override
    public void sendRelatorio() {

    }
}