
public class Ex_3 {
	
	public static int zikli (int num1, int num2, int num3, int num4) {
		
		int count=0, oldNum1, max=0;
		
		oldNum1=num1;
		
		while (num1!=0 || num2!=0 || num3!=0 || num4!=0) {
			
			num1=Math.abs(num1-num2);
			num2=Math.abs(num2-num3);
			num3=Math.abs(num3-num4);
			num4=Math.abs(num4-oldNum1);
	
			count++;
			oldNum1=num1;
		}
		if (count>max) {
			max=count;
		}
		return max;
		
	}
	
	public static void main(String[] args) {
		
		int result=0, max=0;
		int maxnum1=0, maxnum2=0, maxnum3=0, maxnum4=0;
		
		for (int num1=5;num1<=10;num1++) {
			
			for(int num2=5;num2<=10;num2++) {
		
				for(int num3=5;num3<=10;num3++) {
					
					for(int num4=5;num4<=10;num4++) {
					
						result=(zikli(num1, num2, num3, num4));
					
						if (result>max) {
							max=result;
							maxnum1=num1;
							maxnum2=num2;
							maxnum3=num3;
							maxnum4=num4;}
					}}}}
				
		
		System.out.println("Max times it:"+max);
		System.out.println("The first number is:"+maxnum1);
		System.out.println("The second number is:"+maxnum2);
		System.out.println("The third number is:"+maxnum3);
		System.out.println("The fourth number is:"+maxnum4);
	}
}
