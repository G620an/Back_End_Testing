package mio.pacchetto.back_end_testing.Entità;


import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;
import net.minidev.json.annotate.JsonIgnore;

import java.util.List;

@Entity
@Data
@Table(name="Fornitore", schema="Catalogo")

public class Fornitore {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="piva", unique=true, nullable=false)
    private Long piva;

    @Column(name="nome", nullable = false, length = 40)
    private String nome;

    @Column(name="città", nullable = false, length = 40)
    private String città;

    @OneToMany(mappedBy = "fornitori")
    @JsonIgnore
    @ToString.Exclude
    private List<Fornitura> forniture;
}
