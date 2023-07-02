package _04_Heritage;

public class Client extends User{

	private String phone;
	
	private boolean isSubscriber;

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public boolean isSubscriber() {
		return false;
	}

	public void setSubscriber(boolean isSubscriber) {
		this.isSubscriber = isSubscriber;
	}

	public Client(String nom, String prenom, int age, String phone) {
		super(nom, prenom, age); // appel du constructeur à 3 paramètres de la classe mère (User)
		this.phone = phone;
		
		int test = super.age; // super.age est accessible car marqué comme protected dans la classe 'User'
	}

	@Override
	public String toString() {
		if (isSubscriber) {
			return super.toString() + "Je suis client. Mon numéro est " + this.getPhone();
		}
		else {
			return super.toString() + "Je suis pas client. Mon numéro est " + this.getPhone();
		}
	}
	
}
