
public class Ex_3 {

	public static void main(String[] args) {
		char letter = 'a';
		int row = 1, pos;
		do{
		for(pos=1;pos<=row && letter <='z';pos++)
		{ System.out.print( letter++);
		}
		row++;
		System.out.println();
		}
		while (letter <= 'z');

	}

}
