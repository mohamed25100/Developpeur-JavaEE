package _01_User;

public class IllegalAgeException extends Exception {

	private static final long serialVersionUID = 1L;

	public IllegalAgeException() {
		super("Un age ne peut pas être négatif");
	}
	
}
