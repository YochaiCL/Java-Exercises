import java.util.Scanner;
public class Ex_11 {

	public static boolean specialNumber(int num) {

		boolean flag = false;

		if (num > 9 && num < 100) {

			int digit = num / 10, dozen = num / 10 % 10;

			if (digit == dozen)

				flag = true;
		}

		else if (num > 99) {

			int sumDi = 0, sumDo = 0;

			flag = false;

			while (num > 0 && !flag) {

				int digit = num % 10, dozen = num / 10 % 10;

				sumDi += digit;

				sumDo += dozen;

				num /= 10;
				
				if (num>0)
					num/=10;

				if (sumDi == sumDo)

					flag = true;
			}
		}
		return flag;
	}

	public static boolean isSpecialArray(int[] arr) {

		boolean flag = false;

		for (int i = 0; i < (arr.length/2) || !flag; i++) 
			
			flag=specialNumber(arr[i]);		

		return flag;
	}
	
	public static int countSpecial(int [] arr) {
		
		int count=0;
		
		for(int i=0;i<arr.length;i++) {
			
			if (specialNumber(arr[i])==true)
				
				count++;
		}
		
		return count;
	}
	
	public static int [] buildSpecialArray(int []arr1,int []arr2) {
		
		boolean flag1, flag2;
		
		flag1=isSpecialArray(arr1);
		
		flag2=isSpecialArray(arr2);
		
		if (flag1&&flag2) {
			
			int count1,count2;
			
			count1=countSpecial(arr1);
			
			count2=countSpecial(arr2);
			
			int [] verySpecial=new int [(count1+count2)];
			
			boolean stop=true;
			
			int j=0;
			
			for (int i=0;i<arr1.length && stop;i++) {
				
				if (specialNumber(arr1[i])==true) {
					
					verySpecial[j]=arr1[i];
					
					j++;
					
				}
					
				else
					stop=false;
			}
			
			for (int i=0;i<arr2.length;i++) {
				
				if (specialNumber(arr2[i])==true) {
					
					verySpecial[j]=arr2[i];
					
					j++;
				}
			}
			
			return verySpecial;
		}
		
		int [] empty= {};
		
		return  empty;		
	}
	
	public static void fillArray(int [] arr) {
		
		Scanner input=new Scanner (System.in);
		
		for (int i=0; i<arr.length;i++) {
			
			System.out.println("please enter a number:");
			
			arr[i]=input.nextInt();	
		}	
	}
	
	public static void print (int [] arr) {
		
		for (int i=0; i<arr.length;i++) {
			
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {	
		
		int [] arr1=new int [4];
		
		int [] arr2=new int [4];
		
		fillArray(arr1);
		
		fillArray(arr2);
						
		int [] result=buildSpecialArray(arr1,arr2);
		
		print (result);
	}
}
