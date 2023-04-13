import java.util.Scanner;
public class Ex_2_more {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
				int i,k,p,j;
		
				for (i =0,k=0,p=0,j=0; i < 8; i++)
					
				{ char c =sc.next().charAt(0);
				
				switch (c)
				{ case 'a' :
				case 'u' :
				case 'e' :
				case 'i' :
				case 'o' : p++;
				break;
				default: if(c >='A' && c <='Z' )
							k++;
						else
							j++;
				}
				System.out.println((c >='a' && c <='z')? c: '\n');
				}
				System.out.println("p ="+p+" k="+k+ " j="+j);

	}

}

