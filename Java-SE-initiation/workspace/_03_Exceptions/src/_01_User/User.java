package _01_User;

public class User {

	private String nom;
	private String prenom;
	private int age;
	
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
	// throws : permet de faire suiver l'exception à la méthode appelante
	public void setAge(int age) throws IllegalAgeException {
		
		if (age < 0) {
			// le mot clé 'throw' permet de lever une exception
			// throw new IllegalArgumentException("Un age ne peut pas être négatif");
			throw new IllegalAgeException();
		}
		// else : inutile...
		this.age = age;
	}
	
	public User(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public User(String nom, String prenom, int age) throws IllegalAgeException {
		this(nom, prenom);
		this.setAge(age);
	}
	@Override
	public String toString() {
		return "User [nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
	}
}
