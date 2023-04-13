import java.util.Scanner;
public class Ex_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int n1, n2, n3;
		double d1,d2;
		boolean b1,b2;
		
		n1=123;
		n2=0;
		
		while(n1!=0) {
			n2+=n1%10;
			n1=n1/10;
		}
		System.out.println("n1="+n1+" n2="+n2);
		
		d1=1/2;
		d2=(n1=1)/(double)(n2=2);
		b1=n1>1 && n2++>2;
		b2=d1>=0 || d2++>=2;
		System.out.println("n1="+n1+" n2="+n2+" d1="+d1+" d2="+(int)d2+" b1="+b1+" b2="+b2);
		
		n1=(!b1)?2/3+2%3:17;
		n2=(b1 || b2)?(int)(90/3.8-2):(int)(77-90/2.3);
		System.out.println("n1="+n1+" n2="+n2);

	}

}
