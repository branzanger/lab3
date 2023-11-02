import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class ArrayTests {


	@Test
	public void emptyArray(){
		int[] input = new int[0];
		ArrayExamples.reverseInPlace(input);
		assertArrayEquals(input, input);
	}

	@Test 
	public void testReverseInPlace() {
		int[] input = {3, 5, 6};
		ArrayExamples.reverseInPlace(input);
		assertArrayEquals(new int[]{6, 5, 3}, input);
	}

	//@Test
	public void testReversedEven() {
		int[] input = {1, 2, 3, 4};
		int[] output = {4, 3, 2, 1};
		assertArrayEquals(output, ArrayExamples.reversed(input));
	}
	//@Test
	public void testReversedOdd() {
		int[] input = {1, 2, 3, 4, 5};
		int[] output = {5, 4, 3, 2, 1};
		assertArrayEquals(output, ArrayExamples.reversed(input));
	}
	//@Test
	public void testReversedInPlaceEven() {
		int[] input = {1, 2, 3, 4};
		int[] output = {4, 3, 2, 1};
		ArrayExamples.reverseInPlace(input);
		assertArrayEquals(output, input);
	}
	//@Test
	public void testReversedInPlaceOdd() {
		int[] input = {1, 2, 3, 4, 5};
		int[] output = {5, 4, 3, 2, 1};
		ArrayExamples.reverseInPlace(input);
		assertArrayEquals(output, input);
	}
	
	// @Test
	// public void listFilter(){
	// 	List<String> input = new ArrayList<>(Arrays.asList("Test", "test", "Lol" , "lol"));
	// 	List<String> output = new ArrayList<>(Arrays.asList("test", "lol" ));
		

	// 	StringChecker sc = new StringCheckLower();
	// 	assertArrayEquals(output.toArray(), ListExamples.filter(input, sc).toArray());
	// }
	
	// @Test
	// public void listMerge(){
	// 	List<String> input1 = new ArrayList<>(Arrays.asList("a", "c", "e" ));
	// 	List<String> input2 = new ArrayList<>(Arrays.asList("b", "d", "f" ));
	// 	List<String> output = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e", "f"));

	// 	assertArrayEquals(output.toArray(), ListExamples.merge(input1, input2).toArray());
	// }
}
