import java.util.Scanner;
public class Ex_6_b {

	public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
		
		input.useDelimiter(""); 
		
		int num=0, res=0;
		
		char op ='=', ch;
		
		System.out.println("please enter An arithmetic exercise:");
				
		op=input.next().charAt(0);
		
		while(op>='0'&& op<='9')
		{
			num=num*10+op-'0';
			op=input.next().charAt(0);
		}
		
		res=num;
		
		while(op!='=')
		{
			switch(op)
			{
			case '+':num=0; 
					op=input.next().charAt(0);
					
					while(op>='0'&&op<='9')
					{
						num=num*10+op-'0';
						op=input.next().charAt(0);
					}
					res+=num;
					break;
					
			case '-':num=0;
					op=input.next().charAt(0);
					while(op>='0'&&op<='9')
						{
						num=num*10+op-'0';
						op=input.next().charAt(0);
						}
					res-=num;
					break;
			}
		
		}
		System.out.println(res);


	}

}
