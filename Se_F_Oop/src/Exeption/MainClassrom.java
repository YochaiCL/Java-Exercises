package Exeption;

public class MainClassrom {

	public static void main(String[] args) {

		int[] arr = new int[3];

		arr[0] = 100;
		arr[1] = 50;
		arr[2] =120;

		try {
			Classroom myClass1 = new Classroom("Doron", 3);
			Classroom myClass2 = new Classroom("Doron", 3);
			System.out.println(myClass1);
			myClass1.setGrades(arr);
			System.out.println(myClass1.returnGreade(4));
			System.out.println(myClass1.equals(myClass2));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}


// Questions:

// 1. if i want to write in index 2 of arr = null value - in order to get the exceptin error, what i need to do?
// 2. are the "return greades is writing ok?"