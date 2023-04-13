import java.awt.image.AreaAveragingScaleFilter;

public class main {

	public static double sumOfCal(Animal[] a) {

		double sumCalc = 0;

		for (int i = 0; i < a.length; i++)
			sumCalc += a[i].getCal();

		return sumCalc;
	}

	public static void singingBirds(Animal[] a) {

		for (int i = 0; i < a.length; i++) {
			if (a[i] instanceof Bird) {
				Bird b = (Bird) a[i];
				b.sing();
			}
		}
	}

	public static void dance(Animal[] a) {

		for (int i = 0; i < a.length; i++) {
			if (a[i] instanceof Bird) {
				Bird b = (Bird) a[i];
				b.dance();
			}

			if (a[i] instanceof Snack) {
				Snack s = (Snack) a[i];
				s.dance();
			}
		}
	}

	public static String hipFatPre(Animal[] a) {

		double maxFat = 0;
		String hipNmae = " ";

		for (int i = 0; i < a.length; i++) {
			if (a[i] instanceof Hipo) {
				Hipo h = (Hipo) a[i];

				if (h.getFatPraceng() > maxFat) {
					maxFat = h.getFatPraceng();
					hipNmae = h.getName();
				}

			}

		}
		if (hipNmae.equals(" "))
			return "None";

		else
			return hipNmae;
	}

	public static void fillArrays(Park park, Reptile[] reptile, Bird[] bird, Mammal[] mammal, Animal[] animal) {

		int rep = 0;
		int bir = 0;
		int mem = 0;
		
		for (int i = 0; i < park.getCount(); i++) {
			if (park.getAnimal(i).getClass().getSuperclass().getName().equals("Reptile"))
				reptile[rep++] = (Reptile) park.getAnimal(i);

			if (park.getAnimal(i).getClass().getSuperclass().getName().equals("Bird"))
				bird[bir++] = (Bird) park.getAnimal(i);

			if (park.getAnimal(i).getClass().getSuperclass().getName().equals("Mammal"))
				mammal[mem++] = (Mammal) park.getAnimal(i);
		}
	}
	
	

	public static void main(String[] args) {
		Animal[] animal = new Animal[5];

		animal[0] = new Snack("bad snack", 10, true, 50, 200, true);

		animal[1] = new BrownCow("lili", 30, false, 500, 300, 12, 3, true);

		animal[2] = new Pigeon("jek", 15, false, 5, 5000, 30, true);

		animal[3] = new Crocodile("ralf", 25, true, 300, 50, false);

		animal[4] = new Hipo("fat vinni", 35, false, 800, 200, 3, 90);

		System.out.println("the sum of cal in animals are: " + sumOfCal(animal));

		singingBirds(animal);

		dance(animal);

		System.out.println("The most hipo with fat pre is: " + hipFatPre(animal));

		System.out.println("---------------------------------------------------");

		Park park = new Park();

		for (int i = 0; i < animal.length; i++) {
			park.addAnimalToPark(animal[i]);
		}

		Animal[] aboveAge10AndPredetor = park.aboveAge10AndPredetor();

		System.out.println("all animals that above Age 10 And Predetor:");

		for (int i = 0; i < aboveAge10AndPredetor.length; i++)
			System.out.println(aboveAge10AndPredetor[i]);

		System.out.println("count Of Predetors Reptiles And Birds is: " + park.countOfPredetorsReptilesAndBirds());

		System.out.println("---------------------------------------------------");

		Reptile[] reptile = new Reptile[2];

		Bird[] bird = new Bird[1];

		Mammal[] mammal = new Mammal[2];

		fillArrays(park, reptile, bird, mammal, animal);

	
		for(int i=0;i<reptile.length;i++)
			System.out.print(reptile[i]+" ");
		
		System.out.println();
		
		for(int i=0;i<bird.length;i++)
			System.out.print(bird[i]+" ");
		
		System.out.println();
		
		for(int i=0;i<mammal.length;i++)
			System.out.print(mammal[i]+" ");
		
		System.out.println("---------------------------------------------------");
		
		park.deleteFromArr(2);
		
		
		

		

	}

}
