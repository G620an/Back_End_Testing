@Repository
public interface MarcaRepo extends JpaRepository<Marca, String>{
    Marca findByNome(String nome);
    List<Marca> findByCittà(String città);
}