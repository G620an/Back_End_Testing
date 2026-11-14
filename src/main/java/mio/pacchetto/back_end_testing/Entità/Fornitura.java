package mio.pacchetto.back_end_testing.Entità;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name="Fornitura", schema="Catalogo")
public class Fornitura {
    @PrimaryKeyJoinColumn()
    @ManyToMany(targetEntity = Fornitore.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(
            name = "Fornitura",
            joinColumns = @JoinColumn(name="fornitore"),
            inverseJoinColumns = @JoinColumn(name="piva")
    )
    private List<Long> fornitori;

    @PrimaryKeyJoinColumn()
    @ManyToMany(targetEntity = Marca.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(
            name = "Fornitura",
            joinColumns = @JoinColumn(name="merce"),
            inverseJoinColumns = @JoinColumn(name="codice")
    )
    private List<Long> merci;

    @Column(name="prezzo", nullable = false)
    private double prezzo;
}
