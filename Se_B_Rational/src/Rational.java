
public class Rational {

	private int numerator, denom;
	
	public Rational (int x, int y) {//מקבל x ו y
		
		this.numerator=x;//המונה
		this.denom=y;//המכנה
	}
	
	public int getNumerator () {//לא מקבלת כלום
		
		return this.numerator;//מחזירה את המונה של השבר
	}

	public int getDenom() {//לא מקבלת כלום
		
		return this.denom;//מחזירה את המכנה של השבר
	}
	
	public boolean isEqual(Rational num) {//מחזיר תשובה בוליאנית // מקבלת מספר שבר
		
		return this.numerator*num.denom==this.denom*num.numerator;//לפי המשוואה שרשום בתחתית התרגיל
		/*
		 * לדוגמא:
		 * this=3/2
		 * num=9/6
		 * האם הם שווים?
		 * 3*6=18
		 * 9*2=18
		 * 18=18 מחזיר true
		 */
	}
	
	public Rational multply (Rational num) {//מונה כפול מונה ומכנה כפול מכנה
		//כאשר רשמנו pablic Rational זה אומר שאני צריך לקבל מספר קציונלי שזה שבר
		//ומקבלת מספר רציונלי
		
		int n,d;
		
		n=this.numerator*num.numerator;//מונה כפול מונה
		
		d=this.denom*num.denom;//מכנה כפול מכנה
		
		Rational r=new Rational (n,d);//מחזירים את התוצאה שקיבלנו כמספר רציונלי
		
		return r;
	}
	
	public Rational divided (Rational num) {//התוצאה שנקבל היא רציונלית שזה שבר
		//אנחנו נקבל מספר רציונלי
		
		if (num.numerator==0)//אם המונה הוא 0 אז זה לא פעולה חשבונית כי כל מספר חלקי 0 זה לא חוקי
			return null;//מחזיר קבוצה ריקה
		
		Rational r=new Rational (num.denom,num.numerator);//הקמנו משתנה רציונלי כאשר המכנה במונה והמונה במכנה
		
		return this.multply(r);//שולחים את המספר הרציונלי שיבצע הכפלה עם השבר this
	}
	
	public String toString() {
		
		return numerator+"/"+denom;//צורת הדפסה
	}
	

	/*
	 * נוסחא לחישוב מכנה משותף
	 * 3/7+2/5
	 * (35/7*3+35/5*2)/35
	 * או כאשר יש מינוס 3/7-2/5
	 * (35/7*3-35/5*2)/35
	 */
	
	public Rational addRational(Rational num) {//אנחנו מחזירים מצספר רציונלי  //מקבלים מספר רציונלי
		
	int n,d;
	
	d=this.denom*num.denom;
	
	n=(d/this.denom*this.numerator)+(d/num.numerator);
	
	return new Rational (n,d);
}
	
	public Rational subRational(Rational num) {//אנחנו מחזירים מצספר רציונלי  //מקבלים מספר רציונלי
		
		int n,d;
		
		d=this.denom*num.denom;
		
		n=(d/this.denom*this.numerator)-(d/num.numerator);
		
		return new Rational (n,d);
	}
	
}
