
public class Ex_1 {

	public static void main(String[] args) {
				
		int up=0, down=10;
		
		while(++up<10 || --down>0)
			System.out.println(up+","+down);
		/* 
		  	1,10
			2,10
			3,10
			4,10
			5,10
			6,10
			7,10
			8,10
			9,10
			10,9
			11,8
			12,7
			13,6
			14,5
			15,4
			16,3
			17,2
			18,1
		 */

	}

}
