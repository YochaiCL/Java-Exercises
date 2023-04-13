
public class Ex_7_Storage {
	
	private Ex_7_Book [] arr;
	
	private int numOfBooks;
	
	public Ex_7_Storage() {
		
		arr=new Ex_7_Book[1000];
		
		numOfBooks=0;
	}
	
	public void deleteBooks() {
		
		for(int i=0;i<this.arr.length;i++) {
			
			if (this.arr[i].getCopies()==0) {
				this.numOfBooks=this.numOfBooks-1;
				arr[i]=null;
			}
				
		}
	}

	

}
