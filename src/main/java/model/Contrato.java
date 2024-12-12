package model;

import enums.StatusCliente;
import enums.TipoServico;
import lombok.Data;

@Data
public class Contrato {
    private Long idContrato;
    private boolean clienteVinculado;
    private TipoServico tipoServico;
    private StatusCliente statusCliente;

    public Contrato(Long idContrato, boolean clienteVinculado, TipoServico tipoServico) {
        this.idContrato = idContrato;
        this.clienteVinculado = clienteVinculado;
        this.tipoServico = tipoServico;
    }

}