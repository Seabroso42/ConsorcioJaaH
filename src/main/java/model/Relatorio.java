package model;

import com.itextpdf.layout.Document;
import lombok.Data;

import java.time.LocalDate;

@Data
public class Relatorio {
    private LocalDate data;
    private String titulo;
    private Document dadoPDF;
}
