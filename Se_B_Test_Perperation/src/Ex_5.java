public class Ex_5 {
	
	public static boolean sameOdd(int num) {
		
		int odd=num%2;
		//boolean flad=true;
		
		while (num>0) {//num>0 && flage==false;
						
			if (num%2!=odd) 
				return false;//flag=fulse;
			
			num/=10;
		}
		return true;//return flag;
	}
	
	public static int randum () {
		
		int range=4567783-(-254)+1;
		
		int number=(int)(Math.random()*range)+(-254);
		
		return number;
				
	}
	
	public static void main(String[] args) {
		
		int num, sum=0, count=0, min=4567783, mini=-1, count3digit=0;
		
		for (int i=1; i<=50; i++) {
			
			 num=randum();
			 System.out.println(num);
			 
			 if (sameOdd(num)) {
				 sum+=num;
				 count++;
				 
				 if (num<min) {
					 min=num;
					 mini=count;
				 }
			 }
			 
			 if (num>99 && num<1000 || num <-99 && num>-1000)
				 count3digit++;
		
			}
		
		if (count!=0)
			System.out.println("the avrage is:"+sum/count);
		else
			System.out.println("we do not have same odd digits");
		
		if (mini==-1)
			System.out.println("we do not have same odd digits");
		else
			System.out.println("the position of the min number is:"+mini);
		
		System.out.println("3 digit="+count3digit);
		
		}

	}


