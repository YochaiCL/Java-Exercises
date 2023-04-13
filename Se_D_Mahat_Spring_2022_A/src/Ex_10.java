import java.util.Scanner;
public class Ex_10 {
	
	public static int countNum (int num) {
		
		int count=0;
		
		while (num>0) {
			
			count++;
			
			num/=10;
		}
		
		return count;	
	}
	
	public static int lastNum (int num) {
		
		num=num%10;
		
		return num;
	}
	
	public static int firstNum (int num) {
		
		while (num>10) {
			num/=10;
		}
		
		return num;
	}
	public static boolean goldNumbers (int num1, int num2) {
		
		boolean flag = false;
		
		int sum1, sum2;
		
		int lastNumber1, lastNumber2;
		
		int firstNumber1, firstNumber2;
		
		sum1=countNum(num1);
		sum2=countNum(num2);
		
		lastNumber1=lastNum(num1);
		lastNumber2=lastNum(num2);
		
		firstNumber1=firstNum(num1);
		firstNumber2=firstNum(num2);
		
		if (sum1==sum2) 
			
			if (lastNumber1==lastNumber2) 
				
				if (firstNumber1==firstNumber2)
					
					flag=true;
					
		return flag;	
	}

	public static void main(String[] args) {
		
		Scanner input=new Scanner (System.in);
		
		int number1, number2;
		
		int [] arr=new int [6];
		
		boolean flag;
		
		for (int i=0; i<arr.length;) {
			do {
			
			System.out.println("please enter two numbers:");
			
			number1=input.nextInt();
			
			number2=input.nextInt();
			
		}while (number1 <=0 || number2<=0);
			
			arr[i]=number1;
			arr[i+1]=number2;
			
			i+=2;
		}
		
		for (int i=0; i<arr.length;) {
			
			flag=goldNumbers(arr[i],arr[i+1]);
			
			if (flag)
				
				System.out.println("the numbers "+arr[i]+" ,"+arr[i+1] + " are gold");
			
			i+=2;
			
		}

	}

}
