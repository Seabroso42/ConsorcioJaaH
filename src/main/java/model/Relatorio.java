package model;

import com.itextpdf.layout.Document;
import lombok.Data;

import java.time.LocalDate;

@Data
public class Relatorio {
    private String titulo;
    private LocalDate data;
    private Document dadoPDF;
    private static int codigo= 0;

    public Relatorio(){
        codigo++;
    }
}
