package unicodenumbers;

/**
 * Outputs numbers in a negative (dark/full) circle.
 * 
 * @author Maciej Nux Jaros
 */
public class NegativeCircleFomatter extends PositiveCircleFormatter {

	private static final int minNumber = 0;
	private static final int maxNumber = 20;

	/**
	 * @return the minNumber
	 */
	@Override
	public int getMinNumber() {
		return minNumber;
	}
	/**
	 * @return the maxNumber
	 */
	@Override
	public int getMaxNumber() {
		return maxNumber;
	}

	@Override
	public String format(int number) {
		if (isSingleCharacter(number)) {
			if (number >= 1 && number <= 10) {
				return unicode(0x278A + number - 1);
			} else if (number >= 11 && number <= 20) {
				return unicode(0x24EB + number - 11);
			}
		}

		return String.format("%d", number);
	}

}
