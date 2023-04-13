package Final_Test;

public class Driver {

	public static void main(String[] args) {
		
		B var1=new A();
		C var2=new C();
		B var3=new E();
		B var4=new C();
		Object var5=new A();
		
		var1.aaa();
		var1.ccc();
		var2.aaa();
		var2.bbb();
		var3.aaa();
		//var3.bbb();
		var4.aaa();
		//var5.aaa();
		((B)var5).aaa();
		//((E)var3.bbb());

	}

}
