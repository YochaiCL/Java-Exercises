import unit4.collectionsLib.Node;

public class Ex_7 {

	public static Node<Integer> ex_7 (Node<Integer> h){ // 4->23->7->31->4->42->3->34->||
		int count=0, i=1;
		Node<Integer> tmp = h;
		
		while(tmp != null) {
			count++;
			tmp = tmp.getNext();
		}
		
		tmp = h;
		
		if(count % 2 == 0) {
			while(i < (count/2)-1) {
				tmp = tmp.getNext();// 23 // 7
				i++;
			}
			
			if(tmp.getNext().getValue() > tmp.getNext().getNext().getValue())
				tmp.setNext(tmp.getNext().getNext());
			else
				tmp.getNext().setNext(tmp.getNext().getNext().getNext());
		}
		else {
			while(i < count -1) {
				tmp = tmp.getNext();
				i++;
			}
			tmp.setNext(null);
			h = h.getNext();
		}
		
		return h;
	}
	
	public static void printList(Node<Integer> h) {
		Node<Integer> tmp = null;
		for (tmp = h; tmp != null; tmp = tmp.getNext())
			System.out.print(tmp.getValue() + "->");
		System.out.println("||");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node<Integer> h8 = new Node<Integer>(34);
		Node<Integer> h7 = new Node<Integer>(3, h8);
		Node<Integer> h6 = new Node<Integer>(42, h7);
		Node<Integer> h5 = new Node<Integer>(4, h6);
		Node<Integer> h4 = new Node<Integer>(31, h5);
		Node<Integer> h3 = new Node<Integer>(7, h4);
		Node<Integer> h2 = new Node<Integer>(23, h3);
		Node<Integer> h = new Node<Integer>(4, h2);
		
		printList(h);
		h = ex_7(h);
		printList(h);
		
		
		System.out.println("--------------------------------------");
		
		Node<Integer> a7 = new Node<Integer>(3);
		Node<Integer> a6 = new Node<Integer>(42, a7);
		Node<Integer> a5 = new Node<Integer>(4, a6);
		Node<Integer> a4 = new Node<Integer>(31, a5);
		Node<Integer> a3 = new Node<Integer>(7, a4);
		Node<Integer> a2 = new Node<Integer>(23, a3);
		Node<Integer> a = new Node<Integer>(4, a2);
		
		
		printList(a);
		a = ex_7(a);
		printList(a);
	}

}