
public class Ex_1 {
	
	public static void fillArray (int []arr) {
		
		int min=100, max=999, range=max-min+1;
		
		for (int i=0; i<arr.length;i++) {
			
			arr[i]=(int)(Math.random()*range)+min;
		}
	}
	
	public static void print (int [] arr) {
		
		int sum=0, sumAll=0;
		int number,count=0;
		
		for (int i=0; i<arr.length;i++) {
			
			sum=0;
			
			if(arr[i]%2==0) {
				
				number=arr[i];
				
				while(number>0) {
					
					sum+=number%10;
					
					number/=10;
				}
				count++;
				sumAll+=sum;
				System.out.println("the sum of number "+(i+1)+" is: "+sum);
			}
			
		}
		System.out.println("The avg is: "+ (sumAll/count));
	}

	public static void main(String[] args) {
		
		int [] arr=new int [39];
		
		fillArray(arr);
		print(arr);
		

	}

}
