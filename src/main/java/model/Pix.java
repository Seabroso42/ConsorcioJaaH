package model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Pix extends Pagamento {
    private String chavePix;
    private boolean realizado;
}
