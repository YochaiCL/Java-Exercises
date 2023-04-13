import java.util.Scanner;
public class Ex_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		input.useDelimiter("");//כתיבת כל האותיות בשורה אחת
		
		char ch;
		int ca, ce, ci, co, cu;
		
		ca=ce=ci=co=cu=0;
		
		System.out.println("please enter a Sentence:");
		
		do {//מודיע כמה פעמים מופיעות האותיות עד שלוחצים נקודה
			ch = input.next().charAt(0);
			switch (ch) {
			case 'a':
			case 'A':ca++; break;
			case 'e':
			case 'E':ce++; break;
			case 'i':
			case 'I':ci++; break;
			case 'o':
			case 'O':co++; break;
			case 'u':
			case 'U':cu++; break;	
			}
		}
		while (ch!='.');
		
		System.out.println("amount a = "+ca);
		System.out.println("amount e = "+ce);
		System.out.println("amount i = "+ci);
		System.out.println("amount o = "+co);
		System.out.println("amount u = "+cu);
	}
}
