package model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Pix extends Pagamento {
    private String chavePix;
    public Pix(){}
    public Pix(String chavePix) {
        super();
        this.chavePix = chavePix;
    }
}
