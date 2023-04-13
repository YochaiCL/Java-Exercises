
public class Ex_2 {

	public static void main(String[] args) {
		
		int i,j,k,p=10;
		
		float x,y;
		
		char tav,c;
		
		boolean flag1, flag2;
		
		for (i=0;i<p;i++)
			if((i%3)!=0) System.out.println(i);
		System.out.println('a'>'A'?"sunday":"thursday");
		
		i=3;
		
		p=i%5;
		
		flag1=true;
		
		y=(flag1)? 10/3 :10/(float)3;
		
		flag2=!flag1 || (y==3);
		
		System.out.print("p="+p+" ,i="+i+" , ");
		System.out.println("flag2="+flag2+" ,y="+y);
		
		
		tav='a'+1;
		
		switch (tav) {
		
		case 'a': System.out.println("good");break;
		case 'b': System.out.println("nice");
		default: System.out.println("not good");
		}
		
		System.out.println("tav="+tav+", c="+(char)(tav+2));
		
		
		
	}
}


