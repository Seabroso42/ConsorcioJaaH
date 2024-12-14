package model;

import lombok.Data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

@Data
public class Consorcio implements Processo{
    private static int idConsorcio= 0;
    private LocalDate dataInicio;
    private String premiacao;
    private LocalDate dataSorteio;
    private ArrayList<Grupo> grupos;
    private double valorRestante;
// armazena quais clientes foram contemplados e quando.
    private HashMap<Cliente, LocalDate> contemplados;

    public Consorcio(double valorRestante,LocalDate dataSorteio, String premiacao) {
        this.valorRestante = valorRestante;
        this.dataSorteio = dataSorteio;
        this.grupos = new ArrayList<>();
        this.dataInicio= LocalDate.now();
        this.premiacao= premiacao;
        idConsorcio++;
    }

    public Cliente sorteio(){
       Cliente sorteado= null;


        return sorteado;
    }

    public void avaliarLance(){}

    @Override
    public void sendRelatorio() {

    }
}
