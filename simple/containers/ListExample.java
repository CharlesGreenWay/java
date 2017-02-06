import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		// A generic list for storing Integers, newer syntax
		List<Integer> integers = new ArrayList<>(4);
		integers.add(1);
		integers.add(2);
		integers.add(3);
		integers.add(4);
		
		System.out.println(integers);
		
		// A generic list for storing Integers, older syntax
		integers = new ArrayList<Integer>(4);
		integers.add(5);
		integers.add(6);
		integers.add(7);
		integers.add(8);
		
		System.out.println(integers);
		
		// A list for storing anything.. pre-generic code. Not recommended unless targeting Java 1.4 or older.
		// This will trigger various warnings about type safety.
		// A VERY BAD IDEA, IN GENERAL.
		List oldStyleList = new ArrayList();
		oldStyleList.add("String");
		oldStyleList.add(4);
		
		System.out.println(oldStyleList);
	}
}
