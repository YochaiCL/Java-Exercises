import java.util.Scanner;
public class Ex_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("enter a char:");
		char tmp = sc.next().charAt(0);
		
		switch (tmp) {
		case 'A':System.out.print(tmp);
		case 'B':System.out.print(tmp);break;
		case 'C':System.out.print((char)(tmp+1));break;
		case 'D':System.out.print(tmp+2);
		case 'E':System.out.print((char)(tmp+3));break;
		case 'F':System.out.print(" "+tmp+4);
		default:System.out.print('S');
		}
		
		/*A - AA
		 *B - B
		 *C - D 
		 *D - 70G 
		 *E - H
		 *F - F4S
		 *def - S
		 */
		
		/*case 'D':System.out.print(tmp+2);
		 * tmp + 2 = dechimal number +2 (int)
		 * 68+2 = 70
		 */
		
		/*case 'D':System.out.print((char)(tmp+3));break;
		 * tmp + 3 = dechimal number +3 (int)
		 * D + 3 = 68+3 = 71
		 * (char)71 = G
		 */

	}

}
