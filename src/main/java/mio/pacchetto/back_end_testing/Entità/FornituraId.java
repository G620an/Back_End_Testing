package mio.pacchetto.back_end_testing.Entità;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Embeddable
@Data
public class FornituraId implements Serializable {
    private Long fornitore;
    private Long merce;
}
