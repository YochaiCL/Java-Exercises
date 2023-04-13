
package Customer;

import java.util.Scanner;

import unit4.collectionsLib.Queue;

public class Main {

	public static void addCToQ(Queue<Customer> q) {

		Queue<Customer> tmp = new Queue<Customer>();

		Scanner input = new Scanner(System.in);

		System.out.println("please enter name:");
		String str = input.next();

		System.out.println("How many tickets:");
		int ticket = input.nextInt();

		System.out.println("Please enter tel:");
		int tel = input.nextInt();

		Customer c = new Customer(str, ticket, tel);

		if (!q.isEmpty()) {
			if (q.head().getName().equals(c.getName()))

				if (q.head().getTel() == c.getTel())

					return;
			tmp.insert(q.remove());
		}

		while (!tmp.isEmpty())
			q.insert(tmp.remove());

		q.insert(c);
	}

	public static Customer getService(Queue<Customer> q) {

		Customer c;

		c = q.remove();
		return c;

	}

	public static Queue<Customer> combined(Queue<Customer> q1, Queue<Customer> q2) {

		Queue<Customer> q3 = new Queue<Customer>();

		while (!q1.isEmpty() && !q2.isEmpty()) {

			q3.insert(getService(q1));
			q3.insert(getService(q2));
		}

		while (!q1.isEmpty())
			q3.insert(q1.remove());

		while (!q2.isEmpty())
			q3.insert(q2.remove());

		return q3;

	}

	public static void main(String[] args) {

		Queue<Customer> q1 = new Queue<Customer>();
		Queue<Customer> q2 = new Queue<Customer>();

		addCToQ(q1);

		addCToQ(q2);
		addCToQ(q2);

		System.out.println(combined(q1, q2));

	}

}
