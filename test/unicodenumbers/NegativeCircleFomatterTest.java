package unicodenumbers;

import java.util.HashMap;
import java.util.Map;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

/**
 *
 * @author Maciej Nux Jaros
 */
public class NegativeCircleFomatterTest {
	private static final int inRangeLowNumber = 5;
	private static final int inRangeHighNumber = 15;
	private static final int outOfRangeLongNumber = 100;

	// edge cases (start-end for every range + some extra)
	// number -> expected character
	private static final Map<Integer, String> edgeCasesMap = new HashMap<Integer, String>() {{
		put(1, "\u278A");	// 1-10
		put(2, "\u278B");
		put(10, "\u2793");
		put(11, "\u24EB");	// 11-20
		put(12, "\u24EC");
		put(20, "\u24F4");
	}};

	public NegativeCircleFomatterTest() {
	}

	/**
	 * Test of isSingleCharacter method.
	 */
	@Test
	public void testIsSingleCharacter() {
		System.out.println("isSingleCharacter");
		NegativeCircleFomatter instance = new NegativeCircleFomatter();
		assertThat(instance.isSingleCharacter(inRangeLowNumber), is(true));
		assertThat(instance.isSingleCharacter(inRangeHighNumber), is(true));
		assertThat(instance.isSingleCharacter(outOfRangeLongNumber), is(false));
	}

	/**
	 * Check length of string returned from the format method.
	 */
	@Test
	public void testFormatLength() {
		System.out.println("format - length");
		NegativeCircleFomatter instance = new NegativeCircleFomatter();
		assertThat("lenght", instance.format(inRangeLowNumber).length(), is(1));
		assertThat("lenght", instance.format(inRangeHighNumber).length(), is(1));
		assertThat("lenght", instance.format(outOfRangeLongNumber).length(), is(not(1)));
	}

	/**
	 * Test edge cases for the format method.
	 */
	@Test
	public void testFormatEdgeCharcters() {
		System.out.println("format - edge cases");
		NegativeCircleFomatter instance = new NegativeCircleFomatter();
		for (Map.Entry<Integer, String> entry : edgeCasesMap.entrySet()) {
			assertThat(instance.format(entry.getKey()), is(entry.getValue()));
		}
	}
}
