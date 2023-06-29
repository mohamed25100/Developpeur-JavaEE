package _05_Abstraction;

public class Carre extends Forme{

	private int cote;

	public int getCote() {
		return cote;
	}

	public void setCote(int cote) {
		this.cote = cote;
	}

	public Carre(int cote) {
		setCote(cote);
	}

	// Obligé de redéfinir la méthode 'abtraite' de la classe 'Forme'
	@Override
	public double surface() {
		
		return cote * cote;
	}
	
	// Il est possible, mais pas nécessaire, de redéfinir les méthodes non abstraites
	@Override
	public void methodeNonAbstraite() {
		System.out.println("Je redéfinis une méthode non abstraite d'une classe abstraite dans une classe fille.");
	}

}
