import java.util.Scanner;
public class Ex_4 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int i=1, team1, team2, sumTotal=0, minGame=0, sumGame=0, team=0,min, imin=0, iteam;
		
		System.out.println("please enter result of team 1 of game "+i);
		team1=input.nextInt();
		System.out.println("please enter result of team 2 of game "+i);
		team2=input.nextInt();
		
		min = minGame = Math.min(team1, team2); //התוצאה הכי נמוכה
		iteam=min;
		
		if (team1 > team2) {//אם קבוצה 2 קטנה יותר
			team = 2;//אז קבוצה 2 היא עם הסלים הנמוכים ביותר
			imin=i;}//והסלים הכי נמוכים היא במשתנה מינמאלי
		
		if (team2 > team1) {//אם קבוצה 1 קטנה יותר
			team = 1;//אז קבוצה 1 היא עם הסלים הנמוכים ביותר
			imin=i;}//והסלים הכי נמוכים היא במשתנה 
		
		sumGame = team1+team2;// סכום של של הקבוצות למשחק
		sumTotal+=sumGame;//סוכם את כל הסלים בכל המשחקים ובסוף מדפיס
		
		System.out.println("the sum in game "+i+" is="+sumGame);
		
		i++;
		
		while (i<=4) {
			System.out.println("");
			System.out.println("please enter result of team 1 of game "+i);
			team1=input.nextInt();
			System.out.println("please enter result of team 2 of game "+i);
			team2=input.nextInt();
			
			min = Math.min(team1, team2);//התוצאה הכי נמוכה
			
			if(min<minGame)//בודק איפה היה התוצאה הכי נמוכה בכל המשחקים
				minGame=min;//מציב את התוצאה הכי נמוכה במשתנה
			
			sumGame = team1+team2;// סכום של של הקבוצות למשחק
			
			if (team1 > team2)//אם קבוצה 2 קטנה יותר
				team = 2;//אז קבוצה 2 היא עם הסלים הנמוכים ביותר
			
			if (team2 > team1)//אם קבוצה 1 קטנה יותר
				team = 1;//אז קבוצה 1 היא עם הסלים הנמוכים ביותר
			
			if (team2<=minGame){//האם כמות הסלים למשחק היא יותא קטנה מהכמות הסלים המימנמאלית לשאר המשחקים
				imin=i;//אז מספר המשחק נשמר
				iteam=2;//מספר הקבוצה נשמרת
			}
			
			if (team1<=minGame){//האם כמות הסלים למשחק היא יותא קטנה מהכמות הסלים המימנמאלית לשאר המשחקים
				imin=i;//אז מספר המשחק נשמר
				iteam=1;//מספר הקבוצה נשמרת
			}
			
			sumTotal+=sumGame;//סוכם את כל הסלים בכל המשחקים ובסוף מדפיס
			
			System.out.println("the sum in game "+i+" is="+sumGame);
						
			i++;
		}
		
		System.out.println("");
		System.out.println("the total of team1 and team2 is: "+sumTotal);
		System.out.println("the min is "+minGame+" of team "+iteam+" in game "+imin);
	}

}
