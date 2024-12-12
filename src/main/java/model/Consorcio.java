package model;

import lombok.Data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

@Data
public class Consorcio implements Processo{
    private LocalDate dataInicio;
    private String premiacao;
    private LocalDate dataSorteio;
 //   private ArrayList<Grupo> grupos;
    private double valorRestante;
// armazena quais clientes foram contemplados e quando.
    private HashMap<Cliente, LocalDate> contemplados;

    public Consorcio(LocalDate dataSorteio, ArrayList<Grupo> grupos) {
        this.dataSorteio = dataSorteio;
        //this.grupos = grupos;
        this.dataInicio= LocalDate.now();
    }

    @Override
    public void sendRelatorio() {

    }
}
