package _05_Abstraction;

public class Cercle extends Forme{

	private int rayon;
	
	public int getRayon() {
		return rayon;
	}

	public void setRayon(int rayon) {
		// si le rayon est négatif...
		this.rayon = rayon;
	}


	public Cercle(int rayon) {
		/*this.*/setRayon(rayon);
	}

	// Obligé de redéfinir la méthode 'abtraite' de la classe 'Forme'
	@Override
	public double surface() {
		
		return Math.round(Math.PI * rayon * rayon)/100.0;
	}

}
