package _05_Abstraction;

public class Rectangle extends Forme{

	private int largeur;
	private int longueur;
	
	
	public int getLargeur() {
		return largeur;
	}

	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}

	public int getLongueur() {
		return longueur;
	}


	public void setLongueur(int longueur) {
		this.longueur = longueur;
	}

	
	
	public Rectangle(int largeur, int longueur) {
		setLargeur(largeur);
		setLongueur(longueur);
	}

	@Override
	public double surface() {
		
		return largeur * longueur;
	}
}
