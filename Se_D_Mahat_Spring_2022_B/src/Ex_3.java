
public class Ex_3 {
	
	public static boolean exclusive (int [] arr) {
		
		boolean flag=true;
		
		for (int i=0; i<arr.length-1 && flag;i++)
			
			for (int j=i+1;j<arr.length;j++) {
				
				if (arr[i]==arr[j])
					flag=false;
				
			}
		
		return flag;
	}
	
	// הסיבוכיות היוא o(n^2)
	// כי 2 הלולאות רצות בגודל n
	
	public static void main(String[] args) {
		
		int [] arr= {1,2,3,4,5,6,7,8};
		
		System.out.println(exclusive(arr));
	
	}

}
