package _03_Agregation;

import java.util.List;

public class Promotion {

	List<Etudiant> etudiants;

	public Promotion(List<Etudiant> etudiants) {

		this.etudiants = etudiants;
	}

	@Override
	public String toString() {
		// return "Promotion [etudiants=" + etudiants + "]";
		
		String result = "Promotion : \n";;
		
		for (Etudiant etudiant : etudiants) {
			result += "\t" + etudiant + "\n";
		}
		
		return result;
	}
}
