
import java.util.*;


public class DemoMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Define basic variables 
		ArrayList<String> testList = new ArrayList<String>();
		StaticDemoObject testObj01 = new StaticDemoObject("Hello", "World", 55);
		StaticDemoObject testObj02 = new StaticDemoObject("Hello", "World", 55);
		StaticDemoObject testObj03 = new StaticDemoObject("Hello", "World", 57);
		StaticDemoObject testObj04 = testObj03.copy();
		
		// build some content 
		testList.add("String 2");
		testList.add("String 4");
		testList.add("String 3");
		testList.add("String 1");
		
		System.out.println("**********************************");
		System.out.println("**********************************");
		System.out.println("**********************************");
		
		// cycle through the unsorted list
		for (int i = 0; i < testList.size(); i++)
		{
			System.out.println(testList.get(i));
		}
		
		// sort the list 
		Collections.sort(testList);
		
		// cycle through the sorted list
		for (int i = 0; i < testList.size(); i++)
		{
			System.out.println(testList.get(i));
		}
		
		
		System.out.println(testObj01.getInstanceCount());
		System.out.println(StaticDemoObject.testStaticMethod(10));
		System.out.println(testObj03.toString());
		
		if (testObj03.equals(testObj04))
			System.out.println("yes");
		else
			System.out.println("no");

		
		

	}

}
