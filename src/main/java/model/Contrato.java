package model;

public class Contrato {
    private Long idContrato;
    private boolean clienteVinculado;
    private Enum tipoServico;

    public Contrato(Long idContrato, boolean clienteVinculado, Enum tipoServico) {
        this.idContrato = idContrato;
        this.clienteVinculado = clienteVinculado;
        this.tipoServico = tipoServico;
    }

    public Long getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(Long idContrato) {
        this.idContrato = idContrato;
    }

    public boolean isClienteVinculado() {
        return clienteVinculado;
    }

    public void setClienteVinculado(boolean clienteVinculado) {
        this.clienteVinculado = clienteVinculado;
    }

    public Enum getTipoServico() {
        return tipoServico;
    }

    public void setTipoServico(Enum tipoServico) {
        this.tipoServico = tipoServico;
    }

    public void statusCliente();
}