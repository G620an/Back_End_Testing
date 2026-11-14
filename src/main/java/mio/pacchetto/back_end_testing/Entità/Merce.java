package mio.pacchetto.back_end_testing.Entità;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;
import net.minidev.json.annotate.JsonIgnore;

import java.util.List;

@Data
@Entity
@Table(name="Merce", schema="Catalogo")
public class Merce {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codice;

    @Column(name="nome", length=40,  nullable = false)
    private String nome;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="marca", nullable = false)
    private Long Marca;

    @OneToMany(mappedBy = "merce")
    @JsonIgnore
    @ToString.Exclude
    private List<Fornitura> forniture;
}
