
public class Ex_4 {
	
	public static boolean chackArr (int [] arr) {
		
		int middale=arr.length/2;
		
		boolean flag=true;
		
		if (arr.length>=3 && arr.length%2==1) {
			
			for (int i=0; i<arr.length&&flag; i++) {
				
				if (i<middale) 
					
					if (arr[i]<=arr[middale])
						
						flag=false;
				
				if (middale<i)
					
					if (arr[i]>=arr[middale])
						
						flag=false;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		
		int [] arr= {22,56,123,12,10,-4,2};
		
		System.out.println(chackArr(arr));
	}
}
