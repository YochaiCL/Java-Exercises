
public class Ex_Final_5_Rect {
	
			public double l;
			public double w;
			String color;
			
			public Ex_Final_5_Rect (double l, double w, String c) {
				
				this.l=l;
				this.w=w;
				this.color=c;
			}
			
			public void draw() {
				
				System.out.println(this.color);
				
				for (int i=0; i<this.l; i++) {
					
					for (int j=0; j<this.w; j++)
						System.out.print("*");
					System.out.println();
				}
			}
			
			public void stretch (double k) {
				
				this.l=l*k;
				this.w=w*k;
			}
		

	}


