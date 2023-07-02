package _04_Heritage;

public class App {

	public static void main(String[] args) {

		Client client = new Client("duck", "riri", 12, "+33 6 65 45 85 75");
		
		System.out.println(client);
		client.setSubscriber(true);
		System.out.println(client);

	}
}
