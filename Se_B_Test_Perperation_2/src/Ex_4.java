
public class Ex_4 {

	public static void main(String[] args) {
		int i,j,k=2,p=0;
		double x, y;
		char c;
		i= -7%9 +9%7;
		k+=j=2 ;
		x= i ++* -- j - k++;
		y= (++x*0.7) ;
		System.out.println ("i= "+(++i)+", j="+j+" ,k="+k+" , x= "+x+" , y="+y);
		
		
		
		i =9;
		j= 1;
		k='E'-'A';
		x=(double)i/(j+1);
		y=(double)(i/(j+1));
		System.out.println ("j="+(++j)+", k="+('C'+k--)+", i="+i+", K="+k);
		
		k=3481;
		for (i=1; k>0 ; )
		{
		p=k%10 ;
		System.out.println(p%2!=0? p : 0);
		k/=10;
		++i ;
		}
		System.out.println(); System.out.println("i="+i+" ,p="+p+" ,k="+k);
		
		p= 2%6;
		i= p +1 ;
		switch (i)
		{
		case 1:
		case 2:
		case 3: System.out.println(i+" is entered");
		System.out.println("the "+(char)(i+'A')+" case");
		case 4: break;
		case 5: System.out.println("GOOD LUCK !!!");
		break;
		default : System.out.println("the default case");
		}

	}

}
