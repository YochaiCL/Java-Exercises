
public class Main_Adult {

	public static void main(String[] args) {
		
		Adult a1=new Adult("gogo",123456789,"Accounts Manager");
		Adult a2=new Adult("bonbon",987654321);
		Adult a3=new Adult(a1);
		
		System.out.println("a1:");
		a1.show();
		System.out.println("a2:");
		a2.show();
		System.out.println("a3:");
		a3.show();
		
		a1.setProfession("CEO");
		System.out.println("After Update a1:");
		a1.show();
		
		System.out.println("After Update a3:");
		a3.show();
		

	}

}
