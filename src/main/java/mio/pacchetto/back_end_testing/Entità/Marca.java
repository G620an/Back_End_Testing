package mio.pacchetto.back_end_testing.Entità;


import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;
import net.minidev.json.annotate.JsonIgnore;

import java.util.List;

@Entity
@Data
@Table(name="Marca", schema="Catalogo")
public class Marca {
    @Id
    @Column(name="id", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="nome", length=40, nullable=false)
    private String nome;

    @Column(name="città", length=40, nullable=false)
    private String città;

    @OneToMany(targetEntity = Merce.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    @ToString.Exclude
    private List<Marca> marche;

    @ManyToMany(mappedBy = "merci")
    @JsonIgnore
    @ToString.Exclude
    private List<Fornitura> forniture;
}
