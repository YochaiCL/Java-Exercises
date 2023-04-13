package M_A;

import java.util.Random;

import unit4.collectionsLib.Node;
import unit4.collectionsLib.Stack;

public class Ex_5 {

	public static void main(String[] args) {

		Stack<String> s1 = new <String>Stack();

		Node<Stack<String>> l = null, p = null;

		Random rnd = new Random();

		int i, j;

		for (i = 0; i < 5; i++) {
			s1 = new <String>Stack();
			for (j = 0; j < 3; j++)
				s1.push(rnd.nextInt(100) + "");
			l = new Node(s1, l);
		}

		for (p = l, i = 0; i < 5; i++, p = p.getNext())
			System.out.println(p);

	}

}
