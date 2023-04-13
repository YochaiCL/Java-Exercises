import java.util.Scanner;

public class Ex_12_Family {

	private String name;
	private int num;
	private double totalSum;

	public Ex_12_Family(int tmpNUm) {

		this.num = tmpNUm;
		this.totalSum = 0;
	}

	public double getTotalSum() {
		return this.totalSum;
	}
	
	public void setName(String tmpName) {
		this.name=tmpName;
	}

	public void input() {

		Scanner input = new Scanner(System.in);
		int age;
		double tot = 100;
		for (int i = 0; i < this.num; i++) {
			System.out.println("Enter age of "+(i+1));
			age = input.nextInt();
			if (age <= 3)
				tot += 20.5;
			else if (age > 3 && age <= 12)
				tot += 30;
			else
				tot += 40.5;
		}
		this.totalSum = tot;
	}

}
