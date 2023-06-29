package _03_Agregation;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {

		Notes notes = new Notes(12 , 14);
		
		Etudiant e1 = new Etudiant(1, "riri", notes);
		
		System.out.println(e1);
		
		Etudiant e2 = new Etudiant(2, "fifi", new Notes(13 , 15));
		
		System.out.println(e2);
		
		List<Etudiant> l1 = new ArrayList<Etudiant>();	
		
		l1.add(e1);
		l1.add(e2);
		
		Promotion p1 = new Promotion(l1);
		
		System.out.println(p1);
		
	}

}
