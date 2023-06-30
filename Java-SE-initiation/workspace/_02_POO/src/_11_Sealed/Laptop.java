package _11_Sealed;

//Une classe héritant d'une classe 'sealed' doit au choix : 
//- final : la classe ne pourra plus être héritée
//- sealed : la classe pourra être héritée par une liste de classes autorisées
//- non-sealed : la classe pourra être héritée sans restriction

public final class Laptop extends Computer{

}
