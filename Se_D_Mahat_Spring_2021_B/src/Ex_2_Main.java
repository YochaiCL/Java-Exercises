import java.util.Scanner;
public class Ex_2_Main {
	
	public static boolean goodsnack(Ex_2_Snack snack) {
		
		boolean flag=false;
			
			if (snack.getWeight()>=100) 
				
				if (snack.getKal()<=120)
					
					flag=true;
			
		return flag;
	}
	
	public static void fillArray (Ex_2_Snack[]arr) {
		
		Scanner input=new Scanner (System.in);
		
		String name="";
		int weight;
		double price;
		int kal;
		int count=0;
		
		
		for (int i=0;i<arr.length;i++) {
			
			System.out.println("please enter a name:");
			name=input.next();
			System.out.println("please enter weight:");
			weight=input.nextInt();
			System.out.println("please enter price:");
			price=input.nextDouble();
			System.out.println("please enter kal:");
			kal=input.nextInt();
			
			arr[i]=new Ex_2_Snack(name, weight, price, kal);
			
			if (goodsnack(arr[i]) && arr[i].getPrice()<=10)
				count++;
		}
		
		System.out.println("the number of good snaks are: "+count);
	}

	public static void main(String[] args) {
		
		Ex_2_Snack [] arr=new Ex_2_Snack[2];
		
		fillArray(arr);
		

	}

}
