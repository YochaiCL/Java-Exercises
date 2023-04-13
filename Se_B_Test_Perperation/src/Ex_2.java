
public class Ex_2 {

	public static void main(String[] args) {
		int i, j, k=8, p=3;
		double x, y = 0;
		char c;
		boolean b1,b2;
		j = ((i = 1) < (p = 4)) ? 7 * i + p : i - 7 * p;
		b1= (j < i + 5) && (k=56)>3 ;
		c = (char) ((i++) * (k--) +10);
		System.out.println("p="+p--+" i="+i+" j="+ ++j +" c="+c + (!b1 ? "yes!!!" : "no!!!" ));

		
		b1 = ('r'-'R' == 'f'-'F') || (14 <= -86);
		x = 2.5 - 33 % 4 * p++ ;
		j = 5; k = 2;
		i = ((p *= 7) % 2 > 0 && (y=++x) < 6) ? j : k-1;
		b2 = i <= j && j <= k;
		System.out.println("p="+p+" i="+i+" x="+ x++ +" y="+(int) y+" b1="+b1+" b2="+b2);
		
		
		int num=569;
		for ( j=0 ; j< 4 ; j++,num+=j)
		{ for(k=num, p = 1; k> 0 ; k/=10 )
		if(k%2==0)
		p = 0 ;
		System.out.println(num+" "+( p==1 ? "ok " :" Wrong"));
		}
	}

}
