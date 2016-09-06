package unicodenumbers;

/**
 * Abstract formatter (number to unicode converter).
 *
 * @author Maciej Nux Jaros
 */
abstract class UnicodeNumberFormatter {
	protected int minNumber = 0;
	protected int maxNumber = 20;

	/**
	 * @return the minNumber
	 */
	public int getMinNumber() {
		return minNumber;
	}
	/**
	 * @return the maxNumber
	 */
	public int getMaxNumber() {
		return maxNumber;
	}

	/**
	 * Format supplied number.
	 *
	 * @param number Number to format.
	 * @return Single unicode character if possible, parsed int otherwise.
	 */
	abstract public String format (int number);

	protected String unicode(int hex) {
		return Character.toString((char)hex);
	}

	public boolean isSingleCharacter(int number) {
		return number >= getMinNumber() && number <= getMaxNumber();
	}
}
