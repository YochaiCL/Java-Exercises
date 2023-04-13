import java.util.Scanner;
public class Ex_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int i=1, num=1;
		
		do {
			if (num%2==0 || num%3==0) {//אם המספר מתחלק ב 2 או ב 3
				System.out.println(num);//אם כן הדפס את המספר
				i++;//אם כן תספור את המספר כאחד שהתחלק
			}
			num++;//עלה את המספר בספרה אחת יותר	
		}
		while(i<=20);
	}
}
