@Repository
public interface MerceRepo extends JpaRepository<Merce, Integer>{
    Merce findByCodice(int codice);
    List<Merce> findByNome(String nome);
    List<Merce> findByMarca(String marca);
}