package Employee;

public class main {

	public static void main(String[] args) {

		Programmer p = new Programmer("Katia", 123, 10223.3);

		Secratry s = new Secratry("Lamda", 456, 5000.6, 8);

		System.out.println(p);

		System.out.println(s);

		p.calcBonus();

		s.calcBonus();

		System.out.println(p);

		System.out.println(s);

	}

}
