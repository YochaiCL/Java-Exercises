import java.util.Scanner;
public class Ex_4 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		input.useDelimiter("");//כתיבת כל האותיות בשורה אחת
		
		char ch;
		int count=0;
		boolean flag = false;
		
		System.out.println("please enter a Sentence:");
		
		do {
			ch =input.next().charAt(0);
			
			if(ch=='a' || ch=='A') { 
				flag = true;//מצאנו ערך a
				
				if (flag)//רק אם הדגל הוא נכון אז הוא יכנס פנימה
					count++;//סופר כמה מילים מכילים את a
					flag =false;//מחזירים את הדגל ללא נכון כי אנחנו רוצים לבדוק את המילה הבאה
			}
			
			else if (ch== ' ' || ch=='.') //סיימתי מילה באמצעות נקודה או רווח
				flag =false;
					
		}
		//ב do קולט את הנתונים עד במקום בו נקלוט את הנקודה ושם זה יגמר
		
		while (ch!='.');//עוצר ברגע שיש נקודה
		System.out.println("the amount of a is:"+count);
	}

}
