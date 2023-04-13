package Cat;

public class Main {

	public static void main(String[] args) {

		Cat c1 = new Cat("kobi1", 2.0, "red");

		StreetCat c2 = new StreetCat("kobi2", 2.1, "blue", 3);

		SiamiCat c3 = new SiamiCat("kobi3", 2.2, "green", "pork");

		System.out.println(c1);

		System.out.println(c2);

		System.out.println(c3);

	}

}