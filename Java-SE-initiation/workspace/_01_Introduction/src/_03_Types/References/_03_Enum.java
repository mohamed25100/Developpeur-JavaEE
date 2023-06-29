package _03_Types.References;

public class _03_Enum {

	/*
	 * Un type énuméré est un type de données comportant un ensemble fini d'états (valeurs)
	 * auxquels sont associés un nom.
	 * 
	 * Un type énuméré est déclaré dans un fichier sépararé portant le même nom dque l'Enum.
	 * 
	 */
	public static void main(String[] args) {
		
		MonEnum rouge = MonEnum.ROUGE;
		MonEnum vert = MonEnum.VERT;
		
		System.out.println(rouge);
		System.out.println(vert);
	}
}
