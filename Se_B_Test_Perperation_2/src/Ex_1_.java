
public class Ex_1_ {

	public static void main(String[] args) {
		
		int N=5;
		
		for(int i=0;i< N;i++) {
			
			for(int j=0; j<N;j++) {
				
				if(i== 0 || i == N-1 || i+j == N-1) 
					System.out.print( 'z');
				
				else System.out.print (' '); }
			
			System.out.println(); }

	}

}
