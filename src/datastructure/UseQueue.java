package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 */
		Queue<String> fruit = new LinkedList<>();

		// Add elements
		fruit.add("apple");
		fruit.add("orange");
		fruit.add("kiwi");
		fruit.add("pineapple");
		fruit.add("mango");
		fruit.add("ginger");
		fruit.add("avocado");
		System.out.println(fruit);

		// Peak first element
		System.out.println("Peek first element " + fruit.peek());

		// Print first element
		System.out.println("Print first element " + fruit.element());

		// Remove one element
		System.out.println("Remove pineapple " + fruit.remove("pineapple"));

		// Poll (peak and remove)
		fruit.poll();
		System.out.println("After first poll" + fruit);

		// Check if it contains mango
		System.out.println("Check if it queue contains mango : " + fruit.contains("mango"));

		System.out.println(" print elements after second poll using for each loop ");
		// Poll again and print all element with for each
		fruit.poll();
		for (String veggie : fruit) {
			System.out.println(veggie);
		}
		System.out.println(" print elements after second poll using iterator ");
		Iterator<String> it = fruit.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}
}