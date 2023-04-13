
public class Ex_1 {
	
	public static int dis(int num,int dig) {
		
		int countRight=0, countLeft=0,revers, count=0, sum=0, x=0, saveNumber=num;
		boolean flag=true;
		
		while (num!=0) {
			
			while (num%10==dig || num !=0) {
				
				countRight++;
				
				num/=10;
			}
		}
		
		revers=num%10;
		sum+=revers;
		count++;
		num/=10;
		
		if(saveNumber==sum)
			flag=false;
		
		else {
			revers=num%10;
			sum+=revers*10;
			count++;
			num/=10;
		}
		
		if (saveNumber==sum)
			flag=false;
		
		x*=10;
		
		while(flag!=false) {
			revers=num%10;
			sum+=revers*x;
			count++;
			num/=10;
			
			if(saveNumber==sum)
				flag=false;
			
			x*=10;
		}
		
		do {
			revers=sum%10;
			num+=revers*Math.pow(10, count-1);
			count--;
			sum/=10;
		}
		
		while (0<=count);
		
		while(num!=0) {
			
			while (num%10==dig || num!=0) {
				countLeft++;
				num/=10;
			}
		}
		return(countRight+countLeft);
	}

	public static void main(String[] args) {
		
		int range=9-1+1;
		int dig=(int)((Math.random()*range)+200);
		int num=200, result, count=0, avg, sum=0;
		
		while(num<=2000) {
			result=dis(num,dig);
			
			if(result>0) {
				count++;
				sum+=result;
			}
			num++;}
			
			if(count<=0)
				System.out.println("no result");
			
			if(count>0)
				System.out.println("the result is:"+(sum/count));
		
		
	}

}
