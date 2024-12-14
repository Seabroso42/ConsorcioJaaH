package model;

import enums.StatusCliente;
import enums.TipoServico;
import lombok.Data;

@Data
public class Contrato implements Processo{
    private Long idContrato;
    private Usuario usuarioVinculado;
    private TipoServico tipoServico;
    private StatusCliente statusCliente;

    public Contrato() {
    }
    public Contrato( Usuario usuarioVinculado, TipoServico tipoServico) {
        this.usuarioVinculado = usuarioVinculado;
        this.tipoServico = tipoServico;
        this.statusCliente = StatusCliente.PAGANTE;
    }


    @Override
    public void sendRelatorio() {

    }
}