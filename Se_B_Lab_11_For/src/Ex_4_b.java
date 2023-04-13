import java.util.Scanner;
public class Ex_4_b {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		
		int sum=0, count=0, countSmall=0,exem=0,student=1, n;
		double test=0;
		boolean flag=true;
		
		System.out.println("please writh how much grades you going to enter for student: "+student);
		
		for (int i=input.nextInt(); i>0 && flag ;) {
			
			test=i;
			
			System.out.println("please enter grade number "+(++exem)+":");
			
			int grade=input.nextInt();
			
			while (grade<0 || grade>100) {
				System.out.println("Eroor! please writh grade between 0 to 100");
				System.out.println("please enter grade number "+(exem)+":");
				grade=input.nextInt();
			}
			
			if (grade>80)
				count++;
			
			if (grade<55)
				countSmall++;
			
			--i;
			
			for (; i>0 && flag; --i ) {
				
				sum+=grade;
				
				System.out.println("please enter grade number "+(++exem)+":");
				grade=input.nextInt();
				
				while (grade<0 || grade>100) {
					System.out.println("Eroor! please writh grade between 0 to 100");
					System.out.println("please enter grade number "+(exem)+":");
					grade=input.nextInt();}
				
				if (grade>80)
					count++;
				
				if (grade<55)
					countSmall++;
			}
			
			System.out.println("the avrage of all grades is:"+(sum/test));
			System.out.println("the number of grade higher than 80 is:"+count);
			System.out.println("the number of fail grades is:"+countSmall);
			System.out.println();			
			System.out.println("do you want enter grades of Other student? 1 for yes! 2 for no!");
			n=input.nextInt();
			
			if (n==1) {
				
				flag=true;
				
				student++;
				exem=0;
				sum=0;
				count=0;
				countSmall=0;
				
				System.out.println("please writh how much grades you going to enter for student: "+student);
				i=input.nextInt();
		
			}
			
			if (n==2) {
				flag=false;
				System.out.println("Thank you, have a nice day !!!");
			}
					
		}		
	}

}
