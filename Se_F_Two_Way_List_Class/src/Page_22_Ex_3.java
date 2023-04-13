import unit4.collectionsLib.BinNode;
import unit4.collectionsLib.Node;

public class Page_22_Ex_3 {

	public static BinNode<Integer> createList(BinNode<Integer> h,int num, BinNode <Integer> number) {

//		int index = 1;
//
//		BinNode<Integer> h = new BinNode<Integer>(index);
//
//		BinNode<Integer> tmp = h;
//
//		while (index < n) {
//			index = index + 1;
//			tmp.setRight(new BinNode<Integer>(index));
//			tmp = tmp.getRight();
//		}
//
//		return h;
	}

	public static void printList(BinNode<Integer> h) {

		BinNode<Integer> tmp = null;

		for (tmp = h; tmp != null; tmp = tmp.getRight())
			System.out.print(tmp.getValue() + "->");
		System.out.println("||");
	}

	public static void main(String[] args) {

		BinNode<Integer> l = new BinNode<Integer>(1);

		l = new BinNode<Integer>(l, 2, l);

		l = new BinNode<Integer>(l, 5, l);

		l = new BinNode<Integer>(l, 8, l);

		l = new BinNode<Integer>(l, 10, l);
		
		BinNode<Integer>number=null;

		printList(l);

	}

}
