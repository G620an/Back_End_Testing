@Repository
public interface FornituraRepo extends JpaRepository<Fornitura, FornituraId>{
    Fornitura findByFornitoreMerce(int fornitore, int merce);
    List<Fornitura> findByFornitore(int fornitore);
    List<Fornitura> findByMerce(int merce);

    @Query("SELECT * FROM Fornitura X WHERE X.prezzo>=?1 AND X.prezzo<=?2")
    List<Fornitura> findByPriceRange(double low, double high);
}