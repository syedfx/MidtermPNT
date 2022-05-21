package datastructure;

import databases.ConnectToSqlDB;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 *
		 */
		ArrayList<String> CarName = new ArrayList<>();
		// Add elements
		CarName.add("Tesla");
		CarName.add("BMW");
		CarName.add("Benz");
		CarName.add("RR");
		CarName.add("Audi");
		CarName.add("Honda");
		CarName.add("Acura");

		// Print all elements
		System.out.println(CarName);

		// Access one element
		System.out.println(CarName.get(2));

		// Add one element
		CarName.add("Toyota");
		System.out.println("After adding Toyota" +CarName);

		// Remove element
		CarName.remove("Volvo");
		System.out.println("After Remove "+CarName);

		// Print all elements
		System.out.println("************************* using for each loop ****************");
		for(String car : CarName){
			System.out.println(car);
		}

		System.out.println("************************* using iterator ****************");
		// Print all elements using iterator
		Iterator<String> it = CarName.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		// Sort elements using Collections
		System.out.println("************************* After Sorting ****************");
		Collections.sort(CarName);
		Iterator<String> it2 = CarName.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}



	}

}
