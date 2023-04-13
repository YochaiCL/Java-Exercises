import java.util.Random;
public class Ex_2_Techer {
	
	public static int [] createArray (int num) {
		
		int [] arr =null;
		
		int i, tmp;
		
		Random rnd=new Random ();
		
		if (num>0) {
			
			arr=new int [num];
			
			for (i=0; i<arr.length;i++) {
				
				tmp=1+rnd.nextInt(8);
				arr[i]=tmp*10+tmp+rnd.nextInt(10-tmp);
			}
		}
		
		return arr;
	}

	public static void main(String[] args) {
		
		createArray(50);
		
	}

}
