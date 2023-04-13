
public class Ex_2 {

	public static void main(String[] args) {
		
		int i,j,k,p=10;
		float x, y;
		char tav,c;
		for (i=0 ; i<p ; i+=2)
		if ((i%3)!= 0) System.out.println(i);
		System.out.println( 'a'>'A'? "Sunday":" Thursday");
		
		
		i = 3;
		boolean flag1=false, flag2;
		p= i%5 ;
		y = (flag1)? 10/3 :10/(float)3 ;
		flag2 = !flag1 || (y == 3) ;
		System.out.print("p = " + p + " ,i = " + i +" , " );
		System.out.println(" flag2=" + flag2 + " , y=" + y );
		
		i=15;
		j=5;
		while((i/=2)!= 0)
		j--;
		System.out.println("i= " + i + " ,j=" + j );
		x= ( i>j) ? i+4/j : j/(i+5) ;
		System.out.println("x=" + x );
		
		tav = 'a' + 1 ;
		switch (tav)
		{
		case 'a' : System.out.println("good"); break;
		case 'b' : System.out.println ("nice");
		default: System.out.println ("not good");
		}
		System.out.println("tav =" + tav + ",c =" +(char)(tav+2));

	}

}
