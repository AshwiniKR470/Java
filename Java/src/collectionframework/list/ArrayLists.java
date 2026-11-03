package collectionframework.list;
import java.util.ArrayList; // Import the ArrayList class
import java.util.Collections;  // Import the Collections class
public class ArrayLists {

	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object
		cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    System.out.println(cars);
	    cars.add(0, "Mazda"); // Insert element at the beginning of the list (0)
	    System.out.println(cars);
	    System.out.println(cars.get(0));  // Get the first element
	    cars.set(0, "Opel");//set the first element
	    System.out.println(cars);
	    cars.remove(0);
	    System.out.println(cars);
	    //cars.clear(); // remove all the elements in the ArrayList
	    System.out.println(cars.size());
	    for (int i = 0; i < cars.size(); i++) {
	        System.out.println(cars.get(i));
	      }
	    for (String i : cars) {
	        System.out.println(i);
	      }
	    ArrayList<Integer> myNumbers = new ArrayList<Integer>();
	    myNumbers.add(10);
	    myNumbers.add(15);
	    myNumbers.add(20);
	    myNumbers.add(25);
	    for (int i : myNumbers) {
	      System.out.println(i);
	    }
	    //Sort an ArrayList of Strings:
	    Collections.sort(cars);  // Sort cars
	    for (String i : cars) {
	      System.out.println(i);
	    }
	    //Sort an ArrayList of Integers:
	    Collections.sort(myNumbers);  // Sort myNumbers

	    for (int i : myNumbers) {
	      System.out.println(i);
	    }
	    var Numbers=new ArrayList<Integer>();
	    // or var Numbers=new ArrayList<>();
	    Numbers.add(1);
	    Numbers.add(2);
	    Numbers.add(3);
	    Numbers.add(4);
	    Numbers.add(5);
	    System.out.println(Numbers);
	    System.out.println(Numbers.getClass().getName());
	    
	}

}
