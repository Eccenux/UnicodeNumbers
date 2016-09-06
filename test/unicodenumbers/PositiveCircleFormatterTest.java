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
public class PositiveCircleFormatterTest {
	private static final int inRangeLowNumber = 10;
	private static final int inRangeHighNumber = 45;
	private static final int outOfRangeLongNumber = 100;

	// edge cases (start-end for every range + some extra)
	// number -> expected character
	private static final Map<Integer, String> edgeCasesMap = new HashMap<Integer, String>() {{
		put(0, "\u24EA");	// 0
		put(1, "\u2460");	// 1-20
		put(2, "\u2461");
		put(20, "\u2473");
		put(21, "\u3251");	// 21-35
		put(22, "\u3252");
		put(35, "\u325F");
		put(36, "\u32B1");	// 36-50
		put(37, "\u32B2");
		put(49, "\u32BE");
		put(50, "\u32BF");
	}};

	public PositiveCircleFormatterTest() {

	}

	/**
	 * Test of isSingleCharacter method.
	 */
	@Test
	public void testIsSingleCharacter() {
		System.out.println("isSingleCharacter");
		PositiveCircleFormatter instance = new PositiveCircleFormatter();
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
		PositiveCircleFormatter instance = new PositiveCircleFormatter();
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
		PositiveCircleFormatter instance = new PositiveCircleFormatter();
		for (Map.Entry<Integer, String> entry : edgeCasesMap.entrySet()) {
			assertThat(instance.format(entry.getKey()), is(entry.getValue()));
		}
	}
}
