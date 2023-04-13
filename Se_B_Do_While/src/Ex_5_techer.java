import java.util.Scanner;
public class Ex_5_techer {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		input.useDelimiter("");//קליטה של כל התווים בשורה אחת
		
		char ch;
		int num=0,sum=0;
		
		System.out.println("please enter An arithmetic exercise:");
		
		do {
			ch = input.next().charAt(0); //digit or + or =
			
			if (ch>='0' && ch<='9')//אם מה שקלטנו הוא ספרה
				num = num*10+ch-'0';//קולט את הספרות אחד אחרי השני
			//אם רשמנו 123 אז הוא עושה 1 ואז 2 ואז 3
			
			else if (ch=='+' || ch=='=')
			{
				sum+=num;//סוכם בתוך sum את הספרות הראשונות
				num=0;//מאפס את num כדי לקבל שוב ספרות חדשות
			}
		}
		while (ch!='=');//כל עוד זה לא = אז הוא ממשיך לקבל ספרות
		
		System.out.println(sum);
	}

}
