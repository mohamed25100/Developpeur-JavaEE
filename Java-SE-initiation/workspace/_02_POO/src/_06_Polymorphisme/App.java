package _06_Polymorphisme;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {


		// Le polymorphisme est une conséquence de l'héritage
		// Un Animal peut prendre plusieurs formes et avoir différents types de comportement.
		// Un chin et un chat communique différement (l'un aboie, l'autre miaule...)
		Animal animal = new Animal();
		
		animal.communiquer();
		
		Animal chien = new Chien();
		
		chien.communiquer();
		
		Animal chat = new Chat();
		
		chat.communiquer();
		
		// Collection polymorphique de 'Animal'
		
		// On ne peut mettre que des objets de type 'Animal' dans la liste
		List<Animal> animaux = new ArrayList<Animal>();
		
		animaux.add(new Chien()); // Mais on peut y mettre des chiens
		animaux.add(new Chat());  // ET des chats
		animaux.add(new Chien());
		animaux.add(new Chat());
		animaux.add(new Chat());
		animaux.add(new Animal()); // puique chien et chat sont tous 2 des 'Animal'
		
		
		for (Animal ani : animaux) {
			ani.communiquer();// 2 animaux peuvent avoir des comportements différents
		}
	}
}
