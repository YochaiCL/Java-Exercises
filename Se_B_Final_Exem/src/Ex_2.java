
public class Ex_2 {

	public static void main(String[] args) {
		
		int num=198732, sum=0;
		int x,y;
		float fx,fy;
		boolean f1,f2;
		
		while(num!=0) {
			sum+=num%10-num/10%10;
			num/=10;
		}
		
		System.out.println("sum"+sum+ " num="+num);
		
		x=2/3+1%9;
		y=(++x)*8;
		
		while((x+=2)<y)
			System.out.println("x="+x);
		
		f1=x>y && (--x)>y;
		System.out.println(f1+" "+x);
		
		x=y=3;
		fx=(x>3)?x+=4:y+8/1.5f;
		fy=12;
		while (fy-->10);
		System.out.println(x+" "+y+" "+fx+" "+fy);
		
		switch(x)
		{
			case 1:
			case 2:
			case 3:System.out.println("less equal 3");
			case 4:System.out.println("big then 3");
		}

	}

}
