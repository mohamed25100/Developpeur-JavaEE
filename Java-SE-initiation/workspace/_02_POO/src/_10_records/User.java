package _10_records;

public record User(String nom, String prenom, int age) {
	
	// Il sera possible d'accéder au nom via XX.nom() (au lieu de getNom() avec une classe
	
	// toString, equals et hashCode sont déjà implémentés
}
