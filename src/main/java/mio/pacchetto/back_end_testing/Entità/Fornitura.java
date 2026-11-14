package mio.pacchetto.back_end_testing.Entità;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name="Fornitura", schema="Catalogo")
public class Fornitura {
    @EmbeddedId
    private FornituraId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="fornitore")
    private Fornitore fornitore;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="merce")
    private Merce merce;


    @Column(name="prezzo", nullable = false, precision = 6, scale = 2)
    private double prezzo;
}
