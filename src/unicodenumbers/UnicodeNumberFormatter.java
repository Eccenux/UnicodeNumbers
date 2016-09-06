package unicodenumbers;

/**
 * Abstract formatter (number to unicode converter).
 *
 * @author Maciej Nux Jaros
 */
abstract class UnicodeNumberFormatter {
	abstract public int getMinNumber();
	abstract public int getMaxNumber();

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
