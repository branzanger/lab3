import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {


  @Test
  public void emptyArray(){
    int[] input = new int[0];
    ArrayExamples.reverseInPlace(input);
    assertArrayEquals(input, input);
  }

	@Test 
	public void testReverseInPlace() {
    int[] input = { 3 };
    ArrayExamples.reverseInPlace(input);
    assertArrayEquals(new int[]{ 3 }, input);
	}


  @Test
  public void testReversedEven() {
    int[] input = {1, 2, 3, 4};
    int[] output = {4, 3, 2, 1};
    assertArrayEquals(output, ArrayExamples.reversed(input));
  }
  @Test
  public void testReversedOdd() {
    int[] input = {1, 2, 3, 4, 5};
    int[] output = {5, 4, 3, 2, 1};
    assertArrayEquals(output, ArrayExamples.reversed(input));
  }
}
