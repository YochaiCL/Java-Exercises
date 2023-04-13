
public class Ex_10 {
	
	public static int weigtNum (int num) {
		
		int sum=0;
		
		while (num>0) {
			
			sum+=num%10;
			num/=10;
		}
		return sum;
	}
	
	public static boolean weigtArr (int [] arr) {
		
		int [] weigt=new int [arr.length];
		
		boolean flag=true;
		
		for (int i=0; i<arr.length;i++)
			
			weigt[i]=weigtNum(arr[i]);
		
		for (int i=1; i<arr.length && flag; i++)
			
			for (int j=0; j<i && flag; j++)
				
				if(arr[j]==arr[i])
					
					flag=false;
		
		return flag;
	}
	
	public static boolean weigtArrs (int [] arr1,int [] arr2) {
		
		boolean flagArr1=true, flagArr2=true;
		
		boolean flagI=true;
		
		boolean flagRes=true;
		
		flagArr1=(weigtArr(arr1));
		
		flagArr2=(weigtArr(arr2));
		
		if (flagArr1 && flagArr2)
			
			for (int i=0;i<arr1.length && flagRes;i++)
				
				for (int j=0; j<arr2.length && flagRes; j++) {
					
					if (arr2[j] != arr1[i])
						
						flagI=false;
					
					if (flagI==false && j==arr2.length-1)
						
						flagRes=false;
				}
		
		return flagRes;
	}
	
	

	public static void main(String[] args) {
		

	}

}
