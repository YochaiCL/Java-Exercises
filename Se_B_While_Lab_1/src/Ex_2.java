
public class Ex_2 {

	public static void main(String[] args) {
		
		int i=1, sum=0;
		
		while (i<=5) {
			sum+=i;
			++i;
		}
		System.out.println("sum="+sum);//15
		
		//i:
		System.out.println("i="+i);//6
		
		System.out.println("");
		
		//a
		while (i<=6) {
			sum+=i;
			++i;
		}
		System.out.println("sum="+sum);//21
		
		//i:
		System.out.println("i="+i);//7
		
		System.out.println("");
		
		//b
		
		i=1;
		sum=1;
		
		while (i<=10) {
			sum*=i;
			++i;
		}
		System.out.println("sum="+sum);//3628800
		
		//i:
		System.out.println("i="+i);//11
		
		System.out.println("");
		
		//c
		i=1;
		double div=1,sum2=0,round,mul=1,round2;
		
		while (i<=10) {
			sum2+=div/i;
			/* sum2=0+1.0/1=1.0
			 * sum2=1.0+1/2=1.5
			 * sum2=1.5+1/3=1.83
			 * sum2=1.83+1/4=2.08
			 */
			
			//d
			mul*=div/i;
			
			/* mul=1*1.0/1=1.0
			 * mul=1.0*1/2=0.5
			 * mul=0.5*1/3=0.17
			 * mul=0.17*1/4=0.04
			 */
			
			++i;
			
			round=Math.round(sum2*100)/100.0; // מתן 2 מספרים אחרי הנקודה
			round2=Math.round(mul*100)/100.0; // מתן 2 מספרים אחרי הנקודה
			
			//c
			System.out.println(round);
		
			//d
			System.out.println(round2);	
		}		
	}
}
