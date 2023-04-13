package M_2021_Summer_B;

import unit4.collectionsLib.Queue;

public class Ex_1 {

	public static Queue<Integer> rezefByNum(int num) {

		Queue<Integer> result = new Queue<Integer>();

		for (int i = 1; i <= num; i++) {

			for (int j = 0; j < i; j++) {

				result.insert(i);
			}
		}

		return result;

	}

	public static boolean isRezef (Queue <Integer> t, int num) {
		
		
		boolean flag=true;
		
		
		
		while (!t.isEmpty()) {
			
			for (int i=1;i<=num && flag;i++) {
				if (t.head()==1)
					if (t.remove()!=i) 
						flag=false;
				
					else 
						i++;
				
//				if (t.head()>1) {
//					;
//					
//					for (int j=0; j<i;j++)
//						if ()
//				}

						
			}
		}
		return flag;
	}

	public static void main(String[] args) {

		Queue<Integer> s = (rezefByNum(4));

	}

}
