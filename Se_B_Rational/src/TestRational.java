import java.util.Scanner;
public class TestRational {
	
	public static Rational kelet() {//פונקציה שמחזירה מספר רציונלי וקולטת מספר רציונלי מהמשתמש
		
		Scanner input = new Scanner (System.in);//Scanner
		
		System.out.println("entyer a numoretor:");//הכנס את המונה
		int num=input.nextInt();
		
		System.out.println("enter denom:");//הכנס את המכנה
		int denom=input.nextInt();
		
		while (denom==0) {//אסור שהמכנה יהיה 0
			
			System.out.println("error denom can not be zero, try agian:");
			denom=input.nextInt();
		}
		
		return new Rational (num,denom);//החזר מספר רציונלי
		
	}

	public static void main(String[] args) {
		
		Rational r1,r2;
		
		r1=kelet();//שומרים בתוך r1 את הערך שקיבלנו מפונקציה kelet
		r2=kelet();//שומרים בתוך r2 את הערך שקיבלנו מפונקציה kelet
		
		/*
		 * אז בעצם אנו קולטים ומונה ומכנה עבור 2 המספרים הנל
		 * ובסוף נקבל 2 מספרים רציונלים
		 */
		
		System.out.println(r1);//הדפסה של r1 ו r2
		System.out.println(r2);
		
		if (r1.isEqual(r2))//בודק אם שני המספרים הרציונלים שווים
			System.out.println("the numbers are equal");//אם התוצאה היא true  אז שידפיס את השורה הרשומה
		
		System.out.println(r1+"/"+r2+"="+r1.divided(r2));//שידפיס את תוצאת החילוק
		
		System.out.println(r1+"*"+r2+"="+r1.multply(r2));//שידפיס את תוצאת הכפל
		
		System.out.println(r1+"+"+r2+"="+r1.addRational(r2));//שידפיס את תוצאת החיבור
		
		System.out.println(r1+"-"+r2+"="+r1.subRational(r2));//שידפיס את תוצאת החיסור
	}
	
}
