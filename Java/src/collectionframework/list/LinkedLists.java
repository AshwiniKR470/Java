package collectionframework.list;
//Import the LinkedList class
import java.util.LinkedList;
public class LinkedLists {

	public static void main(String[] args) {
		LinkedList<String> cars = new LinkedList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    System.out.println(cars);
	    // Use addFirst() to add the item to the beginning
	    cars.addFirst("Mazda");
	    System.out.println(cars);
	    // Use addLast() to add the item to the end
	    cars.addLast("Mazda");
	    System.out.println(cars);
	    // Use removeFirst() remove the first item from the list
	    cars.removeFirst();
	    System.out.println(cars);
	    // Use removeLast() remove the last item from the list
	    cars.removeLast();
	    System.out.println(cars);
	    // Use getFirst() to display the first item in the list
	    System.out.println(cars.getFirst());
	    // Use getLast() to display the last item in the list
	    System.out.println(cars.getLast());
	    var Numbers = new LinkedList<Integer>();
	    Numbers.add(1);
	    Numbers.add(2);
	    Numbers.add(3);
	    Numbers.add(4);
	    System.out.println(Numbers);
	    Numbers.addFirst(10);
	    System.out.println(Numbers);
	    Numbers.addLast(20);
	    System.out.println(Numbers);
	    Numbers.removeFirst();
	    System.out.println(Numbers);
	    Numbers.removeLast();
	    System.out.println(Numbers);
	    System.out.println(Numbers.getFirst());
	    System.out.println(Numbers.getLast());
	    System.out.println(Numbers);
	}

}
