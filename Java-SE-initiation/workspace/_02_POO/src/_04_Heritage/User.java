package _04_Heritage;

public /*final*/ class User { // final : interdit l'héritage

	private String nom;
	private String prenom;
	// private int age; // private : accessible seulement dans la classe
	protected int age; // Protected : accessible dans le package et les sous classes (où qu'elles soient)

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public User() {
		
	}
	
	public User(String nom, String prenom) {
		this();
		this.nom = nom;
		this.prenom = prenom;
	}

	public User(String nom, String prenom, int age) {
		this(nom, prenom);
		this.age = age;
	}

	
	@Override
	public /*final*/ String toString() { // 'final' : interdit l'override dans les classes filles
		return "Je m'appelle " + this.getPrenom() + " " + this.getNom() + ". ";
	}
}
