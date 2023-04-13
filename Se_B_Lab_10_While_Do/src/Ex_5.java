import java.util.Scanner;
public class Ex_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num, revers, count=0,sum=0, x=10,saveNumber;
		boolean flag=true;
		
		System.out.println("please enter a number:");
		num=input.nextInt();  //12345
		
		saveNumber=num; // save num into saveNumber  
		
		revers = num%10;// 12345%10 = 5
		sum+=revers;// sum=5
		count++;// 1
		num/=10;// num = 12345/10 = 1234
		
		if(saveNumber==sum) // 12345 == 5
			 flag=false;	
		
		else {
		revers = num%10; // 1234%10 = 4
		sum+=revers*10;// 4*10 + 5 = 40+5=45
		count++; // 2
		num/=10; }// 123
		
		
		if(saveNumber==sum) //12345 == 45
			 flag=false;	
		
		x*=10; // x= 10*10 =100
		
		while (flag != false) {
			
			revers = num%10; // 123%10 = 3   // 12%10 = 2  // 1%10= 1
			sum+=revers*x;// 3*100 + 45 = 300+45 = 345  // 2*1000 + 345 = 2000+345 = 2345 // 1*10000 + 2345 = 12345
			count++; // 3  // 4 // 5
			num/=10; // 123/10 = 12  //  12/10 = 1 // 1/10 = 0
			
			if(saveNumber==sum) //12345 == 345 // 12345 == 2345 // 12345
				 flag=false;    // false
			
			x*=10;  //100*10 = 1000  // 1000*10 = 100000 // (10000*10 = 100000 usless)
			} 
		
		do {
			revers = sum%10; //12345%10 = 5
			num+=revers*Math.pow(10, count-1); //5 בחזקת 10 ,(5-1) = 5 בחזקת 10 ,4 = 5000
			count--;//5-1 = 4
			sum/=10; //12345/10= 1234
		}
		
		while (0<=count);
		
		//the difference in Absolute value is:
		System.out.println(saveNumber+" - "+ num+ " = "+ (Math.abs(saveNumber-num)));
		
				
		}	
}
