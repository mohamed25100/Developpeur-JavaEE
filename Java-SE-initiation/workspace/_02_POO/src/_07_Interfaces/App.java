package _07_Interfaces;

public class App {

	public static void main(String[] args) {

		// On peut indifférement utiliser un repository SqlServer ou Oracle, puis que les 2 sont obligées
		// d'implémenter les mêmes méthodes car elles implémentent l'interface ProductRepository.
		// ProductRepository _repo = new ProductRepositoryOracleImpl();
		
		ProductRepository _repo = new ProductRepositorySqlServerImpl();
		
		Product p = new Product();
		
		_repo.create(p); // La méthode create (et les autres...) est accessible de la même manière qu'elle
		// soit implémenté dans ProductRepositoryOracleImpl ou dans ProductRepositorySqlServerImpl
		
	}
}
