import java.util.Scanner;
public class Ex_11_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int i=1, num, tmp;
		boolean flag=true;
		
		num=input.nextInt();
		i++;
		
		while(i<=15) {
			tmp=num;
			num=input.nextInt();
			
			if(num<tmp)
				flag=false;
			i++;
		}
		
		if(flag==false)
			System.out.println("no An ascending series");
		else
			System.out.println("An ascending series");

	}

}
