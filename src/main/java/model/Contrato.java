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


    @Override
    public void sendRelatorio() {

    }
}