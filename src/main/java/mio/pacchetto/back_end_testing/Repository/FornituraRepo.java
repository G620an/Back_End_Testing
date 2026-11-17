@Repository
public interface FornituraRepo extends JpaRepository<Fornitura, FornituraId>{
    Fornitura findByFornitoreMerce(int fornitore, int merce);
    List<Fornitura> findByFornitore(int fornitore);
    List<Fornitura> findByMerce(int merce);

    @Query("SELECT * FROM Fornitura X WHERE X.prezzo>=?1 AND X.prezzo<=?2")
    List<Fornitura> findByPriceRange(double low, double high);
}
//Solitamente Spring Boot ci fa già SQL ma in questo caso posso definirla manualmente

//Come scrivere una query per le ricerce avanzate:
/*
Devo dirgli che per ogni tupla che vado a leggere mi va bene anche un null

@Query("SELECT p " +
           "FROM Product p " +
           "WHERE (p.name LIKE ?1 OR ?1 IS NULL) AND " +
           "      (p.description LIKE ?2 OR ?2 IS NULL)")

           
*/