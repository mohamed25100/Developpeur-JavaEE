package _07_Interfaces;

import java.util.List;


// Une interface est une pesudo classe abstraite faisant office de contrat
// Toute classe implémentant une interfzace devra obligatoirement implémenter l'ensemble de ses méthodes
public interface ProductRepository {

	// C.R.U.D
	// Create
	// Read
	// Update
	// Delete
	
	void create(Product p);
	
	List<Product> getAll();
	
	Product getById(int id);
	
	void update(Product p);
	
	void delete(int id);
}
