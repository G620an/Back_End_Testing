package mio.pacchetto.back_end_testing.Entità;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Merce {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codice;

    @Column(name="nome", length=40,  nullable = false)
    private String nome;

    @JoinColumn(name="marca", nullable = false)
    private Long Marca;
}
