
public class Ex_Final_3 {

	public static void main(String[] args) {
		
		char letter= 'a';
		int row=1, pos;
		
		do {
			
			for(pos=1;pos<=row && letter <='z';pos++) {
				
				System.out.println(letter++);
			}
			row++;
			System.out.println();
		}
		while (letter<='z');
	}
}
