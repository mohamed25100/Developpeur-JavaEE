package _09_Genericite;

/*
 * Le concept de généricité peut s'appliquer à des classes et des méthodes :
 * - identiques d'un point de vue algorithmique
 * - mais manipulant des types de données différents
 * 
 * Intérêt : 
 * - Optimisation du code (moins de répétition)
 * - Moins de transtypage (cast) à faire
 * - Moins de risque d'erreur à l'exécution
 */
public class MyGeneric<T> {

	private T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public MyGeneric(T data) {
		super();
		this.data = data;
	}

	@Override
	public String toString() {
		return "MyGeneric [data=" + data + "]";
	}
}
