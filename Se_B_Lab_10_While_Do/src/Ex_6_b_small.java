import java.util.Scanner;
public class Ex_6_b_small {

	public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	
	int num,res=0;
	char op;
	
	System.out.println("please enter An arithmetic exercise:");
	res=input.nextInt();
	op=input.next().charAt(0);
	
	while(op!='=') {
	
		switch (op){
		
		case '+': num=input.nextInt();
		res+=num;
		break;
		
		case '-':num=input.nextInt();
		res-=num;
		break;
		}
		op=input.next().charAt(0);
	}
	System.out.println(res);
	}

}
