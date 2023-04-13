import unit4.collectionsLib.BinNode;

public class Page_22_Ex_1 {

	public static BinNode<Integer> createList(int n) {

		int index = 1;

		BinNode<Integer> h = new BinNode<Integer>(index);

		BinNode<Integer> tmp = h;

		while (index < n) {
			index = index + 1;
			tmp.setRight(new BinNode<Integer>(index));
			tmp = tmp.getRight();
		}

		return h;
	}

	public static void printList(BinNode<Integer> h) {

		BinNode<Integer> tmp = null;

		for (tmp = h; tmp != null; tmp = tmp.getRight())
			System.out.print(tmp.getValue() + "->");
		System.out.println("||");
	}

	public static void main(String[] args) {

		BinNode<Integer> l = createList(5);

		printList(l);

	}

}
