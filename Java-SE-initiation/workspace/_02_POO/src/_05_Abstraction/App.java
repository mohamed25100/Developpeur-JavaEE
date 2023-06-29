package _05_Abstraction;

public class App {

	public static void main(String[] args) {

		// Forme forme = new Forme(); // Erreur : une classe abstraite ne peut être
		// instanciée

		Carre carre = new Carre(5);

		System.out.println("carre.surface() = " + carre.surface());

		Cercle cercle = new Cercle(5);

		System.out.println("cercle.surface() = " + cercle.surface());

		carre.methodeNonAbstraite();
		cercle.methodeNonAbstraite();

		// Forme forme = new Cercle(5);
		Forme forme = new Carre(5); // Une forme peut indifféremment être un Carre ou un Cercle, ou un Rectangle

		forme.surface(); // Mais dans tous les cas un objet de type 'Forme' disposera d'une méthode
							// surface adapté au véritable type de l'objet (Carre ou Cercle)

		Forme rectangle = new Rectangle(5, 15);
		
		System.out.println("rectangle.surface() = " + rectangle.surface());
		
		Forme carre2 = new Carre2(5);
		
		System.out.println("carre2.surface() = " + carre2.surface());
	}
}
