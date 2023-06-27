package _03_Types.References;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class _04_Collections {

	/*
	 * Contrairement à un tableau une collection n'a pas une taille fixe.
	 */
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		list.add("f");
		
		System.out.print("Parcours de liste avec boucle for normale : ");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.print (list.get(i) + " ");
		}

		System.out.print ("\nParcours de liste avec boucle foreach : ");
		
		for (String string : list) {
			System.out.print(string + " ");
		}
		
		System.out.println();
		
		System.out.println("\nLa classe outil 'Collections'");
		
		/*
		 * La classe "Collections" offre plusieurs méthodes utilitaires
		 */
		
		System.out.println(list + "(list)");
		Collections.shuffle(list);
		System.out.println(list + "(shuffle)");
		
		Collections.sort(list);
		System.out.println(list + "(sort)");
		
		// décallage à gauche
		
		Collections.rotate(list, -1); // décallage de 1 à gauche
		System.out.println(list + "(rotate -1)");
		
		// décallage à droite
		Collections.rotate(list, 1); // décallage de 1 à gauche
		System.out.println(list + "(rotate +1)");
		
		Collections.reverse(list);
		System.out.println(list + "(reverse)");
		
		// Récupération d'une sous liste
		List<String> sub = list.subList(2, 5); // entre index 2 et 5 exclu
		System.out.println(sub + "(list.subList(2, 5))");
		
		System.out.println("\n------------- TABLEAUX ASSOCIATIFS --------------\n");
		
		/*
		 * Un tableau associatif (parfois appeké dictionnaire) ou 'map' permet d'associer
		 * un ensemble de clés à un encembles de valeurs.
		 * Les clés d'un 'map' sont uniques.
		 */
		// Map<Integer, String> map = new TreeMap<Integer, String>();
		// Map<Integer, String> map = new LinkedHashMap<Integer, String>();
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "un");
		map.put(2, "deux");
		map.put(3, "trois");
		map.put(4, "quatre");
		map.put(5, "cinq");
		map.put(1, "doublon"); // la clé existe déjà => l'entrée sera écrasée par la nouvelle valeur
		
		for (Integer item : map.keySet()) { // keySet => retoure la liste des clés du dictionnaire
			System.out.print(item + " ");
		}
		System.out.println("\n-------------");
		// for (Map.Entry<Integer, String> entry : map.entrySet()) {
		for (var entry : map.entrySet()) { // var : inférence de type : le compilateur 
			Integer key = entry.getKey(); // peut détermnier le type de 'entry' à partir de celui de 'map.entrySet()'
			String value = entry.getValue();
			
			System.out.println("clé : " + key + " - value : " + value);
		}
		
		System.out.println(map + " (avant suppression)");
		
		map.remove(2); // Attention à ne pas confondre la clé '2' avec l'indice 2 d'un tableau
		
		System.out.println(map + " (après suppression)");
	}
}
