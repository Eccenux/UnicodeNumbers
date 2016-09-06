/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unicodenumbers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.core.Is.*;
import static org.hamcrest.core.IsNot.*;

/**
 *
 * @author Maciej Nux Jaros
 */
public class PositiveCircleFormatterTest {
	private static final int inRangeLowNumber = 10;
	private static final int inRangeHighNumber = 45;
	private static final int outOfRangeLongNumber = 100;

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
		System.out.println("format length");
		int number = 0;
		PositiveCircleFormatter instance = new PositiveCircleFormatter();
		assertThat("lenght", instance.format(inRangeLowNumber).length(), is(1));
		assertThat("lenght", instance.format(inRangeHighNumber).length(), is(1));
		assertThat("lenght", instance.format(outOfRangeLongNumber).length(), is(not(1)));
	}

}
