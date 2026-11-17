
@Repository
public interface FornitoreRepo extends JpaRepository<Fornitore, Integer>{
    Fornitore findByPiva(int piva);
    List<Fornitore> findByNome(String nome);
    List<Fornitore> findByCittà(String città);
}