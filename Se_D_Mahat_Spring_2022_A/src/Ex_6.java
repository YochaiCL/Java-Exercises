
public class Ex_6 {
	
	public static int what (int [] arr) {
		
		int x=arr[0];
		int y=0;
		int z=0;
		
		for (int i=1; i<arr.length;i++) {
			
			if (arr[i]>x) {
				
				z=y;
				y=x;
				x=arr[i];
			}
			
			else if (arr[i]>y) {
				z=y;
				y=arr[i];
			}
			
			else if (arr[i]>z)
				
				z=arr[i];
		}
		return x+y+z;
	}

	public static void main(String[] args) {
		
		int [] arr= {12,13,1,10,34};
		
		System.out.println(what(arr));
		

	}

}
