package _08_Equals;

import java.util.Objects;

public class CompteBancaire {

	private String client;
	
	private String numeroCompte;
	
	private double solde;

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public String getNumeroCompte() {
		return numeroCompte;
	}

	public void setNumeroCompte(String numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	
	public CompteBancaire()
	{
		
	}
	public CompteBancaire(String client, String numeroCompte, double solde) {
		super();
		this.client = client;
		this.numeroCompte = numeroCompte;
		this.solde = solde;
	}

	@Override
	public String toString() {
		return "CompteBancaire [client=" + client + ", numeroCompte=" + numeroCompte + ", solde=" + solde + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(client, numeroCompte);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) // si c'est le même objet 
			return true;
		if (obj == null) // si obj est null
			return false;
		if (this.getClass() != obj.getClass()) // si this et obj sont de types différents
			return false;
		
		CompteBancaire other = (CompteBancaire) obj; // Transtypage (cast) de type 'Object' en type 'CompteBancaire'
		
		return Objects.equals(/*this.*/client, other.client) && Objects.equals(/*this.*/numeroCompte, other.numeroCompte);
	}
	
	
}
